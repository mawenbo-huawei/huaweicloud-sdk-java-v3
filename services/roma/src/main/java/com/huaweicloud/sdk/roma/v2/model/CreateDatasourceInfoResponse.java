package com.huaweicloud.sdk.roma.v2.model;

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

/** Response Object */
public class CreateDatasourceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_name")

    private String datasourceName;

    /** 数据源类型 - DWS - MYSQL - KAFKA - API - OBS - SAP - MRSHBASE - MRSHDFS - MRSHIVE - WEBSOCKET - SQLSERVER - ORACLE -
     * POSTGRESQL - REDIS - MONGODB - DIS - HL7 - RABBITMQ - SNMP - IBMMQ - CUSTOMIZED (自定义类型) - ACTIVEMQ - ARTEMISMQ -
     * FTP - HIVE - HANA - FIKAFKA - MRSKAFKA - FIHDFS - FIHIVE - GAUSS200 - GAUSS100 - LDAP - DB2 - TAURUS */
    public static final class TypeEnum {

        /** Enum DWS for value: "DWS" */
        public static final TypeEnum DWS = new TypeEnum("DWS");

        /** Enum MYSQL for value: "MYSQL" */
        public static final TypeEnum MYSQL = new TypeEnum("MYSQL");

        /** Enum KAFKA for value: "KAFKA" */
        public static final TypeEnum KAFKA = new TypeEnum("KAFKA");

        /** Enum API for value: "API" */
        public static final TypeEnum API = new TypeEnum("API");

        /** Enum OBS for value: "OBS" */
        public static final TypeEnum OBS = new TypeEnum("OBS");

        /** Enum SAP for value: "SAP" */
        public static final TypeEnum SAP = new TypeEnum("SAP");

        /** Enum MRSHBASE for value: "MRSHBASE" */
        public static final TypeEnum MRSHBASE = new TypeEnum("MRSHBASE");

        /** Enum MRSHDFS for value: "MRSHDFS" */
        public static final TypeEnum MRSHDFS = new TypeEnum("MRSHDFS");

        /** Enum MRSHIVE for value: "MRSHIVE" */
        public static final TypeEnum MRSHIVE = new TypeEnum("MRSHIVE");

        /** Enum WEBSOCKET for value: "WEBSOCKET" */
        public static final TypeEnum WEBSOCKET = new TypeEnum("WEBSOCKET");

        /** Enum SQLSERVER for value: "SQLSERVER" */
        public static final TypeEnum SQLSERVER = new TypeEnum("SQLSERVER");

        /** Enum ORACLE for value: "ORACLE" */
        public static final TypeEnum ORACLE = new TypeEnum("ORACLE");

        /** Enum POSTGRESQL for value: "POSTGRESQL" */
        public static final TypeEnum POSTGRESQL = new TypeEnum("POSTGRESQL");

        /** Enum REDIS for value: "REDIS" */
        public static final TypeEnum REDIS = new TypeEnum("REDIS");

        /** Enum MONGODB for value: "MONGODB" */
        public static final TypeEnum MONGODB = new TypeEnum("MONGODB");

        /** Enum DIS for value: "DIS" */
        public static final TypeEnum DIS = new TypeEnum("DIS");

        /** Enum HL7 for value: "HL7" */
        public static final TypeEnum HL7 = new TypeEnum("HL7");

        /** Enum RABBITMQ for value: "RABBITMQ" */
        public static final TypeEnum RABBITMQ = new TypeEnum("RABBITMQ");

        /** Enum SNMP for value: "SNMP" */
        public static final TypeEnum SNMP = new TypeEnum("SNMP");

        /** Enum IBMMQ for value: "IBMMQ" */
        public static final TypeEnum IBMMQ = new TypeEnum("IBMMQ");

        /** Enum CUSTOMIZED for value: "CUSTOMIZED" */
        public static final TypeEnum CUSTOMIZED = new TypeEnum("CUSTOMIZED");

        /** Enum ACTIVEMQ for value: "ACTIVEMQ" */
        public static final TypeEnum ACTIVEMQ = new TypeEnum("ACTIVEMQ");

        /** Enum ARTEMISMQ for value: "ARTEMISMQ" */
        public static final TypeEnum ARTEMISMQ = new TypeEnum("ARTEMISMQ");

        /** Enum FTP for value: "FTP" */
        public static final TypeEnum FTP = new TypeEnum("FTP");

        /** Enum HIVE for value: "HIVE" */
        public static final TypeEnum HIVE = new TypeEnum("HIVE");

        /** Enum HANA for value: "HANA" */
        public static final TypeEnum HANA = new TypeEnum("HANA");

        /** Enum FIKAFKA for value: "FIKAFKA" */
        public static final TypeEnum FIKAFKA = new TypeEnum("FIKAFKA");

        /** Enum MRSKAFKA for value: "MRSKAFKA" */
        public static final TypeEnum MRSKAFKA = new TypeEnum("MRSKAFKA");

        /** Enum FIHDFS for value: "FIHDFS" */
        public static final TypeEnum FIHDFS = new TypeEnum("FIHDFS");

        /** Enum FIHIVE for value: "FIHIVE" */
        public static final TypeEnum FIHIVE = new TypeEnum("FIHIVE");

        /** Enum GAUSS200 for value: "GAUSS200" */
        public static final TypeEnum GAUSS200 = new TypeEnum("GAUSS200");

        /** Enum GAUSS100 for value: "GAUSS100" */
        public static final TypeEnum GAUSS100 = new TypeEnum("GAUSS100");

        /** Enum LDAP for value: "LDAP" */
        public static final TypeEnum LDAP = new TypeEnum("LDAP");

        /** Enum DB2 for value: "DB2" */
        public static final TypeEnum DB2 = new TypeEnum("DB2");

        /** Enum TAURUS for value: "TAURUS" */
        public static final TypeEnum TAURUS = new TypeEnum("TAURUS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DWS", DWS);
            map.put("MYSQL", MYSQL);
            map.put("KAFKA", KAFKA);
            map.put("API", API);
            map.put("OBS", OBS);
            map.put("SAP", SAP);
            map.put("MRSHBASE", MRSHBASE);
            map.put("MRSHDFS", MRSHDFS);
            map.put("MRSHIVE", MRSHIVE);
            map.put("WEBSOCKET", WEBSOCKET);
            map.put("SQLSERVER", SQLSERVER);
            map.put("ORACLE", ORACLE);
            map.put("POSTGRESQL", POSTGRESQL);
            map.put("REDIS", REDIS);
            map.put("MONGODB", MONGODB);
            map.put("DIS", DIS);
            map.put("HL7", HL7);
            map.put("RABBITMQ", RABBITMQ);
            map.put("SNMP", SNMP);
            map.put("IBMMQ", IBMMQ);
            map.put("CUSTOMIZED", CUSTOMIZED);
            map.put("ACTIVEMQ", ACTIVEMQ);
            map.put("ARTEMISMQ", ARTEMISMQ);
            map.put("FTP", FTP);
            map.put("HIVE", HIVE);
            map.put("HANA", HANA);
            map.put("FIKAFKA", FIKAFKA);
            map.put("MRSKAFKA", MRSKAFKA);
            map.put("FIHDFS", FIHDFS);
            map.put("FIHIVE", FIHIVE);
            map.put("GAUSS200", GAUSS200);
            map.put("GAUSS100", GAUSS100);
            map.put("LDAP", LDAP);
            map.put("DB2", DB2);
            map.put("TAURUS", TAURUS);
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
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_plugin_id")

    private String customPluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Content content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /** Gets or Sets appPermission */
    public static final class AppPermissionEnum {

        /** Enum READ for value: "read" */
        public static final AppPermissionEnum READ = new AppPermissionEnum("read");

        /** Enum ACCESS for value: "access" */
        public static final AppPermissionEnum ACCESS = new AppPermissionEnum("access");

        /** Enum DELETE for value: "delete" */
        public static final AppPermissionEnum DELETE = new AppPermissionEnum("delete");

        /** Enum MODIFY for value: "modify" */
        public static final AppPermissionEnum MODIFY = new AppPermissionEnum("modify");

        private static final Map<String, AppPermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppPermissionEnum> createStaticFields() {
            Map<String, AppPermissionEnum> map = new HashMap<>();
            map.put("read", READ);
            map.put("access", ACCESS);
            map.put("delete", DELETE);
            map.put("modify", MODIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppPermissionEnum(String value) {
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
        public static AppPermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AppPermissionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppPermissionEnum(value);
            }
            return result;
        }

        public static AppPermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AppPermissionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppPermissionEnum) {
                return this.value.equals(((AppPermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_permission")

    private List<AppPermissionEnum> appPermission = null;

    public CreateDatasourceInfoResponse withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /** 数据源ID
     * 
     * @return datasourceId */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public CreateDatasourceInfoResponse withDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }

    /** 数据源名称
     * 
     * @return datasourceName */
    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public CreateDatasourceInfoResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 数据源类型 - DWS - MYSQL - KAFKA - API - OBS - SAP - MRSHBASE - MRSHDFS - MRSHIVE - WEBSOCKET - SQLSERVER - ORACLE -
     * POSTGRESQL - REDIS - MONGODB - DIS - HL7 - RABBITMQ - SNMP - IBMMQ - CUSTOMIZED (自定义类型) - ACTIVEMQ - ARTEMISMQ -
     * FTP - HIVE - HANA - FIKAFKA - MRSKAFKA - FIHDFS - FIHIVE - GAUSS200 - GAUSS100 - LDAP - DB2 - TAURUS
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateDatasourceInfoResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 数据源所属虚拟私有云VpcId
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateDatasourceInfoResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 数据源所属应用ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateDatasourceInfoResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 数据源所属应用名称
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateDatasourceInfoResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 数据源所属实例Id
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateDatasourceInfoResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 数据源创建时间 minimum: 0 maximum: 99999999999999999
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateDatasourceInfoResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 数据源修改时间 minimum: 0 maximum: 99999999999999999
     * 
     * @return updateTime */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateDatasourceInfoResponse withCustomPluginId(String customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }

    /** 数据源所属连接器Id
     * 
     * @return customPluginId */
    public String getCustomPluginId() {
        return customPluginId;
    }

    public void setCustomPluginId(String customPluginId) {
        this.customPluginId = customPluginId;
    }

    public CreateDatasourceInfoResponse withContent(Content content) {
        this.content = content;
        return this;
    }

    public CreateDatasourceInfoResponse withContent(Consumer<Content> contentSetter) {
        if (this.content == null) {
            this.content = new Content();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /** Get content
     * 
     * @return content */
    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public CreateDatasourceInfoResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 数据源描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDatasourceInfoResponse withAppPermission(List<AppPermissionEnum> appPermission) {
        this.appPermission = appPermission;
        return this;
    }

    public CreateDatasourceInfoResponse addAppPermissionItem(AppPermissionEnum appPermissionItem) {
        if (this.appPermission == null) {
            this.appPermission = new ArrayList<>();
        }
        this.appPermission.add(appPermissionItem);
        return this;
    }

    public CreateDatasourceInfoResponse withAppPermission(Consumer<List<AppPermissionEnum>> appPermissionSetter) {
        if (this.appPermission == null) {
            this.appPermission = new ArrayList<>();
        }
        appPermissionSetter.accept(this.appPermission);
        return this;
    }

    /** 集成应用权限信息 - read (读权限) - access (调用权限) - delete (删除权限) - modify (修改权限)
     * 
     * @return appPermission */
    public List<AppPermissionEnum> getAppPermission() {
        return appPermission;
    }

    public void setAppPermission(List<AppPermissionEnum> appPermission) {
        this.appPermission = appPermission;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatasourceInfoResponse createDatasourceInfoResponse = (CreateDatasourceInfoResponse) o;
        return Objects.equals(this.datasourceId, createDatasourceInfoResponse.datasourceId)
            && Objects.equals(this.datasourceName, createDatasourceInfoResponse.datasourceName)
            && Objects.equals(this.type, createDatasourceInfoResponse.type)
            && Objects.equals(this.vpcId, createDatasourceInfoResponse.vpcId)
            && Objects.equals(this.appId, createDatasourceInfoResponse.appId)
            && Objects.equals(this.appName, createDatasourceInfoResponse.appName)
            && Objects.equals(this.instanceId, createDatasourceInfoResponse.instanceId)
            && Objects.equals(this.createTime, createDatasourceInfoResponse.createTime)
            && Objects.equals(this.updateTime, createDatasourceInfoResponse.updateTime)
            && Objects.equals(this.customPluginId, createDatasourceInfoResponse.customPluginId)
            && Objects.equals(this.content, createDatasourceInfoResponse.content)
            && Objects.equals(this.description, createDatasourceInfoResponse.description)
            && Objects.equals(this.appPermission, createDatasourceInfoResponse.appPermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceId,
            datasourceName,
            type,
            vpcId,
            appId,
            appName,
            instanceId,
            createTime,
            updateTime,
            customPluginId,
            content,
            description,
            appPermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatasourceInfoResponse {\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    customPluginId: ").append(toIndentedString(customPluginId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    appPermission: ").append(toIndentedString(appPermission)).append("\n");
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