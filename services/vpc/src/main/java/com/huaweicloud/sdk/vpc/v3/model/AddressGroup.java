package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** AddressGroup */
public class AddressGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_set")

    private List<String> ipSet = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    public AddressGroup withId(String id) {
        this.id = id;
        return this;
    }

    /** 功能说明：地址组唯一标识 取值范围：合法UUID的字符串
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddressGroup withName(String name) {
        this.name = name;
        return this;
    }

    /** 功能说明：地址组名称 取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 功能说明：地址组描述信息 取值范围：0-255个字符 约束：不能包含“<”和“>”。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressGroup withIpSet(List<String> ipSet) {
        this.ipSet = ipSet;
        return this;
    }

    public AddressGroup addIpSetItem(String ipSetItem) {
        if (this.ipSet == null) {
            this.ipSet = new ArrayList<>();
        }
        this.ipSet.add(ipSetItem);
        return this;
    }

    public AddressGroup withIpSet(Consumer<List<String>> ipSetSetter) {
        if (this.ipSet == null) {
            this.ipSet = new ArrayList<>();
        }
        ipSetSetter.accept(this.ipSet);
        return this;
    }

    /** 功能说明：地址组可包含地址集 取值范围：可以是单个ip地址，ip地址范围，ip地址cidr 约束：当前一个地址组ip_set数量限制默认值为20，即配置的ip地址、ip地址范围或ip地址cidr的总数默认限制20
     * 
     * @return ipSet */
    public List<String> getIpSet() {
        return ipSet;
    }

    public void setIpSet(List<String> ipSet) {
        this.ipSet = ipSet;
    }

    public AddressGroup withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /** 功能说明：IP地址组ip版本 取值范围：4, 表示ipv4地址组；6, 表示ipv6地址组
     * 
     * @return ipVersion */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public AddressGroup withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 功能说明：地址组创建时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss；系统自动生成
     * 
     * @return createdAt */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AddressGroup withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 功能描述：地址组最近一次更新资源的时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss；系统自动生成
     * 
     * @return updatedAt */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AddressGroup withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /** 功能说明：资源所属项目ID
     * 
     * @return tenantId */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressGroup addressGroup = (AddressGroup) o;
        return Objects.equals(this.id, addressGroup.id) && Objects.equals(this.name, addressGroup.name)
            && Objects.equals(this.description, addressGroup.description)
            && Objects.equals(this.ipSet, addressGroup.ipSet) && Objects.equals(this.ipVersion, addressGroup.ipVersion)
            && Objects.equals(this.createdAt, addressGroup.createdAt)
            && Objects.equals(this.updatedAt, addressGroup.updatedAt)
            && Objects.equals(this.tenantId, addressGroup.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, ipSet, ipVersion, createdAt, updatedAt, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressGroup {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipSet: ").append(toIndentedString(ipSet)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}