package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * PassportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PassportRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("seria")
  private String seria;

  @JsonProperty("number")
  private String number;

  @JsonProperty("departmentName")
  private String departmentName;

  @JsonProperty("departmentNumber")
  private String departmentNumber;

  @JsonProperty("address")
  private AddressRequest address;

  public PassportRequest id(UUID id) {
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

  public PassportRequest seria(String seria) {
    this.seria = seria;
    return this;
  }

  /**
   * Get seria
   * @return seria
  */
  
  @Schema(name = "seria", required = false)
  public String getSeria() {
    return seria;
  }

  public void setSeria(String seria) {
    this.seria = seria;
  }

  public PassportRequest number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", required = false)
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PassportRequest departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  */
  
  @Schema(name = "departmentName", required = false)
  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public PassportRequest departmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
    return this;
  }

  /**
   * Get departmentNumber
   * @return departmentNumber
  */
  
  @Schema(name = "departmentNumber", required = false)
  public String getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
  }

  public PassportRequest address(AddressRequest address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public AddressRequest getAddress() {
    return address;
  }

  public void setAddress(AddressRequest address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportRequest passportRequest = (PassportRequest) o;
    return Objects.equals(this.id, passportRequest.id) &&
        Objects.equals(this.seria, passportRequest.seria) &&
        Objects.equals(this.number, passportRequest.number) &&
        Objects.equals(this.departmentName, passportRequest.departmentName) &&
        Objects.equals(this.departmentNumber, passportRequest.departmentNumber) &&
        Objects.equals(this.address, passportRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seria, number, departmentName, departmentNumber, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seria: ").append(toIndentedString(seria)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    departmentNumber: ").append(toIndentedString(departmentNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
