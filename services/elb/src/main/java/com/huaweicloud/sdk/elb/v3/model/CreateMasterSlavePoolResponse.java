package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateMasterSlavePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private MasterSlavePool pool;

    public CreateMasterSlavePoolResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateMasterSlavePoolResponse withPool(MasterSlavePool pool) {
        this.pool = pool;
        return this;
    }

    public CreateMasterSlavePoolResponse withPool(Consumer<MasterSlavePool> poolSetter) {
        if (this.pool == null) {
            this.pool = new MasterSlavePool();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    /**
     * Get pool
     * @return pool
     */
    public MasterSlavePool getPool() {
        return pool;
    }

    public void setPool(MasterSlavePool pool) {
        this.pool = pool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMasterSlavePoolResponse that = (CreateMasterSlavePoolResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pool, that.pool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMasterSlavePoolResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
