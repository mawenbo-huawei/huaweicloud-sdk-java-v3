package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 类型。
 */
public class ExternalAccessType {
    
    /**
     * Enum AUTO_GENERATED for value: "AUTO_GENERATED"
     */
    public static final ExternalAccessType AUTO_GENERATED = new ExternalAccessType("AUTO_GENERATED");
    
    /**
     * Enum SPECIFIED for value: "SPECIFIED"
     */
    public static final ExternalAccessType SPECIFIED = new ExternalAccessType("SPECIFIED");
    
    /**
     * Enum IP_ADDR for value: "IP_ADDR"
     */
    public static final ExternalAccessType IP_ADDR = new ExternalAccessType("IP_ADDR");
    

    private static final Map<String, ExternalAccessType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ExternalAccessType> createStaticFields() {
        Map<String, ExternalAccessType> map = new HashMap<>();
        map.put("AUTO_GENERATED", AUTO_GENERATED);
        map.put("SPECIFIED", SPECIFIED);
        map.put("IP_ADDR", IP_ADDR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ExternalAccessType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExternalAccessType fromValue(String value) {
        if( value == null ){
            return null;
        }
        ExternalAccessType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ExternalAccessType(value);
        }
        return result;
    }

    public static ExternalAccessType valueOf(String value) {
        if( value == null ){
            return null;
        }
        ExternalAccessType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ExternalAccessType) {
            return this.value.equals(((ExternalAccessType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

