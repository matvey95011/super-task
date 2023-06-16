package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * TransactionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TransactionRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("accountIdFrom")
  private UUID accountIdFrom;

  @JsonProperty("accountIdTo")
  private UUID accountIdTo;

  @JsonProperty("operationType")
  private OperationType operationType;

  @JsonProperty("sum")
  private BigDecimal sum;

  @JsonProperty("description")
  private String description;

  public TransactionRequest accountIdFrom(UUID accountIdFrom) {
    this.accountIdFrom = accountIdFrom;
    return this;
  }

  /**
   * Get accountIdFrom
   * @return accountIdFrom
  */
  @Valid 
  @Schema(name = "accountIdFrom", required = false)
  public UUID getAccountIdFrom() {
    return accountIdFrom;
  }

  public void setAccountIdFrom(UUID accountIdFrom) {
    this.accountIdFrom = accountIdFrom;
  }

  public TransactionRequest accountIdTo(UUID accountIdTo) {
    this.accountIdTo = accountIdTo;
    return this;
  }

  /**
   * Get accountIdTo
   * @return accountIdTo
  */
  @Valid 
  @Schema(name = "accountIdTo", required = false)
  public UUID getAccountIdTo() {
    return accountIdTo;
  }

  public void setAccountIdTo(UUID accountIdTo) {
    this.accountIdTo = accountIdTo;
  }

  public TransactionRequest operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  */
  @Valid 
  @Schema(name = "operationType", required = false)
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public TransactionRequest sum(BigDecimal sum) {
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

  public TransactionRequest description(String description) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequest transactionRequest = (TransactionRequest) o;
    return Objects.equals(this.accountIdFrom, transactionRequest.accountIdFrom) &&
        Objects.equals(this.accountIdTo, transactionRequest.accountIdTo) &&
        Objects.equals(this.operationType, transactionRequest.operationType) &&
        Objects.equals(this.sum, transactionRequest.sum) &&
        Objects.equals(this.description, transactionRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdFrom, accountIdTo, operationType, sum, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    sb.append("    accountIdFrom: ").append(toIndentedString(accountIdFrom)).append("\n");
    sb.append("    accountIdTo: ").append(toIndentedString(accountIdTo)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

