package com.huaweicloud.sdk.rds.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数模板信息。
 */
public class ConfigurationSummary  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_version_name")
    
    private String datastoreVersionName;
    /**
     * 引擎名。
     */
    public static final class DatastoreNameEnum {

        
        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final DatastoreNameEnum MYSQL = new DatastoreNameEnum("mysql");
        
        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final DatastoreNameEnum POSTGRESQL = new DatastoreNameEnum("postgresql");
        
        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final DatastoreNameEnum SQLSERVER = new DatastoreNameEnum("sqlserver");
        

        private static final Map<String, DatastoreNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreNameEnum> createStaticFields() {
            Map<String, DatastoreNameEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreNameEnum(String value) {
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
        public static DatastoreNameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DatastoreNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatastoreNameEnum(value);
            }
            return result;
        }

        public static DatastoreNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DatastoreNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DatastoreNameEnum) {
                return this.value.equals(((DatastoreNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_name")
    
    private DatastoreNameEnum datastoreName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_defined")
    
    private Boolean userDefined;

    public ConfigurationSummary withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigurationSummary withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationSummary withDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
        return this;
    }

    


    /**
     * 引擎版本。
     * @return datastoreVersionName
     */
    public String getDatastoreVersionName() {
        return datastoreVersionName;
    }

    public void setDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
    }

    public ConfigurationSummary withDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    


    /**
     * 引擎名。
     * @return datastoreName
     */
    public DatastoreNameEnum getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ConfigurationSummary withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ConfigurationSummary withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ConfigurationSummary withUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
        return this;
    }

    


    /**
     * 是否是用户自定义参数模板：  - false，表示为系统默认参数模板。 - true，表示为用户自定义参数模板。
     * @return userDefined
     */
    public Boolean getUserDefined() {
        return userDefined;
    }

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationSummary configurationSummary = (ConfigurationSummary) o;
        return Objects.equals(this.id, configurationSummary.id) &&
            Objects.equals(this.name, configurationSummary.name) &&
            Objects.equals(this.description, configurationSummary.description) &&
            Objects.equals(this.datastoreVersionName, configurationSummary.datastoreVersionName) &&
            Objects.equals(this.datastoreName, configurationSummary.datastoreName) &&
            Objects.equals(this.created, configurationSummary.created) &&
            Objects.equals(this.updated, configurationSummary.updated) &&
            Objects.equals(this.userDefined, configurationSummary.userDefined);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, datastoreVersionName, datastoreName, created, updated, userDefined);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationSummary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastoreVersionName: ").append(toIndentedString(datastoreVersionName)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

