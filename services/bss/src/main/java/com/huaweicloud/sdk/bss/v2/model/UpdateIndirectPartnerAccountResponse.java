package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateIndirectPartnerAccountResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transfer_id")
    
    private String transferId;

    public UpdateIndirectPartnerAccountResponse withTransferId(String transferId) {
        this.transferId = transferId;
        return this;
    }

    


    /**
     * |参数名称：事务流水ID，只有成功响应才会返回。| |参数约束及描述：非必填|
     * @return transferId
     */
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIndirectPartnerAccountResponse updateIndirectPartnerAccountResponse = (UpdateIndirectPartnerAccountResponse) o;
        return Objects.equals(this.transferId, updateIndirectPartnerAccountResponse.transferId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(transferId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIndirectPartnerAccountResponse {\n");
        sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
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

