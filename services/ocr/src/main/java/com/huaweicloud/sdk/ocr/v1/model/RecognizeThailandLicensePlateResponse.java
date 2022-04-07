package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RecognizeThailandLicensePlateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ThailandLicensePlateItem> result = null;

    public RecognizeThailandLicensePlateResponse withResult(List<ThailandLicensePlateItem> result) {
        this.result = result;
        return this;
    }

    public RecognizeThailandLicensePlateResponse addResultItem(ThailandLicensePlateItem resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RecognizeThailandLicensePlateResponse withResult(Consumer<List<ThailandLicensePlateItem>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /** 调用成功时表示调用结果。 调用失败时无此字段
     * 
     * @return result */
    public List<ThailandLicensePlateItem> getResult() {
        return result;
    }

    public void setResult(List<ThailandLicensePlateItem> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeThailandLicensePlateResponse recognizeThailandLicensePlateResponse =
            (RecognizeThailandLicensePlateResponse) o;
        return Objects.equals(this.result, recognizeThailandLicensePlateResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeThailandLicensePlateResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}