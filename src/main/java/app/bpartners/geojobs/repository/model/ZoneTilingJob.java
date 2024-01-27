package app.bpartners.geojobs.repository.model;

import static app.bpartners.geojobs.repository.model.JobType.TILING;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
@AllArgsConstructor
@ToString
@JsonIgnoreProperties({"status", "done"})
public class ZoneTilingJob extends ZoneJob<ZoneTilingTask> implements Serializable {
  @Override
  public JobType getJobType() {
    return TILING;
  }
}