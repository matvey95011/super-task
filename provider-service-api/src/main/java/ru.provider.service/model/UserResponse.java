package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * UserResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UserResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("accountId")
  private UUID accountId;

  @JsonProperty("account")
  private AccountResponse account;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("snils")
  private String snils;

  @JsonProperty("inn")
  private String inn;

  @JsonProperty("passport")
  private PassportResponse passport;

  @JsonProperty("address")
  private AddressResponse address;

  @JsonProperty("contacts")
  @Valid
  private List<ContactResponse> contacts = null;

  @JsonProperty("dateOfBirth")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  @JsonProperty("alive")
  private Boolean alive;

  @JsonProperty("gender")
  private Gender gender;

  public UserResponse id(UUID id) {
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

  public UserResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @Valid 
  @Schema(name = "accountId", required = false)
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public UserResponse account(AccountResponse account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @Valid 
  @Schema(name = "account", required = false)
  public AccountResponse getAccount() {
    return account;
  }

  public void setAccount(AccountResponse account) {
    this.account = account;
  }

  public UserResponse firstName(String firstName) {
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

  public UserResponse lastName(String lastName) {
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

  public UserResponse middleName(String middleName) {
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

  public UserResponse snils(String snils) {
    this.snils = snils;
    return this;
  }

  /**
   * Get snils
   * @return snils
  */
  
  @Schema(name = "snils", required = false)
  public String getSnils() {
    return snils;
  }

  public void setSnils(String snils) {
    this.snils = snils;
  }

  public UserResponse inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  
  @Schema(name = "inn", required = false)
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public UserResponse passport(PassportResponse passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
  */
  @Valid 
  @Schema(name = "passport", required = false)
  public PassportResponse getPassport() {
    return passport;
  }

  public void setPassport(PassportResponse passport) {
    this.passport = passport;
  }

  public UserResponse address(AddressResponse address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public AddressResponse getAddress() {
    return address;
  }

  public void setAddress(AddressResponse address) {
    this.address = address;
  }

  public UserResponse contacts(List<ContactResponse> contacts) {
    this.contacts = contacts;
    return this;
  }

  public UserResponse addContactsItem(ContactResponse contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  */
  @Valid 
  @Schema(name = "contacts", required = false)
  public List<ContactResponse> getContacts() {
    return contacts;
  }

  public void setContacts(List<ContactResponse> contacts) {
    this.contacts = contacts;
  }

  public UserResponse dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @Valid 
  @Schema(name = "dateOfBirth", required = false)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public UserResponse alive(Boolean alive) {
    this.alive = alive;
    return this;
  }

  /**
   * Get alive
   * @return alive
  */
  
  @Schema(name = "alive", required = false)
  public Boolean isAlive() {
    return alive;
  }

  public void setAlive(Boolean alive) {
    this.alive = alive;
  }

  public UserResponse gender(Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @Valid 
  @Schema(name = "gender", required = false)
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.id, userResponse.id) &&
        Objects.equals(this.accountId, userResponse.accountId) &&
        Objects.equals(this.account, userResponse.account) &&
        Objects.equals(this.firstName, userResponse.firstName) &&
        Objects.equals(this.lastName, userResponse.lastName) &&
        Objects.equals(this.middleName, userResponse.middleName) &&
        Objects.equals(this.snils, userResponse.snils) &&
        Objects.equals(this.inn, userResponse.inn) &&
        Objects.equals(this.passport, userResponse.passport) &&
        Objects.equals(this.address, userResponse.address) &&
        Objects.equals(this.contacts, userResponse.contacts) &&
        Objects.equals(this.dateOfBirth, userResponse.dateOfBirth) &&
        Objects.equals(this.alive, userResponse.alive) &&
        Objects.equals(this.gender, userResponse.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, account, firstName, lastName, middleName, snils, inn, passport, address, contacts, dateOfBirth, alive, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    snils: ").append(toIndentedString(snils)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

