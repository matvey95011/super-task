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
 * ContactResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContactResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("messengers")
  @Valid
  private List<MessengerResponse> messengers = null;

  public ContactResponse id(UUID id) {
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

  public ContactResponse email(String email) {
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

  public ContactResponse phone(String phone) {
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

  public ContactResponse messengers(List<MessengerResponse> messengers) {
    this.messengers = messengers;
    return this;
  }

  public ContactResponse addMessengersItem(MessengerResponse messengersItem) {
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
  public List<MessengerResponse> getMessengers() {
    return messengers;
  }

  public void setMessengers(List<MessengerResponse> messengers) {
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
    ContactResponse contactResponse = (ContactResponse) o;
    return Objects.equals(this.id, contactResponse.id) &&
        Objects.equals(this.email, contactResponse.email) &&
        Objects.equals(this.phone, contactResponse.phone) &&
        Objects.equals(this.messengers, contactResponse.messengers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, phone, messengers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponse {\n");
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

