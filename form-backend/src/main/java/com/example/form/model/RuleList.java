package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RuleList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class RuleList {
    @JsonProperty("data")
    @Valid
    private List<RuleListItem> data = null;

    @JsonProperty("total")
    private Integer total = null;

    @JsonProperty("success")
    private Boolean success = null;

    public RuleList data(List<RuleListItem> data) {
        this.data = data;
        return this;
    }

    public RuleList addDataItem(RuleListItem dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<RuleListItem>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    @Valid
    public List<RuleListItem> getData() {
        return data;
    }

    public void setData(List<RuleListItem> data) {
        this.data = data;
    }

    public RuleList total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 列表的内容总数
     *
     * @return total
     **/
    @Schema(description = "列表的内容总数")

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public RuleList success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Get success
     *
     * @return success
     **/
    @Schema(description = "")

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleList ruleList = (RuleList) o;
        return Objects.equals(this.data, ruleList.data) &&
                Objects.equals(this.total, ruleList.total) &&
                Objects.equals(this.success, ruleList.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleList {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
