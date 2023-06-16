package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Gets or Sets OperationType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OperationType {
  
  INCOME("INCOME"),
  
  OUTCOME("OUTCOME"),
  
  CREDIT_INCOME("CREDIT-INCOME"),
  
  CREDIT_OUTCOME("CREDIT-OUTCOME"),
  
  TRANSFER("TRANSFER");

  private String value;

  OperationType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OperationType fromValue(String value) {
    for (OperationType b : OperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

