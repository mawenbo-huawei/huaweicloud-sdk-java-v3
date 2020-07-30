package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.BackendParamBase;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BackendParam
 */
public class BackendParam  {

    /**
     * 参数类别：REQUEST、CONSTANT、SYSTEM
     */
    public static class OriginEnum {

        
        /**
         * Enum REQUEST for value: "REQUEST"
         */
        public static final OriginEnum REQUEST = new OriginEnum("REQUEST");
        
        /**
         * Enum CONSTANT for value: "CONSTANT"
         */
        public static final OriginEnum CONSTANT = new OriginEnum("CONSTANT");
        
        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final OriginEnum SYSTEM = new OriginEnum("SYSTEM");
        

        public static final Map<String, OriginEnum> staticFields = new HashMap<String, OriginEnum>() {
            { 
                put("REQUEST", REQUEST);
                put("CONSTANT", CONSTANT);
                put("SYSTEM", SYSTEM);
            }
        };

        private String value;

        OriginEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OriginEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OriginEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OriginEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OriginEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OriginEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin")
    
    private OriginEnum origin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;
    /**
     * 参数位置：PATH、QUERY、HEADER
     */
    public static class LocationEnum {

        
        /**
         * Enum PATH for value: "PATH"
         */
        public static final LocationEnum PATH = new LocationEnum("PATH");
        
        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final LocationEnum QUERY = new LocationEnum("QUERY");
        
        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final LocationEnum HEADER = new LocationEnum("HEADER");
        

        public static final Map<String, LocationEnum> staticFields = new HashMap<String, LocationEnum>() {
            { 
                put("PATH", PATH);
                put("QUERY", QUERY);
                put("HEADER", HEADER);
            }
        };

        private String value;

        LocationEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new LocationEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static LocationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private LocationEnum location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_param_id")
    
    private String reqParamId;

    public BackendParam withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    


    /**
     * 参数类别：REQUEST、CONSTANT、SYSTEM
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public BackendParam withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数名称。 字符串由英文字母、数字、中划线、下划线、英文句号组成，且只能以英文开头。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackendParam withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述。字符长度不超过255 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackendParam withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    


    /**
     * 参数位置：PATH、QUERY、HEADER
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public BackendParam withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 参数值。字符长度不超过255，类别为REQUEST时，值为req_params中的参数名称；类别为CONSTANT时，值为参数真正的值；类别为SYSTEM时，值为网关参数名称
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BackendParam withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackendParam withReqParamId(String reqParamId) {
        this.reqParamId = reqParamId;
        return this;
    }

    


    /**
     * 对应的请求参数编号
     * @return reqParamId
     */
    public String getReqParamId() {
        return reqParamId;
    }

    public void setReqParamId(String reqParamId) {
        this.reqParamId = reqParamId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackendParam backendParam = (BackendParam) o;
        return Objects.equals(this.origin, backendParam.origin) &&
            Objects.equals(this.name, backendParam.name) &&
            Objects.equals(this.remark, backendParam.remark) &&
            Objects.equals(this.location, backendParam.location) &&
            Objects.equals(this.value, backendParam.value) &&
            Objects.equals(this.id, backendParam.id) &&
            Objects.equals(this.reqParamId, backendParam.reqParamId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(origin, name, remark, location, value, id, reqParamId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendParam {\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reqParamId: ").append(toIndentedString(reqParamId)).append("\n");
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

