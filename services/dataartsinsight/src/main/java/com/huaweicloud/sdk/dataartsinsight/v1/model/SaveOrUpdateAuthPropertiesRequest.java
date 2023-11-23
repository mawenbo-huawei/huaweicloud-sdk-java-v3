package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SaveOrUpdateAuthPropertiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workspace-Id")

    private String xWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CooperateAuthorizationDto body;

    public SaveOrUpdateAuthPropertiesRequest withXWorkspaceId(String xWorkspaceId) {
        this.xWorkspaceId = xWorkspaceId;
        return this;
    }

    /**
     * 工作空间ID，即控制台的项目ID。
     * @return xWorkspaceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workspace-Id")
    public String getXWorkspaceId() {
        return xWorkspaceId;
    }

    public void setXWorkspaceId(String xWorkspaceId) {
        this.xWorkspaceId = xWorkspaceId;
    }

    public SaveOrUpdateAuthPropertiesRequest withBody(CooperateAuthorizationDto body) {
        this.body = body;
        return this;
    }

    public SaveOrUpdateAuthPropertiesRequest withBody(Consumer<CooperateAuthorizationDto> bodySetter) {
        if (this.body == null) {
            this.body = new CooperateAuthorizationDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CooperateAuthorizationDto getBody() {
        return body;
    }

    public void setBody(CooperateAuthorizationDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveOrUpdateAuthPropertiesRequest that = (SaveOrUpdateAuthPropertiesRequest) obj;
        return Objects.equals(this.xWorkspaceId, that.xWorkspaceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xWorkspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveOrUpdateAuthPropertiesRequest {\n");
        sb.append("    xWorkspaceId: ").append(toIndentedString(xWorkspaceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
