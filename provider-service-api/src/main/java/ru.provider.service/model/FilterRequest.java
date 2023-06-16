package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * FilterRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FilterRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("accountIds")
  @Valid
  private List<UUID> accountIds = null;

  @JsonProperty("userIds")
  @Valid
  private List<UUID> userIds = null;

  @JsonProperty("login")
  private String login;

  @JsonProperty("email")
  private String email;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("balanceMin")
  private BigDecimal balanceMin;

  @JsonProperty("balanceMax")
  private BigDecimal balanceMax;

  @JsonProperty("createDateFrom")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createDateFrom;

  @JsonProperty("createDateTo")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createDateTo;

  @JsonProperty("statuses")
  @Valid
  private List<String> statuses = null;

  @JsonProperty("pageSize")
  private Integer pageSize = 10;

  @JsonProperty("pageNumber")
  private Integer pageNumber = 0;

  @JsonProperty("sort")
  @Valid
  private List<String> sort = null;

  public FilterRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public FilterRequest addAccountIdsItem(UUID accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * Get accountIds
   * @return accountIds
  */
  @Valid 
  @Schema(name = "accountIds", required = false)
  public List<UUID> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
  }

  public FilterRequest userIds(List<UUID> userIds) {
    this.userIds = userIds;
    return this;
  }

  public FilterRequest addUserIdsItem(UUID userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * Get userIds
   * @return userIds
  */
  @Valid 
  @Schema(name = "userIds", required = false)
  public List<UUID> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<UUID> userIds) {
    this.userIds = userIds;
  }

  public FilterRequest login(String login) {
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

  public FilterRequest email(String email) {
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

  public FilterRequest age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "age", required = false)
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public FilterRequest balanceMin(BigDecimal balanceMin) {
    this.balanceMin = balanceMin;
    return this;
  }

  /**
   * Get balanceMin
   * @return balanceMin
  */
  @Valid 
  @Schema(name = "balanceMin", required = false)
  public BigDecimal getBalanceMin() {
    return balanceMin;
  }

  public void setBalanceMin(BigDecimal balanceMin) {
    this.balanceMin = balanceMin;
  }

  public FilterRequest balanceMax(BigDecimal balanceMax) {
    this.balanceMax = balanceMax;
    return this;
  }

  /**
   * Get balanceMax
   * @return balanceMax
  */
  @Valid 
  @Schema(name = "balanceMax", required = false)
  public BigDecimal getBalanceMax() {
    return balanceMax;
  }

  public void setBalanceMax(BigDecimal balanceMax) {
    this.balanceMax = balanceMax;
  }

  public FilterRequest createDateFrom(LocalDate createDateFrom) {
    this.createDateFrom = createDateFrom;
    return this;
  }

  /**
   * Get createDateFrom
   * @return createDateFrom
  */
  @Valid 
  @Schema(name = "createDateFrom", required = false)
  public LocalDate getCreateDateFrom() {
    return createDateFrom;
  }

  public void setCreateDateFrom(LocalDate createDateFrom) {
    this.createDateFrom = createDateFrom;
  }

  public FilterRequest createDateTo(LocalDate createDateTo) {
    this.createDateTo = createDateTo;
    return this;
  }

  /**
   * Get createDateTo
   * @return createDateTo
  */
  @Valid 
  @Schema(name = "createDateTo", required = false)
  public LocalDate getCreateDateTo() {
    return createDateTo;
  }

  public void setCreateDateTo(LocalDate createDateTo) {
    this.createDateTo = createDateTo;
  }

  public FilterRequest statuses(List<String> statuses) {
    this.statuses = statuses;
    return this;
  }

  public FilterRequest addStatusesItem(String statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  */
  
  @Schema(name = "statuses", required = false)
  public List<String> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<String> statuses) {
    this.statuses = statuses;
  }

  public FilterRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  
  @Schema(name = "pageSize", required = false)
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public FilterRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  
  @Schema(name = "pageNumber", required = false)
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public FilterRequest sort(List<String> sort) {
    this.sort = sort;
    return this;
  }

  public FilterRequest addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  
  @Schema(name = "sort", required = false)
  public List<String> getSort() {
    return sort;
  }

  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterRequest filterRequest = (FilterRequest) o;
    return Objects.equals(this.accountIds, filterRequest.accountIds) &&
        Objects.equals(this.userIds, filterRequest.userIds) &&
        Objects.equals(this.login, filterRequest.login) &&
        Objects.equals(this.email, filterRequest.email) &&
        Objects.equals(this.age, filterRequest.age) &&
        Objects.equals(this.balanceMin, filterRequest.balanceMin) &&
        Objects.equals(this.balanceMax, filterRequest.balanceMax) &&
        Objects.equals(this.createDateFrom, filterRequest.createDateFrom) &&
        Objects.equals(this.createDateTo, filterRequest.createDateTo) &&
        Objects.equals(this.statuses, filterRequest.statuses) &&
        Objects.equals(this.pageSize, filterRequest.pageSize) &&
        Objects.equals(this.pageNumber, filterRequest.pageNumber) &&
        Objects.equals(this.sort, filterRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, userIds, login, email, age, balanceMin, balanceMax, createDateFrom, createDateTo, statuses, pageSize, pageNumber, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterRequest {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    balanceMin: ").append(toIndentedString(balanceMin)).append("\n");
    sb.append("    balanceMax: ").append(toIndentedString(balanceMax)).append("\n");
    sb.append("    createDateFrom: ").append(toIndentedString(createDateFrom)).append("\n");
    sb.append("    createDateTo: ").append(toIndentedString(createDateTo)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

