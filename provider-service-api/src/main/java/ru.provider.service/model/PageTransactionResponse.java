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
 * PageTransactionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageTransactionResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("accountFrom")
  private AccountResponse accountFrom;

  @JsonProperty("accountTo")
  private AccountResponse accountTo;

  @JsonProperty("dateTransaction")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant dateTransaction;

  @JsonProperty("operationType")
  private String operationType;

  @JsonProperty("sum")
  private BigDecimal sum;

  @JsonProperty("description")
  private String description;

  @JsonProperty("statusTransaction")
  private String statusTransaction;

  @JsonProperty("pageSize")
  private Integer pageSize = 10;

  @JsonProperty("pageNumber")
  private Integer pageNumber = 0;

  @JsonProperty("sort")
  @Valid
  private List<String> sort = null;

  public PageTransactionResponse id(UUID id) {
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

  public PageTransactionResponse accountFrom(AccountResponse accountFrom) {
    this.accountFrom = accountFrom;
    return this;
  }

  /**
   * Get accountFrom
   * @return accountFrom
  */
  @Valid 
  @Schema(name = "accountFrom", required = false)
  public AccountResponse getAccountFrom() {
    return accountFrom;
  }

  public void setAccountFrom(AccountResponse accountFrom) {
    this.accountFrom = accountFrom;
  }

  public PageTransactionResponse accountTo(AccountResponse accountTo) {
    this.accountTo = accountTo;
    return this;
  }

  /**
   * Get accountTo
   * @return accountTo
  */
  @Valid 
  @Schema(name = "accountTo", required = false)
  public AccountResponse getAccountTo() {
    return accountTo;
  }

  public void setAccountTo(AccountResponse accountTo) {
    this.accountTo = accountTo;
  }

  public PageTransactionResponse dateTransaction(Instant dateTransaction) {
    this.dateTransaction = dateTransaction;
    return this;
  }

  /**
   * Get dateTransaction
   * @return dateTransaction
  */
  @Valid 
  @Schema(name = "dateTransaction", required = false)
  public Instant getDateTransaction() {
    return dateTransaction;
  }

  public void setDateTransaction(Instant dateTransaction) {
    this.dateTransaction = dateTransaction;
  }

  public PageTransactionResponse operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  */
  
  @Schema(name = "operationType", required = false)
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public PageTransactionResponse sum(BigDecimal sum) {
    this.sum = sum;
    return this;
  }

  /**
   * Get sum
   * @return sum
  */
  @Valid 
  @Schema(name = "sum", required = false)
  public BigDecimal getSum() {
    return sum;
  }

  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  public PageTransactionResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PageTransactionResponse statusTransaction(String statusTransaction) {
    this.statusTransaction = statusTransaction;
    return this;
  }

  /**
   * Get statusTransaction
   * @return statusTransaction
  */
  
  @Schema(name = "statusTransaction", required = false)
  public String getStatusTransaction() {
    return statusTransaction;
  }

  public void setStatusTransaction(String statusTransaction) {
    this.statusTransaction = statusTransaction;
  }

  public PageTransactionResponse pageSize(Integer pageSize) {
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

  public PageTransactionResponse pageNumber(Integer pageNumber) {
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

  public PageTransactionResponse sort(List<String> sort) {
    this.sort = sort;
    return this;
  }

  public PageTransactionResponse addSortItem(String sortItem) {
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
    PageTransactionResponse pageTransactionResponse = (PageTransactionResponse) o;
    return Objects.equals(this.id, pageTransactionResponse.id) &&
        Objects.equals(this.accountFrom, pageTransactionResponse.accountFrom) &&
        Objects.equals(this.accountTo, pageTransactionResponse.accountTo) &&
        Objects.equals(this.dateTransaction, pageTransactionResponse.dateTransaction) &&
        Objects.equals(this.operationType, pageTransactionResponse.operationType) &&
        Objects.equals(this.sum, pageTransactionResponse.sum) &&
        Objects.equals(this.description, pageTransactionResponse.description) &&
        Objects.equals(this.statusTransaction, pageTransactionResponse.statusTransaction) &&
        Objects.equals(this.pageSize, pageTransactionResponse.pageSize) &&
        Objects.equals(this.pageNumber, pageTransactionResponse.pageNumber) &&
        Objects.equals(this.sort, pageTransactionResponse.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountFrom, accountTo, dateTransaction, operationType, sum, description, statusTransaction, pageSize, pageNumber, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageTransactionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountFrom: ").append(toIndentedString(accountFrom)).append("\n");
    sb.append("    accountTo: ").append(toIndentedString(accountTo)).append("\n");
    sb.append("    dateTransaction: ").append(toIndentedString(dateTransaction)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statusTransaction: ").append(toIndentedString(statusTransaction)).append("\n");
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

