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
 * 计费类型信息，支持包年包月和按需，默认为按需。
 */
public class ChargeInfoResponse  {

    /**
     * 计费模式。  取值范围：  - prePaid：预付费，即包年/包月。 - postPaid：后付费，即按需付费。
     */
    public static class ChargeModeEnum {

        
        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargeModeEnum PREPAID = new ChargeModeEnum("prePaid");
        
        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postPaid");
        

        public static final Map<String, ChargeModeEnum> staticFields = new HashMap<String, ChargeModeEnum>() {
            { 
                put("prePaid", PREPAID);
                put("postPaid", POSTPAID);
            }
        };

        private String value;

        ChargeModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargeModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargeModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private ChargeModeEnum chargeMode;

    public ChargeInfoResponse withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式。  取值范围：  - prePaid：预付费，即包年/包月。 - postPaid：后付费，即按需付费。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChargeInfoResponse chargeInfoResponse = (ChargeInfoResponse) o;
        return Objects.equals(this.chargeMode, chargeInfoResponse.chargeMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargeMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChargeInfoResponse {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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

