package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * TransactionFilterRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TransactionFilterRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("accountIds")
  @Valid
  private List<UUID> accountIds = null;

  @JsonProperty("userIds")
  @Valid
  private List<UUID> userIds = null;

  @JsonProperty("balanceMin")
  private BigDecimal balanceMin;

  @JsonProperty("balanceMax")
  private BigDecimal balanceMax;

  @JsonProperty("dateFrom")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant dateFrom;

  @JsonProperty("dateTo")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant dateTo;

  @JsonProperty("statuses")
  @Valid
  private List<String> statuses = null;

  @JsonProperty("operationTypes")
  @Valid
  private List<String> operationTypes = null;

  public TransactionFilterRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public TransactionFilterRequest addAccountIdsItem(UUID accountIdsItem) {
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

  public TransactionFilterRequest userIds(List<UUID> userIds) {
    this.userIds = userIds;
    return this;
  }

  public TransactionFilterRequest addUserIdsItem(UUID userIdsItem) {
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

  public TransactionFilterRequest balanceMin(BigDecimal balanceMin) {
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

  public TransactionFilterRequest balanceMax(BigDecimal balanceMax) {
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

  public TransactionFilterRequest dateFrom(Instant dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  @Valid 
  @Schema(name = "dateFrom", required = false)
  public Instant getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Instant dateFrom) {
    this.dateFrom = dateFrom;
  }

  public TransactionFilterRequest dateTo(Instant dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Get dateTo
   * @return dateTo
  */
  @Valid 
  @Schema(name = "dateTo", required = false)
  public Instant getDateTo() {
    return dateTo;
  }

  public void setDateTo(Instant dateTo) {
    this.dateTo = dateTo;
  }

  public TransactionFilterRequest statuses(List<String> statuses) {
    this.statuses = statuses;
    return this;
  }

  public TransactionFilterRequest addStatusesItem(String statusesItem) {
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

  public TransactionFilterRequest operationTypes(List<String> operationTypes) {
    this.operationTypes = operationTypes;
    return this;
  }

  public TransactionFilterRequest addOperationTypesItem(String operationTypesItem) {
    if (this.operationTypes == null) {
      this.operationTypes = new ArrayList<>();
    }
    this.operationTypes.add(operationTypesItem);
    return this;
  }

  /**
   * Get operationTypes
   * @return operationTypes
  */
  
  @Schema(name = "operationTypes", required = false)
  public List<String> getOperationTypes() {
    return operationTypes;
  }

  public void setOperationTypes(List<String> operationTypes) {
    this.operationTypes = operationTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFilterRequest transactionFilterRequest = (TransactionFilterRequest) o;
    return Objects.equals(this.accountIds, transactionFilterRequest.accountIds) &&
        Objects.equals(this.userIds, transactionFilterRequest.userIds) &&
        Objects.equals(this.balanceMin, transactionFilterRequest.balanceMin) &&
        Objects.equals(this.balanceMax, transactionFilterRequest.balanceMax) &&
        Objects.equals(this.dateFrom, transactionFilterRequest.dateFrom) &&
        Objects.equals(this.dateTo, transactionFilterRequest.dateTo) &&
        Objects.equals(this.statuses, transactionFilterRequest.statuses) &&
        Objects.equals(this.operationTypes, transactionFilterRequest.operationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, userIds, balanceMin, balanceMax, dateFrom, dateTo, statuses, operationTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFilterRequest {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    balanceMin: ").append(toIndentedString(balanceMin)).append("\n");
    sb.append("    balanceMax: ").append(toIndentedString(balanceMax)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
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

