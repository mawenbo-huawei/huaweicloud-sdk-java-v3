package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置云堡垒机委托授权凭据管理、密钥管理服务权限请求对象。（kms和csms必须传一个）
 */
public class AgencyAuthorizeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csms")

    private Boolean csms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms")

    private Boolean kms;

    public AgencyAuthorizeInfo withCsms(Boolean csms) {
        this.csms = csms;
        return this;
    }

    /**
     * 凭据管理权限信息。
     * @return csms
     */
    public Boolean getCsms() {
        return csms;
    }

    public void setCsms(Boolean csms) {
        this.csms = csms;
    }

    public AgencyAuthorizeInfo withKms(Boolean kms) {
        this.kms = kms;
        return this;
    }

    /**
     * 密钥管理权限信息。
     * @return kms
     */
    public Boolean getKms() {
        return kms;
    }

    public void setKms(Boolean kms) {
        this.kms = kms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyAuthorizeInfo that = (AgencyAuthorizeInfo) obj;
        return Objects.equals(this.csms, that.csms) && Objects.equals(this.kms, that.kms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csms, kms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyAuthorizeInfo {\n");
        sb.append("    csms: ").append(toIndentedString(csms)).append("\n");
        sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
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
