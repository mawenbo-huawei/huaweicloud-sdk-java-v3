package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO
 */
public class RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<LifecycleManagedModelUpdateLifecycleStateDTO> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    public RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO withParams(
        List<LifecycleManagedModelUpdateLifecycleStateDTO> params) {
        this.params = params;
        return this;
    }

    public RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO addParamsItem(
        LifecycleManagedModelUpdateLifecycleStateDTO paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO withParams(
        Consumer<List<LifecycleManagedModelUpdateLifecycleStateDTO>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：**  迭代版本。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return params
     */
    public List<LifecycleManagedModelUpdateLifecycleStateDTO> getParams() {
        return params;
    }

    public void setParams(List<LifecycleManagedModelUpdateLifecycleStateDTO> params) {
        this.params = params;
    }

    public RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释**：  应用ID。  **约束限制**：  不涉及。  **取值范围**：  由英文字母和数字组成，且长度为32个字符。  **默认取值**：  不涉及。 
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO that =
            (RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO) obj;
        return Objects.equals(this.params, that.params) && Objects.equals(this.applicationId, that.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, applicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOListLifecycleManagedModelUpdateLifecycleStateDTO {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
