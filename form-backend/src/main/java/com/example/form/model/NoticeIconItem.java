package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import java.util.Objects;

/**
 * NoticeIconItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class NoticeIconItem {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("extra")
    private String extra = null;

    @JsonProperty("key")
    private String key = null;

    @JsonProperty("read")
    private Boolean read = null;

    @JsonProperty("avatar")
    private String avatar = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("datetime")
    private LocalDate datetime = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("type")
    private NoticeIconItemType type = null;

    public NoticeIconItem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NoticeIconItem extra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * Get extra
     *
     * @return extra
     **/
    @Schema(description = "")

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public NoticeIconItem key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    @Schema(description = "")

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public NoticeIconItem read(Boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get read
     *
     * @return read
     **/
    @Schema(description = "")

    public Boolean isRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public NoticeIconItem avatar(String avatar) {
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

    public NoticeIconItem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @Schema(description = "")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NoticeIconItem status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NoticeIconItem datetime(LocalDate datetime) {
        this.datetime = datetime;
        return this;
    }

    /**
     * Get datetime
     *
     * @return datetime
     **/
    @Schema(description = "")

    @Valid
    public LocalDate getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDate datetime) {
        this.datetime = datetime;
    }

    public NoticeIconItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NoticeIconItem type(NoticeIconItemType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(description = "")

    @Valid
    public NoticeIconItemType getType() {
        return type;
    }

    public void setType(NoticeIconItemType type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NoticeIconItem noticeIconItem = (NoticeIconItem) o;
        return Objects.equals(this.id, noticeIconItem.id) &&
                Objects.equals(this.extra, noticeIconItem.extra) &&
                Objects.equals(this.key, noticeIconItem.key) &&
                Objects.equals(this.read, noticeIconItem.read) &&
                Objects.equals(this.avatar, noticeIconItem.avatar) &&
                Objects.equals(this.title, noticeIconItem.title) &&
                Objects.equals(this.status, noticeIconItem.status) &&
                Objects.equals(this.datetime, noticeIconItem.datetime) &&
                Objects.equals(this.description, noticeIconItem.description) &&
                Objects.equals(this.type, noticeIconItem.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, extra, key, read, avatar, title, status, datetime, description, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoticeIconItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
