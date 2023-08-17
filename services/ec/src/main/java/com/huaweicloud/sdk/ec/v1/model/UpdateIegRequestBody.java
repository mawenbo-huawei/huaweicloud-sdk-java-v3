package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateIegRequestBody
 */
public class UpdateIegRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 高可用性
     */
    public static final class HighAvailabilityEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final HighAvailabilityEnum SINGLE = new HighAvailabilityEnum("single");

        /**
         * Enum DOUBLE for value: "double"
         */
        public static final HighAvailabilityEnum DOUBLE = new HighAvailabilityEnum("double");

        private static final Map<String, HighAvailabilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HighAvailabilityEnum> createStaticFields() {
            Map<String, HighAvailabilityEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("double", DOUBLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HighAvailabilityEnum(String value) {
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
        public static HighAvailabilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HighAvailabilityEnum(value));
        }

        public static HighAvailabilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HighAvailabilityEnum) {
                return this.value.equals(((HighAvailabilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_availability")

    private HighAvailabilityEnum highAvailability;

    public UpdateIegRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 智能企业网关名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIegRequestBody withHighAvailability(HighAvailabilityEnum highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * 高可用性
     * @return highAvailability
     */
    public HighAvailabilityEnum getHighAvailability() {
        return highAvailability;
    }

    public void setHighAvailability(HighAvailabilityEnum highAvailability) {
        this.highAvailability = highAvailability;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIegRequestBody that = (UpdateIegRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.highAvailability, that.highAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, highAvailability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIegRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    highAvailability: ").append(toIndentedString(highAvailability)).append("\n");
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
