package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量更新带宽对象的请求体
 */
public class ModifyBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidths")

    private List<ModifyBandwidthOption> bandwidths = null;

    public ModifyBandwidthRequestBody withBandwidths(List<ModifyBandwidthOption> bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }

    public ModifyBandwidthRequestBody addBandwidthsItem(ModifyBandwidthOption bandwidthsItem) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        this.bandwidths.add(bandwidthsItem);
        return this;
    }

    public ModifyBandwidthRequestBody withBandwidths(Consumer<List<ModifyBandwidthOption>> bandwidthsSetter) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        bandwidthsSetter.accept(this.bandwidths);
        return this;
    }

    /**
     * 更新带宽列表
     * @return bandwidths
     */
    public List<ModifyBandwidthOption> getBandwidths() {
        return bandwidths;
    }

    public void setBandwidths(List<ModifyBandwidthOption> bandwidths) {
        this.bandwidths = bandwidths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyBandwidthRequestBody that = (ModifyBandwidthRequestBody) obj;
        return Objects.equals(this.bandwidths, that.bandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyBandwidthRequestBody {\n");
        sb.append("    bandwidths: ").append(toIndentedString(bandwidths)).append("\n");
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
