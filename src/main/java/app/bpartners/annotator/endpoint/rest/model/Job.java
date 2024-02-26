/*
 * Image Annotation API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: latest
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package app.bpartners.annotator.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Job */
@JsonPropertyOrder({
  Job.JSON_PROPERTY_TASK_STATISTICS,
  Job.JSON_PROPERTY_TYPE,
  Job.JSON_PROPERTY_ID,
  Job.JSON_PROPERTY_NAME,
  Job.JSON_PROPERTY_BUCKET_NAME,
  Job.JSON_PROPERTY_FOLDER_PATH,
  Job.JSON_PROPERTY_OWNER_EMAIL,
  Job.JSON_PROPERTY_STATUS,
  Job.JSON_PROPERTY_TEAM_ID,
  Job.JSON_PROPERTY_LABELS
})
@javax.annotation.processing.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-02-26T18:28:50.570918+01:00[Europe/Paris]")
public class Job implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TASK_STATISTICS = "taskStatistics";
  private TaskStatistics taskStatistics;

  public static final String JSON_PROPERTY_TYPE = "type";
  private JobType type;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucketName";
  private String bucketName;

  public static final String JSON_PROPERTY_FOLDER_PATH = "folderPath";
  private String folderPath;

  public static final String JSON_PROPERTY_OWNER_EMAIL = "ownerEmail";
  private String ownerEmail;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JobStatus status;

  public static final String JSON_PROPERTY_TEAM_ID = "teamId";
  private String teamId;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<Label> labels = null;

  public Job taskStatistics(TaskStatistics taskStatistics) {
    this.taskStatistics = taskStatistics;
    return this;
  }

  /**
   * Get taskStatistics
   *
   * @return taskStatistics
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TaskStatistics getTaskStatistics() {
    return taskStatistics;
  }

  @JsonProperty(JSON_PROPERTY_TASK_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskStatistics(TaskStatistics taskStatistics) {
    this.taskStatistics = taskStatistics;
  }

  public Job type(JobType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JobType getType() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(JobType type) {
    this.type = type;
  }

  public Job id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  public Job name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public Job bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Get bucketName
   *
   * @return bucketName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBucketName() {
    return bucketName;
  }

  @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public Job folderPath(String folderPath) {
    this.folderPath = folderPath;
    return this;
  }

  /**
   * Get folderPath
   *
   * @return folderPath
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFolderPath() {
    return folderPath;
  }

  @JsonProperty(JSON_PROPERTY_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderPath(String folderPath) {
    this.folderPath = folderPath;
  }

  public Job ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * Get ownerEmail
   *
   * @return ownerEmail
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwnerEmail() {
    return ownerEmail;
  }

  @JsonProperty(JSON_PROPERTY_OWNER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public Job status(JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JobStatus getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(JobStatus status) {
    this.status = status;
  }

  public Job teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   *
   * @return teamId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamId() {
    return teamId;
  }

  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public Job labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public Job addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   *
   * @return labels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Label> getLabels() {
    return labels;
  }

  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  /** Return true if this Job object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.taskStatistics, job.taskStatistics)
        && Objects.equals(this.type, job.type)
        && Objects.equals(this.id, job.id)
        && Objects.equals(this.name, job.name)
        && Objects.equals(this.bucketName, job.bucketName)
        && Objects.equals(this.folderPath, job.folderPath)
        && Objects.equals(this.ownerEmail, job.ownerEmail)
        && Objects.equals(this.status, job.status)
        && Objects.equals(this.teamId, job.teamId)
        && Objects.equals(this.labels, job.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        taskStatistics, type, id, name, bucketName, folderPath, ownerEmail, status, teamId, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    taskStatistics: ").append(toIndentedString(taskStatistics)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}