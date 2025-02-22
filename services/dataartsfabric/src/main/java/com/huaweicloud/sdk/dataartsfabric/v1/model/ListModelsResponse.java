package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ModelInfo> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListModelsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 符合条件的总数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListModelsResponse withModels(List<ModelInfo> models) {
        this.models = models;
        return this;
    }

    public ListModelsResponse addModelsItem(ModelInfo modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ListModelsResponse withModels(Consumer<List<ModelInfo>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 列表信息
     * @return models
     */
    public List<ModelInfo> getModels() {
        return models;
    }

    public void setModels(List<ModelInfo> models) {
        this.models = models;
    }

    public ListModelsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListModelsResponse that = (ListModelsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.models, that.models)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, models, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListModelsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
