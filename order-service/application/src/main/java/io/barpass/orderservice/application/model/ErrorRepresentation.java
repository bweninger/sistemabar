package io.barpass.orderservice.application.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Standard tmf error representation
 */
@ApiModel(description = "Standard tmf error representation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")




public class ErrorRepresentation   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("referenceError")
  private String referenceError = null;

  public ErrorRepresentation code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Application related code (as defined in the API or from a common list)
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Application related code (as defined in the API or from a common list)")
  @NotNull


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorRepresentation reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Text that explains the reason for error. This can be shown to a client user.
   * @return reason
  **/
  @ApiModelProperty(value = "Text that explains the reason for error. This can be shown to a client user.")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorRepresentation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Text that provides more details and corrective actions related to the error. This can be shown to a client user.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Text that provides more details and corrective actions related to the error. This can be shown to a client user.")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorRepresentation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * http error code extension like 400-2
   * @return status
  **/
  @ApiModelProperty(value = "http error code extension like 400-2")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorRepresentation referenceError(String referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * url pointing to documentation describing the error
   * @return referenceError
  **/
  @ApiModelProperty(value = "url pointing to documentation describing the error")


  public String getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorRepresentation errorRepresentation = (ErrorRepresentation) o;
    return Objects.equals(this.code, errorRepresentation.code) &&
        Objects.equals(this.reason, errorRepresentation.reason) &&
        Objects.equals(this.message, errorRepresentation.message) &&
        Objects.equals(this.status, errorRepresentation.status) &&
        Objects.equals(this.referenceError, errorRepresentation.referenceError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, message, status, referenceError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorRepresentation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

