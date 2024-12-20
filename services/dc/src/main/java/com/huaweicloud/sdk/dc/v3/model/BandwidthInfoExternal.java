package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BandwidthInfoExternal
 */
public class BandwidthInfoExternal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_id")

    private String gcbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_status")

    private String freezeStatus;

    public BandwidthInfoExternal withBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽值
     * @return bandwidthSize
     */
    public Long getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public BandwidthInfoExternal withGcbId(String gcbId) {
        this.gcbId = gcbId;
        return this;
    }

    /**
     * 带宽包ID
     * @return gcbId
     */
    public String getGcbId() {
        return gcbId;
    }

    public void setGcbId(String gcbId) {
        this.gcbId = gcbId;
    }

    public BandwidthInfoExternal withFreezeStatus(String freezeStatus) {
        this.freezeStatus = freezeStatus;
        return this;
    }

    /**
     * 冻结状态
     * @return freezeStatus
     */
    public String getFreezeStatus() {
        return freezeStatus;
    }

    public void setFreezeStatus(String freezeStatus) {
        this.freezeStatus = freezeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthInfoExternal that = (BandwidthInfoExternal) obj;
        return Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.gcbId, that.gcbId)
            && Objects.equals(this.freezeStatus, that.freezeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthSize, gcbId, freezeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthInfoExternal {\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    gcbId: ").append(toIndentedString(gcbId)).append("\n");
        sb.append("    freezeStatus: ").append(toIndentedString(freezeStatus)).append("\n");
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
