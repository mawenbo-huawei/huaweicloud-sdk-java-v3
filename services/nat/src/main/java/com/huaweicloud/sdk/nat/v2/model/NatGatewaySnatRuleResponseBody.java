package com.huaweicloud.sdk.nat.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SNAT规则的响应体。
 */
public class NatGatewaySnatRuleResponseBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_gateway_id")
    
    private String natGatewayId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_type")
    
    private Integer sourceType = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_id")
    
    private String floatingIpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 功能说明：SNAT规则的状态。
     */
    public static final class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");
        
        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");
        
        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");
        
        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");
        
        /**
         * Enum EIP_FREEZED for value: "EIP_FREEZED"
         */
        public static final StatusEnum EIP_FREEZED = new StatusEnum("EIP_FREEZED");
        
        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("EIP_FREEZED", EIP_FREEZED);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_address")
    
    private String floatingIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="freezed_ip_address")
    
    private String freezedIpAddress;

    public NatGatewaySnatRuleResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * SNAT规则的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NatGatewaySnatRuleResponseBody withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目的ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NatGatewaySnatRuleResponseBody withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    


    /**
     * 公网NAT网关实例的ID。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public NatGatewaySnatRuleResponseBody withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * cidr，可以是网段或者主机格式，与network_id参数二选一。 Source_type=0时，cidr必须是vpc 子网网段的子集(不能相等）; Source_type=1时，cidr必须指定专线侧网段。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public NatGatewaySnatRuleResponseBody withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    


    /**
     * 0：VPC侧，可以指定network_id 或者cidr 1：专线侧，只能指定cidr 不输入默认为0（VPC）
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public NatGatewaySnatRuleResponseBody withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    


    /**
     * 功能说明：弹性公网IP的id，多个弹性公网IP使用逗号分隔。 取值范围：最大长度4096字节。
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public NatGatewaySnatRuleResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * SNAT规则的描述，长度限制为255。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NatGatewaySnatRuleResponseBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：SNAT规则的状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NatGatewaySnatRuleResponseBody withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * SNAT规则的创建时间，遵循UTC时间，格式是yyyy-mm-ddThh:mm:ssZ。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NatGatewaySnatRuleResponseBody withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * 规则使用的网络id。与cidr参数二选一。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public NatGatewaySnatRuleResponseBody withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 解冻/冻结状态。 取值范围： - \"true\"：解冻 - \"false\"：冻结
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public NatGatewaySnatRuleResponseBody withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    


    /**
     * 功能说明：弹性公网IP，多个弹性公网IP使用逗号分隔。 取值范围：最大长度1024字节。
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    public NatGatewaySnatRuleResponseBody withFreezedIpAddress(String freezedIpAddress) {
        this.freezedIpAddress = freezedIpAddress;
        return this;
    }

    


    /**
     * 功能说明：冻结的弹性公网IP，多个冻结的弹性公网IP使用逗号分隔。 取值范围：最大长度1024字节。
     * @return freezedIpAddress
     */
    public String getFreezedIpAddress() {
        return freezedIpAddress;
    }

    public void setFreezedIpAddress(String freezedIpAddress) {
        this.freezedIpAddress = freezedIpAddress;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NatGatewaySnatRuleResponseBody natGatewaySnatRuleResponseBody = (NatGatewaySnatRuleResponseBody) o;
        return Objects.equals(this.id, natGatewaySnatRuleResponseBody.id) &&
            Objects.equals(this.tenantId, natGatewaySnatRuleResponseBody.tenantId) &&
            Objects.equals(this.natGatewayId, natGatewaySnatRuleResponseBody.natGatewayId) &&
            Objects.equals(this.cidr, natGatewaySnatRuleResponseBody.cidr) &&
            Objects.equals(this.sourceType, natGatewaySnatRuleResponseBody.sourceType) &&
            Objects.equals(this.floatingIpId, natGatewaySnatRuleResponseBody.floatingIpId) &&
            Objects.equals(this.description, natGatewaySnatRuleResponseBody.description) &&
            Objects.equals(this.status, natGatewaySnatRuleResponseBody.status) &&
            Objects.equals(this.createdAt, natGatewaySnatRuleResponseBody.createdAt) &&
            Objects.equals(this.networkId, natGatewaySnatRuleResponseBody.networkId) &&
            Objects.equals(this.adminStateUp, natGatewaySnatRuleResponseBody.adminStateUp) &&
            Objects.equals(this.floatingIpAddress, natGatewaySnatRuleResponseBody.floatingIpAddress) &&
            Objects.equals(this.freezedIpAddress, natGatewaySnatRuleResponseBody.freezedIpAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, tenantId, natGatewayId, cidr, sourceType, floatingIpId, description, status, createdAt, networkId, adminStateUp, floatingIpAddress, freezedIpAddress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatGatewaySnatRuleResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    freezedIpAddress: ").append(toIndentedString(freezedIpAddress)).append("\n");
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
