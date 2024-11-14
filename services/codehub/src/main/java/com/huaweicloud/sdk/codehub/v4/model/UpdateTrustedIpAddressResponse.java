package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateTrustedIpAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_range")

    private String ipRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private Integer ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_start")

    private String ipStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_end")

    private String ipEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_flag")

    private Integer viewFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_flag")

    private Integer downloadFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_flag")

    private Integer uploadFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_flag")

    private Integer orderFlag;

    public UpdateTrustedIpAddressResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 关联结果
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateTrustedIpAddressResponse withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库id
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public UpdateTrustedIpAddressResponse withIpRange(String ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    /**
     * ip范围
     * @return ipRange
     */
    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    public UpdateTrustedIpAddressResponse withIpType(Integer ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * 格式类型，指定ip，ip范围，CIDR
     * @return ipType
     */
    public Integer getIpType() {
        return ipType;
    }

    public void setIpType(Integer ipType) {
        this.ipType = ipType;
    }

    public UpdateTrustedIpAddressResponse withIpStart(String ipStart) {
        this.ipStart = ipStart;
        return this;
    }

    /**
     * 起始ip
     * @return ipStart
     */
    public String getIpStart() {
        return ipStart;
    }

    public void setIpStart(String ipStart) {
        this.ipStart = ipStart;
    }

    public UpdateTrustedIpAddressResponse withIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
        return this;
    }

    /**
     * 结束ip
     * @return ipEnd
     */
    public String getIpEnd() {
        return ipEnd;
    }

    public void setIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
    }

    public UpdateTrustedIpAddressResponse withViewFlag(Integer viewFlag) {
        this.viewFlag = viewFlag;
        return this;
    }

    /**
     * 是否允许访问代码仓库
     * @return viewFlag
     */
    public Integer getViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(Integer viewFlag) {
        this.viewFlag = viewFlag;
    }

    public UpdateTrustedIpAddressResponse withDownloadFlag(Integer downloadFlag) {
        this.downloadFlag = downloadFlag;
        return this;
    }

    /**
     * 是否允许下载代码
     * @return downloadFlag
     */
    public Integer getDownloadFlag() {
        return downloadFlag;
    }

    public void setDownloadFlag(Integer downloadFlag) {
        this.downloadFlag = downloadFlag;
    }

    public UpdateTrustedIpAddressResponse withUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
        return this;
    }

    /**
     * 是否允许提交代码
     * @return uploadFlag
     */
    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public UpdateTrustedIpAddressResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateTrustedIpAddressResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateTrustedIpAddressResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdateTrustedIpAddressResponse withOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
        return this;
    }

    /**
     * 排序
     * minimum: 0
     * maximum: 100
     * @return orderFlag
     */
    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrustedIpAddressResponse that = (UpdateTrustedIpAddressResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.ipRange, that.ipRange) && Objects.equals(this.ipType, that.ipType)
            && Objects.equals(this.ipStart, that.ipStart) && Objects.equals(this.ipEnd, that.ipEnd)
            && Objects.equals(this.viewFlag, that.viewFlag) && Objects.equals(this.downloadFlag, that.downloadFlag)
            && Objects.equals(this.uploadFlag, that.uploadFlag) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.orderFlag, that.orderFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repositoryId,
            ipRange,
            ipType,
            ipStart,
            ipEnd,
            viewFlag,
            downloadFlag,
            uploadFlag,
            remark,
            createdAt,
            updatedAt,
            orderFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrustedIpAddressResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ipStart: ").append(toIndentedString(ipStart)).append("\n");
        sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
        sb.append("    viewFlag: ").append(toIndentedString(viewFlag)).append("\n");
        sb.append("    downloadFlag: ").append(toIndentedString(downloadFlag)).append("\n");
        sb.append("    uploadFlag: ").append(toIndentedString(uploadFlag)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    orderFlag: ").append(toIndentedString(orderFlag)).append("\n");
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