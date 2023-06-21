package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 属性id列表
 */
public class LinkAttributeAndElementVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<Long> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stand_row_id")

    private Long standRowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private Long tableId;

    /**
     * 表类型:维度、事实表、汇总表、业务表(默认)
     */
    public static final class BizTypeEnum {

        /**
         * Enum TABLE_MODEL for value: "TABLE_MODEL"
         */
        public static final BizTypeEnum TABLE_MODEL = new BizTypeEnum("TABLE_MODEL");

        /**
         * Enum AGGREGATION_LOGIC_TABLE for value: "AGGREGATION_LOGIC_TABLE"
         */
        public static final BizTypeEnum AGGREGATION_LOGIC_TABLE = new BizTypeEnum("AGGREGATION_LOGIC_TABLE");

        /**
         * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
         */
        public static final BizTypeEnum FACT_LOGIC_TABLE = new BizTypeEnum("FACT_LOGIC_TABLE");

        /**
         * Enum DIMENSION for value: "DIMENSION"
         */
        public static final BizTypeEnum DIMENSION = new BizTypeEnum("DIMENSION");

        /**
         * Enum DIMENSION_LOGIC_TABLE for value: "DIMENSION_LOGIC_TABLE"
         */
        public static final BizTypeEnum DIMENSION_LOGIC_TABLE = new BizTypeEnum("DIMENSION_LOGIC_TABLE");

        private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BizTypeEnum> createStaticFields() {
            Map<String, BizTypeEnum> map = new HashMap<>();
            map.put("TABLE_MODEL", TABLE_MODEL);
            map.put("AGGREGATION_LOGIC_TABLE", AGGREGATION_LOGIC_TABLE);
            map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
            map.put("DIMENSION", DIMENSION);
            map.put("DIMENSION_LOGIC_TABLE", DIMENSION_LOGIC_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BizTypeEnum(String value) {
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
        public static BizTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BizTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BizTypeEnum(value);
            }
            return result;
        }

        public static BizTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BizTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BizTypeEnum) {
                return this.value.equals(((BizTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    public LinkAttributeAndElementVO withIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public LinkAttributeAndElementVO addIdsItem(Long idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public LinkAttributeAndElementVO withIds(Consumer<List<Long>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 属性id列表
     * @return ids
     */
    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public LinkAttributeAndElementVO withStandRowId(Long standRowId) {
        this.standRowId = standRowId;
        return this;
    }

    /**
     * 关联的数据标准的id
     * @return standRowId
     */
    public Long getStandRowId() {
        return standRowId;
    }

    public void setStandRowId(Long standRowId) {
        this.standRowId = standRowId;
    }

    public LinkAttributeAndElementVO withTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表id
     * @return tableId
     */
    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public LinkAttributeAndElementVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 表类型:维度、事实表、汇总表、业务表(默认)
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkAttributeAndElementVO linkAttributeAndElementVO = (LinkAttributeAndElementVO) o;
        return Objects.equals(this.ids, linkAttributeAndElementVO.ids)
            && Objects.equals(this.standRowId, linkAttributeAndElementVO.standRowId)
            && Objects.equals(this.tableId, linkAttributeAndElementVO.tableId)
            && Objects.equals(this.bizType, linkAttributeAndElementVO.bizType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, standRowId, tableId, bizType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkAttributeAndElementVO {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    standRowId: ").append(toIndentedString(standRowId)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
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
