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
 * TransactionShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TransactionShortResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private UUID id;

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

  public TransactionShortResponse id(UUID id) {
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

  public TransactionShortResponse dateTransaction(Instant dateTransaction) {
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

  public TransactionShortResponse operationType(String operationType) {
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

  public TransactionShortResponse sum(BigDecimal sum) {
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

  public TransactionShortResponse description(String description) {
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

  public TransactionShortResponse status(String status) {
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
    TransactionShortResponse transactionShortResponse = (TransactionShortResponse) o;
    return Objects.equals(this.id, transactionShortResponse.id) &&
        Objects.equals(this.dateTransaction, transactionShortResponse.dateTransaction) &&
        Objects.equals(this.operationType, transactionShortResponse.operationType) &&
        Objects.equals(this.sum, transactionShortResponse.sum) &&
        Objects.equals(this.description, transactionShortResponse.description) &&
        Objects.equals(this.status, transactionShortResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateTransaction, operationType, sum, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionShortResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

