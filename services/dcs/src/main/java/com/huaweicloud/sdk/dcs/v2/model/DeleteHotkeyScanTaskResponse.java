package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteHotkeyScanTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 分析任务状态
     */
    public static final class StatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 分析方式
     */
    public static final class ScanTypeEnum {

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final ScanTypeEnum MANUAL = new ScanTypeEnum("manual");

        /**
         * Enum AUTO for value: "auto"
         */
        public static final ScanTypeEnum AUTO = new ScanTypeEnum("auto");

        private static final Map<String, ScanTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScanTypeEnum> createStaticFields() {
            Map<String, ScanTypeEnum> map = new HashMap<>();
            map.put("manual", MANUAL);
            map.put("auto", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScanTypeEnum(String value) {
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
        public static ScanTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScanTypeEnum(value));
        }

        public static ScanTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScanTypeEnum) {
                return this.value.equals(((ScanTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private ScanTypeEnum scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_at")

    private String startedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_at")

    private String finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<HotkeysBody> keys = null;

    public DeleteHotkeyScanTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 热key分析记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteHotkeyScanTaskResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteHotkeyScanTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 分析任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DeleteHotkeyScanTaskResponse withScanType(ScanTypeEnum scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * 分析方式
     * @return scanType
     */
    public ScanTypeEnum getScanType() {
        return scanType;
    }

    public void setScanType(ScanTypeEnum scanType) {
        this.scanType = scanType;
    }

    public DeleteHotkeyScanTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 分析任务创建时间,格式为：\"2020-06-15T02:21:18.669Z\"
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DeleteHotkeyScanTaskResponse withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * 分析任务开始时间,格式为：\"2020-06-15T02:21:18.669Z\"
     * @return startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public DeleteHotkeyScanTaskResponse withFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * 分析任务结束时间,格式为：\"2020-06-15T02:21:18.669Z\"
     * @return finishedAt
     */
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public DeleteHotkeyScanTaskResponse withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 热key的数量
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public DeleteHotkeyScanTaskResponse withKeys(List<HotkeysBody> keys) {
        this.keys = keys;
        return this;
    }

    public DeleteHotkeyScanTaskResponse addKeysItem(HotkeysBody keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public DeleteHotkeyScanTaskResponse withKeys(Consumer<List<HotkeysBody>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    /**
     * 热key记录
     * @return keys
     */
    public List<HotkeysBody> getKeys() {
        return keys;
    }

    public void setKeys(List<HotkeysBody> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteHotkeyScanTaskResponse that = (DeleteHotkeyScanTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.scanType, that.scanType)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.startedAt, that.startedAt)
            && Objects.equals(this.finishedAt, that.finishedAt) && Objects.equals(this.num, that.num)
            && Objects.equals(this.keys, that.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, status, scanType, createdAt, startedAt, finishedAt, num, keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHotkeyScanTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
