package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SwitchHostsProtectStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SwitchHostsProtectStatusRequestInfo body;

    public SwitchHostsProtectStatusRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SwitchHostsProtectStatusRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，查询所有企业项目时填写：all_granted_eps
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SwitchHostsProtectStatusRequest withBody(SwitchHostsProtectStatusRequestInfo body) {
        this.body = body;
        return this;
    }

    public SwitchHostsProtectStatusRequest withBody(Consumer<SwitchHostsProtectStatusRequestInfo> bodySetter) {
        if (this.body == null) {
            this.body = new SwitchHostsProtectStatusRequestInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SwitchHostsProtectStatusRequestInfo getBody() {
        return body;
    }

    public void setBody(SwitchHostsProtectStatusRequestInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchHostsProtectStatusRequest switchHostsProtectStatusRequest = (SwitchHostsProtectStatusRequest) o;
        return Objects.equals(this.region, switchHostsProtectStatusRequest.region)
            && Objects.equals(this.enterpriseProjectId, switchHostsProtectStatusRequest.enterpriseProjectId)
            && Objects.equals(this.body, switchHostsProtectStatusRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchHostsProtectStatusRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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