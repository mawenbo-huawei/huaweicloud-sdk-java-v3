package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTenantServerGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sever_group_name")

    private String severGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_secondary_server_group")

    private String isSecondaryServerGroup;

    public ListTenantServerGroupsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTenantServerGroupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的数量，值区间[1-100]。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTenantServerGroupsRequest withSeverGroupName(String severGroupName) {
        this.severGroupName = severGroupName;
        return this;
    }

    /**
     * 服务器组名称。
     * @return severGroupName
     */
    public String getSeverGroupName() {
        return severGroupName;
    }

    public void setSeverGroupName(String severGroupName) {
        this.severGroupName = severGroupName;
    }

    public ListTenantServerGroupsRequest withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 应用组类型： * `SESSION_DESKTOP_APP` - 会话桌面app * `COMMON_APP` - 普通app
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public ListTenantServerGroupsRequest withIsSecondaryServerGroup(String isSecondaryServerGroup) {
        this.isSecondaryServerGroup = isSecondaryServerGroup;
        return this;
    }

    /**
     * 是否为备服务器组，不传默认查所有： true : 是备服务器组。 false: 主服务器组，默认。
     * @return isSecondaryServerGroup
     */
    public String getIsSecondaryServerGroup() {
        return isSecondaryServerGroup;
    }

    public void setIsSecondaryServerGroup(String isSecondaryServerGroup) {
        this.isSecondaryServerGroup = isSecondaryServerGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantServerGroupsRequest that = (ListTenantServerGroupsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.severGroupName, that.severGroupName) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.isSecondaryServerGroup, that.isSecondaryServerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, severGroupName, appType, isSecondaryServerGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantServerGroupsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    severGroupName: ").append(toIndentedString(severGroupName)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    isSecondaryServerGroup: ").append(toIndentedString(isSecondaryServerGroup)).append("\n");
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
