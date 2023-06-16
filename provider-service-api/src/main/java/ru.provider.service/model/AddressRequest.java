package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * AddressRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AddressRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("country")
  private String country;

  @JsonProperty("city")
  private String city;

  @JsonProperty("street")
  private String street;

  @JsonProperty("apartment")
  private String apartment;

  public AddressRequest id(UUID id) {
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

  public AddressRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressRequest street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  
  @Schema(name = "street", required = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddressRequest apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

  /**
   * Get apartment
   * @return apartment
  */
  
  @Schema(name = "apartment", required = false)
  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRequest addressRequest = (AddressRequest) o;
    return Objects.equals(this.id, addressRequest.id) &&
        Objects.equals(this.country, addressRequest.country) &&
        Objects.equals(this.city, addressRequest.city) &&
        Objects.equals(this.street, addressRequest.street) &&
        Objects.equals(this.apartment, addressRequest.apartment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, country, city, street, apartment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    apartment: ").append(toIndentedString(apartment)).append("\n");
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

