package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVpcEgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_egress_id")

    private String vpcEgressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Environment-ID")

    private String xEnvironmentID;

    public DeleteVpcEgressRequest withVpcEgressId(String vpcEgressId) {
        this.vpcEgressId = vpcEgressId;
        return this;
    }

    /**
     * CAE环境访问VPC配置ID。
     * @return vpcEgressId
     */
    public String getVpcEgressId() {
        return vpcEgressId;
    }

    public void setVpcEgressId(String vpcEgressId) {
        this.vpcEgressId = vpcEgressId;
    }

    public DeleteVpcEgressRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 企业项目ID。  - 创建环境时，环境会绑定企业项目ID。      - 最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。     - 该字段不传（或传为字符串“0”）时，则查询默认企业项目下的资源。  > 关于企业项目ID的获取及企业项目特性的详细信息，请参见《[企业管理服务用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)》。
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public DeleteVpcEgressRequest withXEnvironmentID(String xEnvironmentID) {
        this.xEnvironmentID = xEnvironmentID;
        return this;
    }

    /**
     * 环境ID。      - 获取环境ID，通过《[云应用引擎API参考](https://support.huaweicloud.com/api-cae/ListEnvironments.html)》的“获取环境列表”章节获取环境信息。     - 请求响应成功后在响应体的items数组中的一个元素即为一个环境的信息，其中id字段即是环境ID。
     * @return xEnvironmentID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Environment-ID")
    public String getXEnvironmentID() {
        return xEnvironmentID;
    }

    public void setXEnvironmentID(String xEnvironmentID) {
        this.xEnvironmentID = xEnvironmentID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVpcEgressRequest that = (DeleteVpcEgressRequest) obj;
        return Objects.equals(this.vpcEgressId, that.vpcEgressId)
            && Objects.equals(this.xEnterpriseProjectID, that.xEnterpriseProjectID)
            && Objects.equals(this.xEnvironmentID, that.xEnvironmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcEgressId, xEnterpriseProjectID, xEnvironmentID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVpcEgressRequest {\n");
        sb.append("    vpcEgressId: ").append(toIndentedString(vpcEgressId)).append("\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    xEnvironmentID: ").append(toIndentedString(xEnvironmentID)).append("\n");
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
