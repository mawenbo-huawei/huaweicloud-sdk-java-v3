package com.huaweicloud.sdk.sa.v2.model;

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
public class ListPlaybookApprovesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ApproveOpinionDetail> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListPlaybookApprovesResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Error code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListPlaybookApprovesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Error message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListPlaybookApprovesResponse withData(List<ApproveOpinionDetail> data) {
        this.data = data;
        return this;
    }

    public ListPlaybookApprovesResponse addDataItem(ApproveOpinionDetail dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListPlaybookApprovesResponse withData(Consumer<List<ApproveOpinionDetail>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * Get data
     * @return data
     */
    public List<ApproveOpinionDetail> getData() {
        return data;
    }

    public void setData(List<ApproveOpinionDetail> data) {
        this.data = data;
    }

    public ListPlaybookApprovesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPlaybookApprovesResponse listPlaybookApprovesResponse = (ListPlaybookApprovesResponse) o;
        return Objects.equals(this.code, listPlaybookApprovesResponse.code)
            && Objects.equals(this.message, listPlaybookApprovesResponse.message)
            && Objects.equals(this.data, listPlaybookApprovesResponse.data)
            && Objects.equals(this.xRequestId, listPlaybookApprovesResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybookApprovesResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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