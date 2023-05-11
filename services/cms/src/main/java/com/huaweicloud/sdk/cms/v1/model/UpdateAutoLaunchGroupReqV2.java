package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateAutoLaunchGroupReqV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guarantee_plan_id")

    private String guaranteePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_capacity")

    private Integer targetCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stable_capacity")

    private Integer stableCapacity;

    /**
     * 超过目标容量时（目标容量减少）实例中断行为 terminate|noTermination terminate：释放 noTermination：不释放 默认值：terminate
     */
    public static final class ExcessFulfilledCapacityBehaviorEnum {

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final ExcessFulfilledCapacityBehaviorEnum TERMINATE =
            new ExcessFulfilledCapacityBehaviorEnum("terminate");

        /**
         * Enum NOTERMINATION for value: "noTermination"
         */
        public static final ExcessFulfilledCapacityBehaviorEnum NOTERMINATION =
            new ExcessFulfilledCapacityBehaviorEnum("noTermination");

        private static final Map<String, ExcessFulfilledCapacityBehaviorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExcessFulfilledCapacityBehaviorEnum> createStaticFields() {
            Map<String, ExcessFulfilledCapacityBehaviorEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("noTermination", NOTERMINATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExcessFulfilledCapacityBehaviorEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExcessFulfilledCapacityBehaviorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExcessFulfilledCapacityBehaviorEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExcessFulfilledCapacityBehaviorEnum(value);
            }
            return result;
        }

        public static ExcessFulfilledCapacityBehaviorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExcessFulfilledCapacityBehaviorEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExcessFulfilledCapacityBehaviorEnum) {
                return this.value.equals(((ExcessFulfilledCapacityBehaviorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excess_fulfilled_capacity_behavior")

    private ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior;

    /**
     * 请求到期正在运行实例中断行为 terminate|noTermination terminate：释放 noTermination：不释放 默认值：terminate
     */
    public static final class InstancesBehaviorWithExpirationEnum {

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final InstancesBehaviorWithExpirationEnum TERMINATE =
            new InstancesBehaviorWithExpirationEnum("terminate");

        /**
         * Enum NOTERMINATION for value: "noTermination"
         */
        public static final InstancesBehaviorWithExpirationEnum NOTERMINATION =
            new InstancesBehaviorWithExpirationEnum("noTermination");

        private static final Map<String, InstancesBehaviorWithExpirationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstancesBehaviorWithExpirationEnum> createStaticFields() {
            Map<String, InstancesBehaviorWithExpirationEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("noTermination", NOTERMINATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstancesBehaviorWithExpirationEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InstancesBehaviorWithExpirationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InstancesBehaviorWithExpirationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstancesBehaviorWithExpirationEnum(value);
            }
            return result;
        }

        public static InstancesBehaviorWithExpirationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstancesBehaviorWithExpirationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstancesBehaviorWithExpirationEnum) {
                return this.value.equals(((InstancesBehaviorWithExpirationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances_behavior_with_expiration")

    private InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_price")

    private Double spotPrice;

    public UpdateAutoLaunchGroupReqV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * autoLaunchGroup名称(1-64个字符)，只能包含中文、字母、数字、下划线或中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAutoLaunchGroupReqV2 withGuaranteePlanId(String guaranteePlanId) {
        this.guaranteePlanId = guaranteePlanId;
        return this;
    }

    /**
     * 保障计划id
     * @return guaranteePlanId
     */
    public String getGuaranteePlanId() {
        return guaranteePlanId;
    }

    public void setGuaranteePlanId(String guaranteePlanId) {
        this.guaranteePlanId = guaranteePlanId;
    }

    public UpdateAutoLaunchGroupReqV2 withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * autoLaunchGroup请求的目标容量 实例数量或者CPU个数         最小数量   最大数量 实例个数      1        500 CPU核数      1        40000 如果目标容量变小，则进行缩容，释放spot实例虚拟机 如果变大，则进行扩容，创建虚拟机
     * minimum: 0
     * @return targetCapacity
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }

    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    public UpdateAutoLaunchGroupReqV2 withStableCapacity(Integer stableCapacity) {
        this.stableCapacity = stableCapacity;
        return this;
    }

    /**
     * 按需实例目标容量，提供最低算力 大于等于0，小于target_capacity 非必填的原因是智能购买组中可以没有按需实例 如果stable_capacity变大，需要创建按需实例。大致方案是：从修改时刻开始，在这个时长内完成按需实例的创建，如果这时间超过结束时间，则以结束时间为最小容量的完成时间； 如果stable_capacity变小，按需实例也会删除
     * minimum: 0
     * @return stableCapacity
     */
    public Integer getStableCapacity() {
        return stableCapacity;
    }

    public void setStableCapacity(Integer stableCapacity) {
        this.stableCapacity = stableCapacity;
    }

    public UpdateAutoLaunchGroupReqV2 withExcessFulfilledCapacityBehavior(
        ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior) {
        this.excessFulfilledCapacityBehavior = excessFulfilledCapacityBehavior;
        return this;
    }

    /**
     * 超过目标容量时（目标容量减少）实例中断行为 terminate|noTermination terminate：释放 noTermination：不释放 默认值：terminate
     * @return excessFulfilledCapacityBehavior
     */
    public ExcessFulfilledCapacityBehaviorEnum getExcessFulfilledCapacityBehavior() {
        return excessFulfilledCapacityBehavior;
    }

    public void setExcessFulfilledCapacityBehavior(
        ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior) {
        this.excessFulfilledCapacityBehavior = excessFulfilledCapacityBehavior;
    }

    public UpdateAutoLaunchGroupReqV2 withInstancesBehaviorWithExpiration(
        InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration) {
        this.instancesBehaviorWithExpiration = instancesBehaviorWithExpiration;
        return this;
    }

    /**
     * 请求到期正在运行实例中断行为 terminate|noTermination terminate：释放 noTermination：不释放 默认值：terminate
     * @return instancesBehaviorWithExpiration
     */
    public InstancesBehaviorWithExpirationEnum getInstancesBehaviorWithExpiration() {
        return instancesBehaviorWithExpiration;
    }

    public void setInstancesBehaviorWithExpiration(
        InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration) {
        this.instancesBehaviorWithExpiration = instancesBehaviorWithExpiration;
    }

    public UpdateAutoLaunchGroupReqV2 withSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * 用户愿意为竞价实例每小时支付的最高价格。为全局spot实例的价格，如果overrides中没有提供价格，使用该价格
     * @return spotPrice
     */
    public Double getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAutoLaunchGroupReqV2 updateAutoLaunchGroupReqV2 = (UpdateAutoLaunchGroupReqV2) o;
        return Objects.equals(this.name, updateAutoLaunchGroupReqV2.name)
            && Objects.equals(this.guaranteePlanId, updateAutoLaunchGroupReqV2.guaranteePlanId)
            && Objects.equals(this.targetCapacity, updateAutoLaunchGroupReqV2.targetCapacity)
            && Objects.equals(this.stableCapacity, updateAutoLaunchGroupReqV2.stableCapacity)
            && Objects.equals(this.excessFulfilledCapacityBehavior,
                updateAutoLaunchGroupReqV2.excessFulfilledCapacityBehavior)
            && Objects.equals(this.instancesBehaviorWithExpiration,
                updateAutoLaunchGroupReqV2.instancesBehaviorWithExpiration)
            && Objects.equals(this.spotPrice, updateAutoLaunchGroupReqV2.spotPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            guaranteePlanId,
            targetCapacity,
            stableCapacity,
            excessFulfilledCapacityBehavior,
            instancesBehaviorWithExpiration,
            spotPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoLaunchGroupReqV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    guaranteePlanId: ").append(toIndentedString(guaranteePlanId)).append("\n");
        sb.append("    targetCapacity: ").append(toIndentedString(targetCapacity)).append("\n");
        sb.append("    stableCapacity: ").append(toIndentedString(stableCapacity)).append("\n");
        sb.append("    excessFulfilledCapacityBehavior: ")
            .append(toIndentedString(excessFulfilledCapacityBehavior))
            .append("\n");
        sb.append("    instancesBehaviorWithExpiration: ")
            .append(toIndentedString(instancesBehaviorWithExpiration))
            .append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
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