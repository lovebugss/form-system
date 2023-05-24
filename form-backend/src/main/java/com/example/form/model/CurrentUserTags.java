package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * CurrentUserTags
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class CurrentUserTags {
    @JsonProperty("key")
    private String key = null;

    @JsonProperty("label")
    private String label = null;

    public CurrentUserTags key(String key) {
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

    public CurrentUserTags label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @Schema(description = "")

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentUserTags currentUserTags = (CurrentUserTags) o;
        return Objects.equals(this.key, currentUserTags.key) &&
                Objects.equals(this.label, currentUserTags.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentUserTags {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
