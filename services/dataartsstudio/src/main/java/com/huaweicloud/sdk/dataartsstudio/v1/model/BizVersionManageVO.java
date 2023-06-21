package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 业务版本管理.
 */
public class BizVersionManageVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private Long bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_info")

    private String bizInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_version")

    private Integer bizVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public BizVersionManageVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID信息
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BizVersionManageVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public BizVersionManageVO withBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 业务id
     * @return bizId
     */
    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public BizVersionManageVO withBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }

    /**
     * 业务对象信息
     * @return bizInfo
     */
    public String getBizInfo() {
        return bizInfo;
    }

    public void setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
    }

    public BizVersionManageVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public BizVersionManageVO withBizVersion(Integer bizVersion) {
        this.bizVersion = bizVersion;
        return this;
    }

    /**
     * 业务版本
     * @return bizVersion
     */
    public Integer getBizVersion() {
        return bizVersion;
    }

    public void setBizVersion(Integer bizVersion) {
        this.bizVersion = bizVersion;
    }

    public BizVersionManageVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public BizVersionManageVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BizVersionManageVO bizVersionManageVO = (BizVersionManageVO) o;
        return Objects.equals(this.id, bizVersionManageVO.id)
            && Objects.equals(this.bizType, bizVersionManageVO.bizType)
            && Objects.equals(this.bizId, bizVersionManageVO.bizId)
            && Objects.equals(this.bizInfo, bizVersionManageVO.bizInfo)
            && Objects.equals(this.status, bizVersionManageVO.status)
            && Objects.equals(this.bizVersion, bizVersionManageVO.bizVersion)
            && Objects.equals(this.createTime, bizVersionManageVO.createTime)
            && Objects.equals(this.updateTime, bizVersionManageVO.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bizType, bizId, bizInfo, status, bizVersion, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BizVersionManageVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    bizInfo: ").append(toIndentedString(bizInfo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bizVersion: ").append(toIndentedString(bizVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
