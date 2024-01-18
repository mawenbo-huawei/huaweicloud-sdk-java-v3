package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateTaskStatusResult
 */
public class UpdateTaskStatusResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_id")

    private Integer taskRunId;

    public UpdateTaskStatusResult withTaskRunId(Integer taskRunId) {
        this.taskRunId = taskRunId;
        return this;
    }

    /**
     * 运行任务id，即报告id
     * minimum: 0
     * maximum: 2147483647
     * @return taskRunId
     */
    public Integer getTaskRunId() {
        return taskRunId;
    }

    public void setTaskRunId(Integer taskRunId) {
        this.taskRunId = taskRunId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskStatusResult that = (UpdateTaskStatusResult) obj;
        return Objects.equals(this.taskRunId, that.taskRunId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskRunId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskStatusResult {\n");
        sb.append("    taskRunId: ").append(toIndentedString(taskRunId)).append("\n");
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
