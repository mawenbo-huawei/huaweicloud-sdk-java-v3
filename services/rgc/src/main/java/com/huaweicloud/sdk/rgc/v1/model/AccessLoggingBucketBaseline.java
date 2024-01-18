package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 访问日志基础设置。
 */
public class AccessLoggingBucketBaseline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    public AccessLoggingBucketBaseline withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * 桶保留天数。
     * minimum: 1
     * maximum: 5475
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessLoggingBucketBaseline that = (AccessLoggingBucketBaseline) obj;
        return Objects.equals(this.retentionDays, that.retentionDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessLoggingBucketBaseline {\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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
