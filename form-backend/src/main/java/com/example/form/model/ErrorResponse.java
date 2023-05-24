package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")


public class ErrorResponse {
    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("errorMessage")
    private String errorMessage = null;

    @JsonProperty("success")
    private Boolean success = null;

    public ErrorResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 业务约定的错误码
     *
     * @return errorCode
     **/
    @Schema(required = true, description = "业务约定的错误码")
    @NotNull

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorResponse errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 业务上的错误信息
     *
     * @return errorMessage
     **/
    @Schema(description = "业务上的错误信息")

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 业务上的请求是否成功
     *
     * @return success
     **/
    @Schema(description = "业务上的请求是否成功")

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
        ErrorResponse errorResponse = (ErrorResponse) o;
        return Objects.equals(this.errorCode, errorResponse.errorCode) &&
                Objects.equals(this.errorMessage, errorResponse.errorMessage) &&
                Objects.equals(this.success, errorResponse.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");

        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
