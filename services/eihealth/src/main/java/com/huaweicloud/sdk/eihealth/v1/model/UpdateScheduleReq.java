package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateScheduleReq
 */
public class UpdateScheduleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulable")

    private Boolean schedulable;

    public UpdateScheduleReq withSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
        return this;
    }

    /**
     * 是否可调度
     * @return schedulable
     */
    public Boolean getSchedulable() {
        return schedulable;
    }

    public void setSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateScheduleReq updateScheduleReq = (UpdateScheduleReq) o;
        return Objects.equals(this.schedulable, updateScheduleReq.schedulable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedulable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduleReq {\n");
        sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
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