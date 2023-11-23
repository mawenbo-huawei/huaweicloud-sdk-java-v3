package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateSyncTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_task_id")

    private String syncTaskId;

    public CreateSyncTaskResponse withSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    /**
     * 同步任务ID
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSyncTaskResponse that = (CreateSyncTaskResponse) obj;
        return Objects.equals(this.syncTaskId, that.syncTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSyncTaskResponse {\n");
        sb.append("    syncTaskId: ").append(toIndentedString(syncTaskId)).append("\n");
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
