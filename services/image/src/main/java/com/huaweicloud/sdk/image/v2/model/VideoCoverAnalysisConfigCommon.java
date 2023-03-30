package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoCoverAnalysisConfigCommon
 */
public class VideoCoverAnalysisConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference")

    private VideoCoverAnalysisinference inference;

    public VideoCoverAnalysisConfigCommon withInference(VideoCoverAnalysisinference inference) {
        this.inference = inference;
        return this;
    }

    public VideoCoverAnalysisConfigCommon withInference(Consumer<VideoCoverAnalysisinference> inferenceSetter) {
        if (this.inference == null) {
            this.inference = new VideoCoverAnalysisinference();
            inferenceSetter.accept(this.inference);
        }

        return this;
    }

    /**
     * Get inference
     * @return inference
     */
    public VideoCoverAnalysisinference getInference() {
        return inference;
    }

    public void setInference(VideoCoverAnalysisinference inference) {
        this.inference = inference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCoverAnalysisConfigCommon videoCoverAnalysisConfigCommon = (VideoCoverAnalysisConfigCommon) o;
        return Objects.equals(this.inference, videoCoverAnalysisConfigCommon.inference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCoverAnalysisConfigCommon {\n");
        sb.append("    inference: ").append(toIndentedString(inference)).append("\n");
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