package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * UpdateAccountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateAccountRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("currentPassword")
  private String currentPassword;

  @JsonProperty("newPassword")
  private String newPassword;

  public UpdateAccountRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", required = false)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UpdateAccountRequest currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * Get currentPassword
   * @return currentPassword
  */
  
  @Schema(name = "currentPassword", required = false)
  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public UpdateAccountRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Get newPassword
   * @return newPassword
  */
  
  @Schema(name = "newPassword", required = false)
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) o;
    return Objects.equals(this.id, updateAccountRequest.id) &&
        Objects.equals(this.currentPassword, updateAccountRequest.currentPassword) &&
        Objects.equals(this.newPassword, updateAccountRequest.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, currentPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

