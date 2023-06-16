package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * CreateAccountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateAccountRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("login")
  private String login;

  @JsonProperty("password")
  private String password;

  @JsonProperty("userId")
  private UUID userId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  public CreateAccountRequest login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  */
  
  @Schema(name = "login", required = false)
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public CreateAccountRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", required = false)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateAccountRequest userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", required = false)
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public CreateAccountRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateAccountRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateAccountRequest middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  */
  
  @Schema(name = "middleName", required = false)
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.login, createAccountRequest.login) &&
        Objects.equals(this.password, createAccountRequest.password) &&
        Objects.equals(this.userId, createAccountRequest.userId) &&
        Objects.equals(this.firstName, createAccountRequest.firstName) &&
        Objects.equals(this.lastName, createAccountRequest.lastName) &&
        Objects.equals(this.middleName, createAccountRequest.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password, userId, firstName, lastName, middleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

