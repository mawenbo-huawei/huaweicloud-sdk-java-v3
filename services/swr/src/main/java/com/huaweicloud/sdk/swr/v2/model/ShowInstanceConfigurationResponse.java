package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anonymous_access")

    private Boolean anonymousAccess;

    public ShowInstanceConfigurationResponse withAnonymousAccess(Boolean anonymousAccess) {
        this.anonymousAccess = anonymousAccess;
        return this;
    }

    /**
     * 是否开启匿名登录
     * @return anonymousAccess
     */
    public Boolean getAnonymousAccess() {
        return anonymousAccess;
    }

    public void setAnonymousAccess(Boolean anonymousAccess) {
        this.anonymousAccess = anonymousAccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceConfigurationResponse that = (ShowInstanceConfigurationResponse) obj;
        return Objects.equals(this.anonymousAccess, that.anonymousAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anonymousAccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceConfigurationResponse {\n");
        sb.append("    anonymousAccess: ").append(toIndentedString(anonymousAccess)).append("\n");
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
