package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * ContactRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContactRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("messengers")
  @Valid
  private List<MessengerRequest> messengers = null;

  public ContactRequest id(UUID id) {
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

  public ContactRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ContactRequest messengers(List<MessengerRequest> messengers) {
    this.messengers = messengers;
    return this;
  }

  public ContactRequest addMessengersItem(MessengerRequest messengersItem) {
    if (this.messengers == null) {
      this.messengers = new ArrayList<>();
    }
    this.messengers.add(messengersItem);
    return this;
  }

  /**
   * Get messengers
   * @return messengers
  */
  @Valid 
  @Schema(name = "messengers", required = false)
  public List<MessengerRequest> getMessengers() {
    return messengers;
  }

  public void setMessengers(List<MessengerRequest> messengers) {
    this.messengers = messengers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRequest contactRequest = (ContactRequest) o;
    return Objects.equals(this.id, contactRequest.id) &&
        Objects.equals(this.email, contactRequest.email) &&
        Objects.equals(this.phone, contactRequest.phone) &&
        Objects.equals(this.messengers, contactRequest.messengers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, phone, messengers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    messengers: ").append(toIndentedString(messengers)).append("\n");
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

