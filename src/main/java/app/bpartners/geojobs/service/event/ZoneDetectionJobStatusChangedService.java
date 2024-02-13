package app.bpartners.geojobs.service.event;

import static app.bpartners.geojobs.model.exception.ApiException.ExceptionType.SERVER_EXCEPTION;

import app.bpartners.geojobs.endpoint.event.gen.ZoneDetectionJobStatusChanged;
import app.bpartners.geojobs.model.exception.ApiException;
import app.bpartners.geojobs.repository.model.detection.ZoneDetectionJob;
import app.bpartners.geojobs.service.detection.DetectionFinishedMailer;
import app.bpartners.geojobs.service.detection.ZoneDetectionJobService;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ZoneDetectionJobStatusChangedService
    implements Consumer<ZoneDetectionJobStatusChanged> {
  private final DetectionFinishedMailer mailer;
  private final ZoneDetectionJobService zoneDetectionJobService;

  @Override
  public void accept(ZoneDetectionJobStatusChanged event) {
    var oldJob = event.getOldJob();
    var oldStatus = oldJob.getStatus();
    var oldProgression = oldStatus.getProgression();

    var newJob = event.getNewJob();
    var newStatus = newJob.getStatus();
    var newProgression = newStatus.getProgression();
    var newHealth = newStatus.getHealth();

    if (oldStatus.equals(newStatus)) {
      log.warn("Status did not change, yet change event received: event=" + event);
      return;
    }

    var illegalFinishedMessage = "Cannot finish as unknown, event=" + event;
    var notFinishedMessage = "Not finished yet, nothing to do, event=" + event;
    var doNothingMessage = "Old job already finished, do nothing";
    var message =
            switch (oldProgression) {
              case PENDING, PROCESSING -> switch (newProgression) {
                case FINISHED -> switch (newHealth) {
                  case UNKNOWN -> throw new IllegalStateException(illegalFinishedMessage);
                  case SUCCEEDED -> handleFinishedJob(newJob);
                  case FAILED -> throw new ApiException(SERVER_EXCEPTION, "Failed to process zdj=" + newJob);
                };
                case PENDING, PROCESSING -> notFinishedMessage;
              };
              case FINISHED -> doNothingMessage;
            };
    log.info(message);
  }
  private String handleFinishedJob(ZoneDetectionJob zdj) {
    mailer.accept(zdj);
    zoneDetectionJobService.handleInDoubtObjects(zdj);
    return "Finished, mail sent, zdj=" + zdj;
  }
}
