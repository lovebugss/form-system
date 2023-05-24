package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CurrentUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class CurrentUser {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("avatar")
    private String avatar = null;

    @JsonProperty("userid")
    private String userid = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("signature")
    private String signature = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("group")
    private String group = null;

    @JsonProperty("tags")
    @Valid
    private List<CurrentUserTags> tags = null;

    @JsonProperty("notifyCount")
    private Integer notifyCount = null;

    @JsonProperty("unreadCount")
    private Integer unreadCount = null;

    @JsonProperty("country")
    private String country = null;

    @JsonProperty("access")
    private String access = null;

    @JsonProperty("geographic")
    private CurrentUserGeographic geographic = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("phone")
    private String phone = null;

    public CurrentUser name(String name) {
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

    public CurrentUser avatar(String avatar) {
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

    public CurrentUser userid(String userid) {
        this.userid = userid;
        return this;
    }

    /**
     * Get userid
     *
     * @return userid
     **/
    @Schema(description = "")

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public CurrentUser email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(description = "")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CurrentUser signature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get signature
     *
     * @return signature
     **/
    @Schema(description = "")

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public CurrentUser title(String title) {
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

    public CurrentUser group(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get group
     *
     * @return group
     **/
    @Schema(description = "")

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public CurrentUser tags(List<CurrentUserTags> tags) {
        this.tags = tags;
        return this;
    }

    public CurrentUser addTagsItem(CurrentUserTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<CurrentUserTags>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/
    @Schema(description = "")
    @Valid
    public List<CurrentUserTags> getTags() {
        return tags;
    }

    public void setTags(List<CurrentUserTags> tags) {
        this.tags = tags;
    }

    public CurrentUser notifyCount(Integer notifyCount) {
        this.notifyCount = notifyCount;
        return this;
    }

    /**
     * Get notifyCount
     *
     * @return notifyCount
     **/
    @Schema(description = "")

    public Integer getNotifyCount() {
        return notifyCount;
    }

    public void setNotifyCount(Integer notifyCount) {
        this.notifyCount = notifyCount;
    }

    public CurrentUser unreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    /**
     * Get unreadCount
     *
     * @return unreadCount
     **/
    @Schema(description = "")

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public CurrentUser country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     *
     * @return country
     **/
    @Schema(description = "")

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CurrentUser access(String access) {
        this.access = access;
        return this;
    }

    /**
     * Get access
     *
     * @return access
     **/
    @Schema(description = "")

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public CurrentUser geographic(CurrentUserGeographic geographic) {
        this.geographic = geographic;
        return this;
    }

    /**
     * Get geographic
     *
     * @return geographic
     **/
    @Schema(description = "")

    @Valid
    public CurrentUserGeographic getGeographic() {
        return geographic;
    }

    public void setGeographic(CurrentUserGeographic geographic) {
        this.geographic = geographic;
    }

    public CurrentUser address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @Schema(description = "")

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CurrentUser phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    @Schema(description = "")

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentUser currentUser = (CurrentUser) o;
        return Objects.equals(this.name, currentUser.name) &&
                Objects.equals(this.avatar, currentUser.avatar) &&
                Objects.equals(this.userid, currentUser.userid) &&
                Objects.equals(this.email, currentUser.email) &&
                Objects.equals(this.signature, currentUser.signature) &&
                Objects.equals(this.title, currentUser.title) &&
                Objects.equals(this.group, currentUser.group) &&
                Objects.equals(this.tags, currentUser.tags) &&
                Objects.equals(this.notifyCount, currentUser.notifyCount) &&
                Objects.equals(this.unreadCount, currentUser.unreadCount) &&
                Objects.equals(this.country, currentUser.country) &&
                Objects.equals(this.access, currentUser.access) &&
                Objects.equals(this.geographic, currentUser.geographic) &&
                Objects.equals(this.address, currentUser.address) &&
                Objects.equals(this.phone, currentUser.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avatar, userid, email, signature, title, group, tags, notifyCount, unreadCount, country, access, geographic, address, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentUser {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    notifyCount: ").append(toIndentedString(notifyCount)).append("\n");
        sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    geographic: ").append(toIndentedString(geographic)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
