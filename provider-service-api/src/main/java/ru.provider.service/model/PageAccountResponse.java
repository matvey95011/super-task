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
 * PageAccountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageAccountResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  @Valid
  private List<AccountResponse> content = null;

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

  public PageAccountResponse content(List<AccountResponse> content) {
    this.content = content;
    return this;
  }

  public PageAccountResponse addContentItem(AccountResponse contentItem) {
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
  public List<AccountResponse> getContent() {
    return content;
  }

  public void setContent(List<AccountResponse> content) {
    this.content = content;
  }

  public PageAccountResponse totalElements(Long totalElements) {
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

  public PageAccountResponse totalPages(Integer totalPages) {
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

  public PageAccountResponse size(Integer size) {
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

  public PageAccountResponse number(Integer number) {
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

  public PageAccountResponse sort(Sort sort) {
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

  public PageAccountResponse first(Boolean first) {
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

  public PageAccountResponse pageable(Pageable pageable) {
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

  public PageAccountResponse numberOfElements(Integer numberOfElements) {
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

  public PageAccountResponse last(Boolean last) {
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

  public PageAccountResponse empty(Boolean empty) {
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
    PageAccountResponse pageAccountResponse = (PageAccountResponse) o;
    return Objects.equals(this.content, pageAccountResponse.content) &&
        Objects.equals(this.totalElements, pageAccountResponse.totalElements) &&
        Objects.equals(this.totalPages, pageAccountResponse.totalPages) &&
        Objects.equals(this.size, pageAccountResponse.size) &&
        Objects.equals(this.number, pageAccountResponse.number) &&
        Objects.equals(this.sort, pageAccountResponse.sort) &&
        Objects.equals(this.first, pageAccountResponse.first) &&
        Objects.equals(this.pageable, pageAccountResponse.pageable) &&
        Objects.equals(this.numberOfElements, pageAccountResponse.numberOfElements) &&
        Objects.equals(this.last, pageAccountResponse.last) &&
        Objects.equals(this.empty, pageAccountResponse.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, size, number, sort, first, pageable, numberOfElements, last, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageAccountResponse {\n");
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

