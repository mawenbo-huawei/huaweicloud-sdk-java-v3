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
 * Request Object
 */
public class ListDerivativeIndexesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    /**
     * 业务状态
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StatusEnum DRAFT = new StatusEnum("DRAFT");

        /**
         * Enum PUBLISH_DEVELOPING for value: "PUBLISH_DEVELOPING"
         */
        public static final StatusEnum PUBLISH_DEVELOPING = new StatusEnum("PUBLISH_DEVELOPING");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StatusEnum PUBLISHED = new StatusEnum("PUBLISHED");

        /**
         * Enum OFFLINE_DEVELOPING for value: "OFFLINE_DEVELOPING"
         */
        public static final StatusEnum OFFLINE_DEVELOPING = new StatusEnum("OFFLINE_DEVELOPING");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final StatusEnum REJECT = new StatusEnum("REJECT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISH_DEVELOPING", PUBLISH_DEVELOPING);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFFLINE_DEVELOPING", OFFLINE_DEVELOPING);
            map.put("OFFLINE", OFFLINE);
            map.put("REJECT", REJECT);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_id")

    private Long dimensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_group")

    private String dimensionGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_index_id")

    private Long atomicIndexId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_metrics")

    private Boolean allMetrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_id")

    private Long l3Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListDerivativeIndexesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListDerivativeIndexesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称或编码模糊查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDerivativeIndexesRequest withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 按创建者查询
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ListDerivativeIndexesRequest withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 按审核人查询
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ListDerivativeIndexesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 业务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListDerivativeIndexesRequest withDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 依据维度id查维度属性
     * @return dimensionId
     */
    public Long getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
    }

    public ListDerivativeIndexesRequest withDimensionGroup(String dimensionGroup) {
        this.dimensionGroup = dimensionGroup;
        return this;
    }

    /**
     * 依据维度颗粒度查维度属性
     * @return dimensionGroup
     */
    public String getDimensionGroup() {
        return dimensionGroup;
    }

    public void setDimensionGroup(String dimensionGroup) {
        this.dimensionGroup = dimensionGroup;
    }

    public ListDerivativeIndexesRequest withAtomicIndexId(Long atomicIndexId) {
        this.atomicIndexId = atomicIndexId;
        return this;
    }

    /**
     * 依据原子指标id查维度属性
     * @return atomicIndexId
     */
    public Long getAtomicIndexId() {
        return atomicIndexId;
    }

    public void setAtomicIndexId(Long atomicIndexId) {
        this.atomicIndexId = atomicIndexId;
    }

    public ListDerivativeIndexesRequest withAllMetrics(Boolean allMetrics) {
        this.allMetrics = allMetrics;
        return this;
    }

    /**
     * 是否查询复合指标
     * @return allMetrics
     */
    public Boolean getAllMetrics() {
        return allMetrics;
    }

    public void setAllMetrics(Boolean allMetrics) {
        this.allMetrics = allMetrics;
    }

    public ListDerivativeIndexesRequest withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public ListDerivativeIndexesRequest withL3Id(Long l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象l3 id
     * @return l3Id
     */
    public Long getL3Id() {
        return l3Id;
    }

    public void setL3Id(Long l3Id) {
        this.l3Id = l3Id;
    }

    public ListDerivativeIndexesRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 时间过滤左边界,与end_time一起使用,只支持时间范围过滤,单边过滤无效
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListDerivativeIndexesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 时间过滤右边界,与begin_time一起使用只支持时间范围过滤,单边过滤无效
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListDerivativeIndexesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数，即查询Y条数据。默认值50，取值范围[1,100]
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDerivativeIndexesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标，即跳过X条数据，仅支持0或limit的整数倍，不满足则向下取整。默认值0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDerivativeIndexesRequest listDerivativeIndexesRequest = (ListDerivativeIndexesRequest) o;
        return Objects.equals(this.workspace, listDerivativeIndexesRequest.workspace)
            && Objects.equals(this.name, listDerivativeIndexesRequest.name)
            && Objects.equals(this.createBy, listDerivativeIndexesRequest.createBy)
            && Objects.equals(this.approver, listDerivativeIndexesRequest.approver)
            && Objects.equals(this.status, listDerivativeIndexesRequest.status)
            && Objects.equals(this.dimensionId, listDerivativeIndexesRequest.dimensionId)
            && Objects.equals(this.dimensionGroup, listDerivativeIndexesRequest.dimensionGroup)
            && Objects.equals(this.atomicIndexId, listDerivativeIndexesRequest.atomicIndexId)
            && Objects.equals(this.allMetrics, listDerivativeIndexesRequest.allMetrics)
            && Objects.equals(this.dwType, listDerivativeIndexesRequest.dwType)
            && Objects.equals(this.l3Id, listDerivativeIndexesRequest.l3Id)
            && Objects.equals(this.beginTime, listDerivativeIndexesRequest.beginTime)
            && Objects.equals(this.endTime, listDerivativeIndexesRequest.endTime)
            && Objects.equals(this.limit, listDerivativeIndexesRequest.limit)
            && Objects.equals(this.offset, listDerivativeIndexesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            name,
            createBy,
            approver,
            status,
            dimensionId,
            dimensionGroup,
            atomicIndexId,
            allMetrics,
            dwType,
            l3Id,
            beginTime,
            endTime,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDerivativeIndexesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
        sb.append("    dimensionGroup: ").append(toIndentedString(dimensionGroup)).append("\n");
        sb.append("    atomicIndexId: ").append(toIndentedString(atomicIndexId)).append("\n");
        sb.append("    allMetrics: ").append(toIndentedString(allMetrics)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
