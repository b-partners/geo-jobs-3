package app.bpartners.geojobs.file;

import static java.io.File.createTempFile;

import java.io.File;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
import software.amazon.awssdk.services.s3.model.S3Object;
import software.amazon.awssdk.transfer.s3.model.DownloadFileRequest;
import software.amazon.awssdk.transfer.s3.model.FileDownload;

@Component
@AllArgsConstructor
// TODO: must be available from BucketComponent so update POJA BucketComponent
public class BucketCustomizedComponent {
  private final BucketConf bucketConf;

  public List<S3Object> listObjects(String bucketPath) {
    var s3Client = bucketConf.getS3Client();
    return s3Client.listObjects(ListObjectsRequest.builder().bucket(bucketPath).build()).contents();
  }

  public List<S3Object> listObjects(String bucket, String prefix) {
    var s3Client = bucketConf.getS3Client();
    return s3Client
        .listObjects(ListObjectsRequest.builder().bucket(bucket).prefix(prefix).build())
        .contents();
  }

  @SneakyThrows
  public File download(String bucketName, String bucketKey) {
    var destination =
        createTempFile(prefixFromBucketKey(bucketKey), suffixFromBucketKey(bucketKey));
    FileDownload download =
        bucketConf
            .getS3TransferManager()
            .downloadFile(
                DownloadFileRequest.builder()
                    .getObjectRequest(
                        GetObjectRequest.builder().bucket(bucketName).key(bucketKey).build())
                    .destination(destination)
                    .build());
    download.completionFuture().join();
    return destination;
  }

  private String prefixFromBucketKey(String bucketKey) {
    return lastNameSplitByDot(bucketKey)[0];
  }

  private String suffixFromBucketKey(String bucketKey) {
    var splitByDot = lastNameSplitByDot(bucketKey);
    return splitByDot.length == 1 ? "" : splitByDot[splitByDot.length - 1];
  }

  private String[] lastNameSplitByDot(String bucketKey) {
    var splitByDash = bucketKey.split("/");
    var lastName = splitByDash[splitByDash.length - 1];
    return lastName.split("\\.");
  }
}
