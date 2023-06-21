package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiOverview
 */
public class ApiOverview {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * API状态
     */
    public static final class StatusEnum {

        /**
         * Enum API_STATUS_CREATED for value: "API_STATUS_CREATED"
         */
        public static final StatusEnum API_STATUS_CREATED = new StatusEnum("API_STATUS_CREATED");

        /**
         * Enum API_STATUS_PUBLISH_WAIT_REVIEW for value: "API_STATUS_PUBLISH_WAIT_REVIEW"
         */
        public static final StatusEnum API_STATUS_PUBLISH_WAIT_REVIEW =
            new StatusEnum("API_STATUS_PUBLISH_WAIT_REVIEW");

        /**
         * Enum API_STATUS_PUBLISH_REJECT for value: "API_STATUS_PUBLISH_REJECT"
         */
        public static final StatusEnum API_STATUS_PUBLISH_REJECT = new StatusEnum("API_STATUS_PUBLISH_REJECT");

        /**
         * Enum API_STATUS_PUBLISHED for value: "API_STATUS_PUBLISHED"
         */
        public static final StatusEnum API_STATUS_PUBLISHED = new StatusEnum("API_STATUS_PUBLISHED");

        /**
         * Enum API_STATUS_WAITING_STOP for value: "API_STATUS_WAITING_STOP"
         */
        public static final StatusEnum API_STATUS_WAITING_STOP = new StatusEnum("API_STATUS_WAITING_STOP");

        /**
         * Enum API_STATUS_STOPPED for value: "API_STATUS_STOPPED"
         */
        public static final StatusEnum API_STATUS_STOPPED = new StatusEnum("API_STATUS_STOPPED");

        /**
         * Enum API_STATUS_RECOVER_WAIT_REVIEW for value: "API_STATUS_RECOVER_WAIT_REVIEW"
         */
        public static final StatusEnum API_STATUS_RECOVER_WAIT_REVIEW =
            new StatusEnum("API_STATUS_RECOVER_WAIT_REVIEW");

        /**
         * Enum API_STATUS_WAITING_OFFLINE for value: "API_STATUS_WAITING_OFFLINE"
         */
        public static final StatusEnum API_STATUS_WAITING_OFFLINE = new StatusEnum("API_STATUS_WAITING_OFFLINE");

        /**
         * Enum API_STATUS_OFFLINE for value: "API_STATUS_OFFLINE"
         */
        public static final StatusEnum API_STATUS_OFFLINE = new StatusEnum("API_STATUS_OFFLINE");

        /**
         * Enum API_STATUS_OFFLINE_WAIT_REVIEW for value: "API_STATUS_OFFLINE_WAIT_REVIEW"
         */
        public static final StatusEnum API_STATUS_OFFLINE_WAIT_REVIEW =
            new StatusEnum("API_STATUS_OFFLINE_WAIT_REVIEW");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("API_STATUS_CREATED", API_STATUS_CREATED);
            map.put("API_STATUS_PUBLISH_WAIT_REVIEW", API_STATUS_PUBLISH_WAIT_REVIEW);
            map.put("API_STATUS_PUBLISH_REJECT", API_STATUS_PUBLISH_REJECT);
            map.put("API_STATUS_PUBLISHED", API_STATUS_PUBLISHED);
            map.put("API_STATUS_WAITING_STOP", API_STATUS_WAITING_STOP);
            map.put("API_STATUS_STOPPED", API_STATUS_STOPPED);
            map.put("API_STATUS_RECOVER_WAIT_REVIEW", API_STATUS_RECOVER_WAIT_REVIEW);
            map.put("API_STATUS_WAITING_OFFLINE", API_STATUS_WAITING_OFFLINE);
            map.put("API_STATUS_OFFLINE", API_STATUS_OFFLINE);
            map.put("API_STATUS_OFFLINE_WAIT_REVIEW", API_STATUS_OFFLINE_WAIT_REVIEW);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
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

    /**
     * API调试状态
     */
    public static final class DebugStatusEnum {

        /**
         * Enum API_DEBUG_WAITING for value: "API_DEBUG_WAITING"
         */
        public static final DebugStatusEnum API_DEBUG_WAITING = new DebugStatusEnum("API_DEBUG_WAITING");

        /**
         * Enum API_DEBUG_FAILED for value: "API_DEBUG_FAILED"
         */
        public static final DebugStatusEnum API_DEBUG_FAILED = new DebugStatusEnum("API_DEBUG_FAILED");

        /**
         * Enum API_DEBUG_SUCCESS for value: "API_DEBUG_SUCCESS"
         */
        public static final DebugStatusEnum API_DEBUG_SUCCESS = new DebugStatusEnum("API_DEBUG_SUCCESS");

        private static final Map<String, DebugStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DebugStatusEnum> createStaticFields() {
            Map<String, DebugStatusEnum> map = new HashMap<>();
            map.put("API_DEBUG_WAITING", API_DEBUG_WAITING);
            map.put("API_DEBUG_FAILED", API_DEBUG_FAILED);
            map.put("API_DEBUG_SUCCESS", API_DEBUG_SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DebugStatusEnum(String value) {
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
        public static DebugStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DebugStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DebugStatusEnum(value);
            }
            return result;
        }

        public static DebugStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DebugStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DebugStatusEnum) {
                return this.value.equals(((DebugStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debug_status")

    private DebugStatusEnum debugStatus;

    /**
     * API 类型
     */
    public static final class TypeEnum {

        /**
         * Enum API_SPECIFIC_TYPE_CONFIGURATION for value: "API_SPECIFIC_TYPE_CONFIGURATION"
         */
        public static final TypeEnum API_SPECIFIC_TYPE_CONFIGURATION = new TypeEnum("API_SPECIFIC_TYPE_CONFIGURATION");

        /**
         * Enum API_SPECIFIC_TYPE_SCRIPT for value: "API_SPECIFIC_TYPE_SCRIPT"
         */
        public static final TypeEnum API_SPECIFIC_TYPE_SCRIPT = new TypeEnum("API_SPECIFIC_TYPE_SCRIPT");

        /**
         * Enum API_SPECIFIC_TYPE_REGISTER for value: "API_SPECIFIC_TYPE_REGISTER"
         */
        public static final TypeEnum API_SPECIFIC_TYPE_REGISTER = new TypeEnum("API_SPECIFIC_TYPE_REGISTER");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("API_SPECIFIC_TYPE_CONFIGURATION", API_SPECIFIC_TYPE_CONFIGURATION);
            map.put("API_SPECIFIC_TYPE_SCRIPT", API_SPECIFIC_TYPE_SCRIPT);
            map.put("API_SPECIFIC_TYPE_REGISTER", API_SPECIFIC_TYPE_REGISTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private String manager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public ApiOverview withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiOverview withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiOverview withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API分组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ApiOverview withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * API描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiOverview withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * API状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ApiOverview withDebugStatus(DebugStatusEnum debugStatus) {
        this.debugStatus = debugStatus;
        return this;
    }

    /**
     * API调试状态
     * @return debugStatus
     */
    public DebugStatusEnum getDebugStatus() {
        return debugStatus;
    }

    public void setDebugStatus(DebugStatusEnum debugStatus) {
        this.debugStatus = debugStatus;
    }

    public ApiOverview withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * API 类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ApiOverview withManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * API审核人
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ApiOverview withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * API创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ApiOverview withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * API 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOverview apiOverview = (ApiOverview) o;
        return Objects.equals(this.id, apiOverview.id) && Objects.equals(this.name, apiOverview.name)
            && Objects.equals(this.groupId, apiOverview.groupId)
            && Objects.equals(this.description, apiOverview.description)
            && Objects.equals(this.status, apiOverview.status)
            && Objects.equals(this.debugStatus, apiOverview.debugStatus) && Objects.equals(this.type, apiOverview.type)
            && Objects.equals(this.manager, apiOverview.manager)
            && Objects.equals(this.createUser, apiOverview.createUser)
            && Objects.equals(this.createTime, apiOverview.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, groupId, description, status, debugStatus, type, manager, createUser, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOverview {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    debugStatus: ").append(toIndentedString(debugStatus)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
