package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ProtectPolicyResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainProtectPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_policy")
    
    private ProtectPolicyResult protectPolicy = null;

    public ShowDomainProtectPolicyResponse withProtectPolicy(ProtectPolicyResult protectPolicy) {
        this.protectPolicy = protectPolicy;
        return this;
    }

    public ShowDomainProtectPolicyResponse withProtectPolicy(Consumer<ProtectPolicyResult> protectPolicySetter) {
        if(this.protectPolicy == null ){
            this.protectPolicy = new ProtectPolicyResult();
            protectPolicySetter.accept(this.protectPolicy);
        }
        
        return this;
    }


    /**
     * Get protectPolicy
     * @return protectPolicy
     */
    public ProtectPolicyResult getProtectPolicy() {
        return protectPolicy;
    }

    public void setProtectPolicy(ProtectPolicyResult protectPolicy) {
        this.protectPolicy = protectPolicy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainProtectPolicyResponse showDomainProtectPolicyResponse = (ShowDomainProtectPolicyResponse) o;
        return Objects.equals(this.protectPolicy, showDomainProtectPolicyResponse.protectPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protectPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainProtectPolicyResponse {\n");
        sb.append("    protectPolicy: ").append(toIndentedString(protectPolicy)).append("\n");
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

