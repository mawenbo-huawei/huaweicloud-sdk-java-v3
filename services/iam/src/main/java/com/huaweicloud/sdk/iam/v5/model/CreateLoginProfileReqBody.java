package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of create login profile request.
 */
public class CreateLoginProfileReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_reset_required")

    private Boolean passwordResetRequired;

    public CreateLoginProfileReqBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * IAM用户的密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateLoginProfileReqBody withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }

    /**
     * IAM用户下次登录时是否需要修改密码。
     * @return passwordResetRequired
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
    }

    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLoginProfileReqBody that = (CreateLoginProfileReqBody) obj;
        return Objects.equals(this.password, that.password)
            && Objects.equals(this.passwordResetRequired, that.passwordResetRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, passwordResetRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoginProfileReqBody {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    passwordResetRequired: ").append(toIndentedString(passwordResetRequired)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
