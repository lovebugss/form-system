package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * PageParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class PageParams {
    @JsonProperty("current")
    private BigDecimal current = null;

    @JsonProperty("pageSize")
    private BigDecimal pageSize = null;

    public PageParams current(BigDecimal current) {
        this.current = current;
        return this;
    }

    /**
     * Get current
     *
     * @return current
     **/
    @Schema(description = "")

    @Valid
    public BigDecimal getCurrent() {
        return current;
    }

    public void setCurrent(BigDecimal current) {
        this.current = current;
    }

    public PageParams pageSize(BigDecimal pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     *
     * @return pageSize
     **/
    @Schema(description = "")

    @Valid
    public BigDecimal getPageSize() {
        return pageSize;
    }

    public void setPageSize(BigDecimal pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageParams pageParams = (PageParams) o;
        return Objects.equals(this.current, pageParams.current) &&
                Objects.equals(this.pageSize, pageParams.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageParams {\n");

        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
