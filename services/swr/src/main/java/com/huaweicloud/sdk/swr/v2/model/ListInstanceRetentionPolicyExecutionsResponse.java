package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceRetentionPolicyExecutionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executions")

    private List<RetentionExecution> executions = null;

    public ListInstanceRetentionPolicyExecutionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceRetentionPolicyExecutionsResponse withExecutions(List<RetentionExecution> executions) {
        this.executions = executions;
        return this;
    }

    public ListInstanceRetentionPolicyExecutionsResponse addExecutionsItem(RetentionExecution executionsItem) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        this.executions.add(executionsItem);
        return this;
    }

    public ListInstanceRetentionPolicyExecutionsResponse withExecutions(
        Consumer<List<RetentionExecution>> executionsSetter) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        executionsSetter.accept(this.executions);
        return this;
    }

    /**
     * 老化策略执行列表
     * @return executions
     */
    public List<RetentionExecution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<RetentionExecution> executions) {
        this.executions = executions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceRetentionPolicyExecutionsResponse that = (ListInstanceRetentionPolicyExecutionsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.executions, that.executions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, executions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRetentionPolicyExecutionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
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
