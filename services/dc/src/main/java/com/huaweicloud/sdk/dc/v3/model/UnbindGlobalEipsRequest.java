package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UnbindGlobalEipsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_gateway_id")

    private String connectGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateUnbindingGeipRequestBody body;

    public UnbindGlobalEipsRequest withConnectGatewayId(String connectGatewayId) {
        this.connectGatewayId = connectGatewayId;
        return this;
    }

    /**
     * 互联网关ID
     * @return connectGatewayId
     */
    public String getConnectGatewayId() {
        return connectGatewayId;
    }

    public void setConnectGatewayId(String connectGatewayId) {
        this.connectGatewayId = connectGatewayId;
    }

    public UnbindGlobalEipsRequest withBody(CreateUnbindingGeipRequestBody body) {
        this.body = body;
        return this;
    }

    public UnbindGlobalEipsRequest withBody(Consumer<CreateUnbindingGeipRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateUnbindingGeipRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateUnbindingGeipRequestBody getBody() {
        return body;
    }

    public void setBody(CreateUnbindingGeipRequestBody body) {
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
        UnbindGlobalEipsRequest that = (UnbindGlobalEipsRequest) obj;
        return Objects.equals(this.connectGatewayId, that.connectGatewayId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindGlobalEipsRequest {\n");
        sb.append("    connectGatewayId: ").append(toIndentedString(connectGatewayId)).append("\n");
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