package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NovaAssociateSecurityGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private NovaAssociateSecurityGroupRequestBody body = null;

    public NovaAssociateSecurityGroupRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * Get serverId
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public NovaAssociateSecurityGroupRequest withBody(NovaAssociateSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public NovaAssociateSecurityGroupRequest withBody(Consumer<NovaAssociateSecurityGroupRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new NovaAssociateSecurityGroupRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public NovaAssociateSecurityGroupRequestBody getBody() {
        return body;
    }

    public void setBody(NovaAssociateSecurityGroupRequestBody body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaAssociateSecurityGroupRequest novaAssociateSecurityGroupRequest = (NovaAssociateSecurityGroupRequest) o;
        return Objects.equals(this.serverId, novaAssociateSecurityGroupRequest.serverId) &&
            Objects.equals(this.body, novaAssociateSecurityGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAssociateSecurityGroupRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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

