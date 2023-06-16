package ru.provider.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Pageable;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PageUserResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageUserResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  @Valid
  private List<UserResponse> content = null;

  @JsonProperty("totalElements")
  private Long totalElements;

  @JsonProperty("totalPages")
  private Integer totalPages;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("number")
  private Integer number;

  @JsonProperty("sort")
  private Sort sort;

  @JsonProperty("first")
  private Boolean first;

  @JsonProperty("pageable")
  private Pageable pageable;

  @JsonProperty("numberOfElements")
  private Integer numberOfElements;

  @JsonProperty("last")
  private Boolean last;

  @JsonProperty("empty")
  private Boolean empty;

  public PageUserResponse content(List<UserResponse> content) {
    this.content = content;
    return this;
  }

  public PageUserResponse addContentItem(UserResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid 
  @Schema(name = "content", required = false)
  public List<UserResponse> getContent() {
    return content;
  }

  public void setContent(List<UserResponse> content) {
    this.content = content;
  }

  public PageUserResponse totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  
  @Schema(name = "totalElements", required = false)
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageUserResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  
  @Schema(name = "totalPages", required = false)
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PageUserResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "size", required = false)
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageUserResponse number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", required = false)
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageUserResponse sort(Sort sort) {
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

  public PageUserResponse first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  
  @Schema(name = "first", required = false)
  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageUserResponse pageable(Pageable pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
  */
  @Valid 
  @Schema(name = "pageable", required = false)
  public Pageable getPageable() {
    return pageable;
  }

  public void setPageable(Pageable pageable) {
    this.pageable = pageable;
  }

  public PageUserResponse numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
  */
  
  @Schema(name = "numberOfElements", required = false)
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageUserResponse last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  
  @Schema(name = "last", required = false)
  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageUserResponse empty(Boolean empty) {
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
    PageUserResponse pageUserResponse = (PageUserResponse) o;
    return Objects.equals(this.content, pageUserResponse.content) &&
        Objects.equals(this.totalElements, pageUserResponse.totalElements) &&
        Objects.equals(this.totalPages, pageUserResponse.totalPages) &&
        Objects.equals(this.size, pageUserResponse.size) &&
        Objects.equals(this.number, pageUserResponse.number) &&
        Objects.equals(this.sort, pageUserResponse.sort) &&
        Objects.equals(this.first, pageUserResponse.first) &&
        Objects.equals(this.pageable, pageUserResponse.pageable) &&
        Objects.equals(this.numberOfElements, pageUserResponse.numberOfElements) &&
        Objects.equals(this.last, pageUserResponse.last) &&
        Objects.equals(this.empty, pageUserResponse.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, size, number, sort, first, pageable, numberOfElements, last, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageUserResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

