package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备组信息结构体，创建、查询、修改设备组时返回
 */
public class DeviceGroupResponsSummery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_group_id")

    private String superGroupId;

    public DeviceGroupResponsSummery withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 设备组ID，用于唯一标识一个设备组，在创建设备组时由物联网平台分配。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DeviceGroupResponsSummery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备组名称，单个资源空间下不可重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceGroupResponsSummery withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 设备组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeviceGroupResponsSummery withSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }

    /**
     * 父设备组ID，该设备组的父设备组ID。
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return superGroupId;
    }

    public void setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceGroupResponsSummery deviceGroupResponsSummery = (DeviceGroupResponsSummery) o;
        return Objects.equals(this.groupId, deviceGroupResponsSummery.groupId)
            && Objects.equals(this.name, deviceGroupResponsSummery.name)
            && Objects.equals(this.description, deviceGroupResponsSummery.description)
            && Objects.equals(this.superGroupId, deviceGroupResponsSummery.superGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, name, description, superGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceGroupResponsSummery {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    superGroupId: ").append(toIndentedString(superGroupId)).append("\n");
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