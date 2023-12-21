package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOPersistObjectIdsModifierDTO
 */
public class RDMParamVOPersistObjectIdsModifierDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private PersistObjectIdsModifierDTO params;

    public RDMParamVOPersistObjectIdsModifierDTO withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public RDMParamVOPersistObjectIdsModifierDTO withParams(PersistObjectIdsModifierDTO params) {
        this.params = params;
        return this;
    }

    public RDMParamVOPersistObjectIdsModifierDTO withParams(Consumer<PersistObjectIdsModifierDTO> paramsSetter) {
        if (this.params == null) {
            this.params = new PersistObjectIdsModifierDTO();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public PersistObjectIdsModifierDTO getParams() {
        return params;
    }

    public void setParams(PersistObjectIdsModifierDTO params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOPersistObjectIdsModifierDTO that = (RDMParamVOPersistObjectIdsModifierDTO) obj;
        return Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOPersistObjectIdsModifierDTO {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
