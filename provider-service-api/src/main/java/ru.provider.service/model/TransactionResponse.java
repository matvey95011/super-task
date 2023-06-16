package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

/**
 * TransactionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TransactionResponse implements Serializable {

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

  @JsonProperty("status")
  private String status;

  public TransactionResponse id(UUID id) {
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

  public TransactionResponse accountFrom(AccountResponse accountFrom) {
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

  public TransactionResponse accountTo(AccountResponse accountTo) {
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

  public TransactionResponse dateTransaction(Instant dateTransaction) {
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

  public TransactionResponse operationType(String operationType) {
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

  public TransactionResponse sum(BigDecimal sum) {
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

  public TransactionResponse description(String description) {
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

  public TransactionResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", required = false)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.id, transactionResponse.id) &&
        Objects.equals(this.accountFrom, transactionResponse.accountFrom) &&
        Objects.equals(this.accountTo, transactionResponse.accountTo) &&
        Objects.equals(this.dateTransaction, transactionResponse.dateTransaction) &&
        Objects.equals(this.operationType, transactionResponse.operationType) &&
        Objects.equals(this.sum, transactionResponse.sum) &&
        Objects.equals(this.description, transactionResponse.description) &&
        Objects.equals(this.status, transactionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountFrom, accountTo, dateTransaction, operationType, sum, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountFrom: ").append(toIndentedString(accountFrom)).append("\n");
    sb.append("    accountTo: ").append(toIndentedString(accountTo)).append("\n");
    sb.append("    dateTransaction: ").append(toIndentedString(dateTransaction)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

