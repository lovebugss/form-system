package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * CurrentUserGeographic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class CurrentUserGeographic {
    @JsonProperty("province")
    private CurrentUserGeographicProvince province = null;

    @JsonProperty("city")
    private CurrentUserGeographicProvince city = null;

    public CurrentUserGeographic province(CurrentUserGeographicProvince province) {
        this.province = province;
        return this;
    }

    /**
     * Get province
     *
     * @return province
     **/
    @Schema(description = "")

    @Valid
    public CurrentUserGeographicProvince getProvince() {
        return province;
    }

    public void setProvince(CurrentUserGeographicProvince province) {
        this.province = province;
    }

    public CurrentUserGeographic city(CurrentUserGeographicProvince city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/
    @Schema(description = "")

    @Valid
    public CurrentUserGeographicProvince getCity() {
        return city;
    }

    public void setCity(CurrentUserGeographicProvince city) {
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentUserGeographic currentUserGeographic = (CurrentUserGeographic) o;
        return Objects.equals(this.province, currentUserGeographic.province) &&
                Objects.equals(this.city, currentUserGeographic.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(province, city);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentUserGeographic {\n");

        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
