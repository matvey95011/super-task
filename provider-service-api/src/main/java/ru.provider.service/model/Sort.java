package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Objects;

/**
 * Sort
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Sort implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("sorted")
  private Boolean sorted;

  @JsonProperty("unsorted")
  private Boolean unsorted;

  @JsonProperty("empty")
  private Boolean empty;

  public Sort sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

  /**
   * Get sorted
   * @return sorted
  */
  
  @Schema(name = "sorted", required = false)
  public Boolean isSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public Sort unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

  /**
   * Get unsorted
   * @return unsorted
  */
  
  @Schema(name = "unsorted", required = false)
  public Boolean isUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }

  public Sort empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  */
  
  @Schema(name = "empty", required = false)
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sort sort = (Sort) o;
    return Objects.equals(this.sorted, sort.sorted) &&
        Objects.equals(this.unsorted, sort.unsorted) &&
        Objects.equals(this.empty, sort.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sort {\n");
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

