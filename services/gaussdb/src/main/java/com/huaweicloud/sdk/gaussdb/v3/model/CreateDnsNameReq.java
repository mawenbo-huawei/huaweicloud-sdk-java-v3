package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 申请内网域名
 */
public class CreateDnsNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_type")

    private String dnsType;

    public CreateDnsNameReq withDnsType(String dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * 域名类型，当前只支持private。
     * @return dnsType
     */
    public String getDnsType() {
        return dnsType;
    }

    public void setDnsType(String dnsType) {
        this.dnsType = dnsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDnsNameReq that = (CreateDnsNameReq) obj;
        return Objects.equals(this.dnsType, that.dnsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDnsNameReq {\n");
        sb.append("    dnsType: ").append(toIndentedString(dnsType)).append("\n");
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
