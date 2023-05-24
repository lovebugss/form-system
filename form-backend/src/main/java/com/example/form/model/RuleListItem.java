package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * RuleListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class RuleListItem {
    @JsonProperty("key")
    private Integer key = null;

    @JsonProperty("disabled")
    private Boolean disabled = null;

    @JsonProperty("href")
    private String href = null;

    @JsonProperty("avatar")
    private String avatar = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("owner")
    private String owner = null;

    @JsonProperty("desc")
    private String desc = null;

    @JsonProperty("callNo")
    private Integer callNo = null;

    @JsonProperty("status")
    private Integer status = null;

    @JsonProperty("updatedAt")
    private String updatedAt = null;

    @JsonProperty("createdAt")
    private String createdAt = null;

    @JsonProperty("progress")
    private Integer progress = null;

    public RuleListItem key(Integer key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    @Schema(description = "")

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public RuleListItem disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     **/
    @Schema(description = "")

    public Boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public RuleListItem href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get href
     *
     * @return href
     **/
    @Schema(description = "")

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RuleListItem avatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * Get avatar
     *
     * @return avatar
     **/
    @Schema(description = "")

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public RuleListItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleListItem owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @Schema(description = "")

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public RuleListItem desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Get desc
     *
     * @return desc
     **/
    @Schema(description = "")

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RuleListItem callNo(Integer callNo) {
        this.callNo = callNo;
        return this;
    }

    /**
     * Get callNo
     *
     * @return callNo
     **/
    @Schema(description = "")

    public Integer getCallNo() {
        return callNo;
    }

    public void setCallNo(Integer callNo) {
        this.callNo = callNo;
    }

    public RuleListItem status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public RuleListItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     **/
    @Schema(description = "")

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RuleListItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/
    @Schema(description = "")

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RuleListItem progress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     *
     * @return progress
     **/
    @Schema(description = "")

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleListItem ruleListItem = (RuleListItem) o;
        return Objects.equals(this.key, ruleListItem.key) &&
                Objects.equals(this.disabled, ruleListItem.disabled) &&
                Objects.equals(this.href, ruleListItem.href) &&
                Objects.equals(this.avatar, ruleListItem.avatar) &&
                Objects.equals(this.name, ruleListItem.name) &&
                Objects.equals(this.owner, ruleListItem.owner) &&
                Objects.equals(this.desc, ruleListItem.desc) &&
                Objects.equals(this.callNo, ruleListItem.callNo) &&
                Objects.equals(this.status, ruleListItem.status) &&
                Objects.equals(this.updatedAt, ruleListItem.updatedAt) &&
                Objects.equals(this.createdAt, ruleListItem.createdAt) &&
                Objects.equals(this.progress, ruleListItem.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, disabled, href, avatar, name, owner, desc, callNo, status, updatedAt, createdAt, progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleListItem {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    callNo: ").append(toIndentedString(callNo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
