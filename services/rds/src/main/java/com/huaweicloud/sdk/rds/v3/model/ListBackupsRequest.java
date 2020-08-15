package com.huaweicloud.sdk.rds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListBackupsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;
    /**
     * Gets or Sets backupType
     */
    public static class BackupTypeEnum {

        
        /**
         * Enum AUTO for value: "auto"
         */
        public static final BackupTypeEnum AUTO = new BackupTypeEnum("auto");
        
        /**
         * Enum MANUAL for value: "manual"
         */
        public static final BackupTypeEnum MANUAL = new BackupTypeEnum("manual");
        
        /**
         * Enum FRAGMENT for value: "fragment"
         */
        public static final BackupTypeEnum FRAGMENT = new BackupTypeEnum("fragment");
        
        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final BackupTypeEnum INCREMENTAL = new BackupTypeEnum("incremental");
        

        public static final Map<String, BackupTypeEnum> staticFields = new HashMap<String, BackupTypeEnum>() {
            { 
                put("auto", AUTO);
                put("manual", MANUAL);
                put("fragment", FRAGMENT);
                put("incremental", INCREMENTAL);
            }
        };

        private String value;

        BackupTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BackupTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BackupTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new BackupTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static BackupTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BackupTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BackupTypeEnum) {
                return this.value.equals(((BackupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_type")
    
    private BackupTypeEnum backupType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ListBackupsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListBackupsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBackupsRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * Get backupId
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ListBackupsRequest withBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
        return this;
    }

    


    /**
     * Get backupType
     * @return backupType
     */
    public BackupTypeEnum getBackupType() {
        return backupType;
    }

    public void setBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
    }

    public ListBackupsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListBackupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListBackupsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * Get beginTime
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListBackupsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsRequest listBackupsRequest = (ListBackupsRequest) o;
        return Objects.equals(this.xLanguage, listBackupsRequest.xLanguage) &&
            Objects.equals(this.instanceId, listBackupsRequest.instanceId) &&
            Objects.equals(this.backupId, listBackupsRequest.backupId) &&
            Objects.equals(this.backupType, listBackupsRequest.backupType) &&
            Objects.equals(this.offset, listBackupsRequest.offset) &&
            Objects.equals(this.limit, listBackupsRequest.limit) &&
            Objects.equals(this.beginTime, listBackupsRequest.beginTime) &&
            Objects.equals(this.endTime, listBackupsRequest.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, backupId, backupType, offset, limit, beginTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

