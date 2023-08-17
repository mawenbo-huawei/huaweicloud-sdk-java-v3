package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class AddEcnWithErResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    /**
     * 健康状态
     */
    public static final class HealthStatusEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final HealthStatusEnum NORMAL = new HealthStatusEnum("normal");

        /**
         * Enum SUB_HEALTH for value: "sub_health"
         */
        public static final HealthStatusEnum SUB_HEALTH = new HealthStatusEnum("sub_health");

        /**
         * Enum FAULT for value: "fault"
         */
        public static final HealthStatusEnum FAULT = new HealthStatusEnum("fault");

        private static final Map<String, HealthStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HealthStatusEnum> createStaticFields() {
            Map<String, HealthStatusEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("sub_health", SUB_HEALTH);
            map.put("fault", FAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HealthStatusEnum(String value) {
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
        public static HealthStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HealthStatusEnum(value));
        }

        public static HealthStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HealthStatusEnum) {
                return this.value.equals(((HealthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_status")

    private HealthStatusEnum healthStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public AddEcnWithErResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 企业连接网络关联企业路由器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddEcnWithErResponse withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public AddEcnWithErResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AddEcnWithErResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AddEcnWithErResponse withHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * 健康状态
     * @return healthStatus
     */
    public HealthStatusEnum getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
    }

    public AddEcnWithErResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddEcnWithErResponse that = (AddEcnWithErResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.erId, that.erId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.healthStatus, that.healthStatus) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, erId, regionId, status, healthStatus, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEcnWithErResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
