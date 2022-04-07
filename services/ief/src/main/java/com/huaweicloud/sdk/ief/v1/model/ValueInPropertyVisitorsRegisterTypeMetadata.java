package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 静态属性的元数据信息，默认为{\&quot;type\&quot;: \&quot;string\&quot;} */
public class ValueInPropertyVisitorsRegisterTypeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ValueInPropertyVisitorsRegisterTypeMetadata withType(String type) {
        this.type = type;
        return this;
    }

    /** 属性类型标识，string|int|float|boolean（boolean类型为true或false），默认为string
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueInPropertyVisitorsRegisterTypeMetadata valueInPropertyVisitorsRegisterTypeMetadata =
            (ValueInPropertyVisitorsRegisterTypeMetadata) o;
        return Objects.equals(this.type, valueInPropertyVisitorsRegisterTypeMetadata.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueInPropertyVisitorsRegisterTypeMetadata {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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