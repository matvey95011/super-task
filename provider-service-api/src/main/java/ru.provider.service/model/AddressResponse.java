package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * AddressResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AddressResponse implements Serializable {

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

  public AddressResponse id(UUID id) {
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

  public AddressResponse country(String country) {
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

  public AddressResponse city(String city) {
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

  public AddressResponse street(String street) {
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

  public AddressResponse apartment(String apartment) {
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
    AddressResponse addressResponse = (AddressResponse) o;
    return Objects.equals(this.id, addressResponse.id) &&
        Objects.equals(this.country, addressResponse.country) &&
        Objects.equals(this.city, addressResponse.city) &&
        Objects.equals(this.street, addressResponse.street) &&
        Objects.equals(this.apartment, addressResponse.apartment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, country, city, street, apartment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResponse {\n");
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

