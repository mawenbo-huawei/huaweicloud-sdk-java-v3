package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetFirewallInstanceResponseData
 */
public class GetFirewallInstanceResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_type")

    private Integer haType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_objects")

    private List<ProtectObjectVO> protectObjects = null;

    /**
    * 防火墙状态列表，包括-1：等待支付，0：创建中，1，删除中，2：运行中，3：升级中，4：删除完成：5：冻结中，6：创建失败，7：删除失败，8：冻结失败，9：存储中，10：存储失败，11：升级失败
    */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_MINUS_1 for value: -1
         */
        public static final StatusEnum NUMBER_MINUS_1 = new StatusEnum(-1);

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final StatusEnum NUMBER_3 = new StatusEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final StatusEnum NUMBER_4 = new StatusEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final StatusEnum NUMBER_5 = new StatusEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final StatusEnum NUMBER_6 = new StatusEnum(6);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final StatusEnum NUMBER_7 = new StatusEnum(7);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final StatusEnum NUMBER_8 = new StatusEnum(8);

        /**
         * Enum NUMBER_9 for value: 9
         */
        public static final StatusEnum NUMBER_9 = new StatusEnum(9);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final StatusEnum NUMBER_10 = new StatusEnum(10);

        /**
         * Enum NUMBER_11 for value: 11
         */
        public static final StatusEnum NUMBER_11 = new StatusEnum(11);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(-1, NUMBER_MINUS_1);
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            map.put(9, NUMBER_9);
            map.put(10, NUMBER_10);
            map.put(11, NUMBER_11);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
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
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_old_firewall_instance")

    private Boolean isOldFirewallInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ipv6")

    private Boolean supportIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_toggle")

    private Map<String, Boolean> featureToggle = null;

    public GetFirewallInstanceResponseData withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙id
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public GetFirewallInstanceResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GetFirewallInstanceResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 防火墙名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetFirewallInstanceResponseData withHaType(Integer haType) {
        this.haType = haType;
        return this;
    }

    /**
     * 集群类型
     * @return haType
     */
    public Integer getHaType() {
        return haType;
    }

    public void setHaType(Integer haType) {
        this.haType = haType;
    }

    public GetFirewallInstanceResponseData withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式 0：包年/包月 1：按需
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public GetFirewallInstanceResponseData withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public GetFirewallInstanceResponseData withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public GetFirewallInstanceResponseData withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public GetFirewallInstanceResponseData withFlavor(Consumer<Flavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public GetFirewallInstanceResponseData withProtectObjects(List<ProtectObjectVO> protectObjects) {
        this.protectObjects = protectObjects;
        return this;
    }

    public GetFirewallInstanceResponseData addProtectObjectsItem(ProtectObjectVO protectObjectsItem) {
        if (this.protectObjects == null) {
            this.protectObjects = new ArrayList<>();
        }
        this.protectObjects.add(protectObjectsItem);
        return this;
    }

    public GetFirewallInstanceResponseData withProtectObjects(Consumer<List<ProtectObjectVO>> protectObjectsSetter) {
        if (this.protectObjects == null) {
            this.protectObjects = new ArrayList<>();
        }
        protectObjectsSetter.accept(this.protectObjects);
        return this;
    }

    /**
     * 防护对象列表
     * @return protectObjects
     */
    public List<ProtectObjectVO> getProtectObjects() {
        return protectObjects;
    }

    public void setProtectObjects(List<ProtectObjectVO> protectObjects) {
        this.protectObjects = protectObjects;
    }

    public GetFirewallInstanceResponseData withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 防火墙状态列表，包括-1：等待支付，0：创建中，1，删除中，2：运行中，3：升级中，4：删除完成：5：冻结中，6：创建失败，7：删除失败，8：冻结失败，9：存储中，10：存储失败，11：升级失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public GetFirewallInstanceResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GetFirewallInstanceResponseData withIsOldFirewallInstance(Boolean isOldFirewallInstance) {
        this.isOldFirewallInstance = isOldFirewallInstance;
        return this;
    }

    /**
     * 是否为旧引擎，true表示是，false表示不是
     * @return isOldFirewallInstance
     */
    public Boolean getIsOldFirewallInstance() {
        return isOldFirewallInstance;
    }

    public void setIsOldFirewallInstance(Boolean isOldFirewallInstance) {
        this.isOldFirewallInstance = isOldFirewallInstance;
    }

    public GetFirewallInstanceResponseData withSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
        return this;
    }

    /**
     * 是否支持ipv6，true表示是，false表示不是
     * @return supportIpv6
     */
    public Boolean getSupportIpv6() {
        return supportIpv6;
    }

    public void setSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
    }

    public GetFirewallInstanceResponseData withFeatureToggle(Map<String, Boolean> featureToggle) {
        this.featureToggle = featureToggle;
        return this;
    }

    public GetFirewallInstanceResponseData putFeatureToggleItem(String key, Boolean featureToggleItem) {
        if (this.featureToggle == null) {
            this.featureToggle = new HashMap<>();
        }
        this.featureToggle.put(key, featureToggleItem);
        return this;
    }

    public GetFirewallInstanceResponseData withFeatureToggle(Consumer<Map<String, Boolean>> featureToggleSetter) {
        if (this.featureToggle == null) {
            this.featureToggle = new HashMap<>();
        }
        featureToggleSetter.accept(this.featureToggle);
        return this;
    }

    /**
     * 特性开关，boolean值为true表示是，false表示否
     * @return featureToggle
     */
    public Map<String, Boolean> getFeatureToggle() {
        return featureToggle;
    }

    public void setFeatureToggle(Map<String, Boolean> featureToggle) {
        this.featureToggle = featureToggle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFirewallInstanceResponseData getFirewallInstanceResponseData = (GetFirewallInstanceResponseData) o;
        return Objects.equals(this.fwInstanceId, getFirewallInstanceResponseData.fwInstanceId)
            && Objects.equals(this.resourceId, getFirewallInstanceResponseData.resourceId)
            && Objects.equals(this.name, getFirewallInstanceResponseData.name)
            && Objects.equals(this.haType, getFirewallInstanceResponseData.haType)
            && Objects.equals(this.chargeMode, getFirewallInstanceResponseData.chargeMode)
            && Objects.equals(this.serviceType, getFirewallInstanceResponseData.serviceType)
            && Objects.equals(this.engineType, getFirewallInstanceResponseData.engineType)
            && Objects.equals(this.flavor, getFirewallInstanceResponseData.flavor)
            && Objects.equals(this.protectObjects, getFirewallInstanceResponseData.protectObjects)
            && Objects.equals(this.status, getFirewallInstanceResponseData.status)
            && Objects.equals(this.description, getFirewallInstanceResponseData.description)
            && Objects.equals(this.isOldFirewallInstance, getFirewallInstanceResponseData.isOldFirewallInstance)
            && Objects.equals(this.supportIpv6, getFirewallInstanceResponseData.supportIpv6)
            && Objects.equals(this.featureToggle, getFirewallInstanceResponseData.featureToggle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId,
            resourceId,
            name,
            haType,
            chargeMode,
            serviceType,
            engineType,
            flavor,
            protectObjects,
            status,
            description,
            isOldFirewallInstance,
            supportIpv6,
            featureToggle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFirewallInstanceResponseData {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    protectObjects: ").append(toIndentedString(protectObjects)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isOldFirewallInstance: ").append(toIndentedString(isOldFirewallInstance)).append("\n");
        sb.append("    supportIpv6: ").append(toIndentedString(supportIpv6)).append("\n");
        sb.append("    featureToggle: ").append(toIndentedString(featureToggle)).append("\n");
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
