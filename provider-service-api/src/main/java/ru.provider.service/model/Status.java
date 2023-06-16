package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Gets or Sets Status
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum Status {
  
  ACTIVE("ACTIVE"),
  
  BLOCK("BLOCK"),
  
  DELETE("DELETE"),
  
  CHECKING("CHECKING");

  private String value;

  Status(String value) {
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
  public static Status fromValue(String value) {
    for (Status b : Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

