package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * Pageable
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Pageable implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("offset")
  private Long offset;

  @JsonProperty("sort")
  private Sort sort;

  @JsonProperty("pageNumber")
  private Integer pageNumber;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("paged")
  private Boolean paged;

  @JsonProperty("unpaged")
  private Boolean unpaged;

  public Pageable offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  
  @Schema(name = "offset", required = false)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public Pageable sort(Sort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @Valid 
  @Schema(name = "sort", required = false)
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public Pageable pageNumber(Integer pageNumber) {
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

  public Pageable pageSize(Integer pageSize) {
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

  public Pageable paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

  /**
   * Get paged
   * @return paged
  */
  
  @Schema(name = "paged", required = false)
  public Boolean isPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  public Pageable unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

  /**
   * Get unpaged
   * @return unpaged
  */
  
  @Schema(name = "unpaged", required = false)
  public Boolean isUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.offset, pageable.offset) &&
        Objects.equals(this.sort, pageable.sort) &&
        Objects.equals(this.pageNumber, pageable.pageNumber) &&
        Objects.equals(this.pageSize, pageable.pageSize) &&
        Objects.equals(this.paged, pageable.paged) &&
        Objects.equals(this.unpaged, pageable.unpaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, sort, pageNumber, pageSize, paged, unpaged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
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

