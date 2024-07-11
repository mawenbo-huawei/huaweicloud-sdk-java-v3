package com.huaweicloud.sdk.codeartsdeploy.v2.model;

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
public class ListHostGroupBaseInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<EnvironmentBaseInfo> result = null;

    public ListHostGroupBaseInfosResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 请求成功失败状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListHostGroupBaseInfosResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListHostGroupBaseInfosResponse withResult(List<EnvironmentBaseInfo> result) {
        this.result = result;
        return this;
    }

    public ListHostGroupBaseInfosResponse addResultItem(EnvironmentBaseInfo resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListHostGroupBaseInfosResponse withResult(Consumer<List<EnvironmentBaseInfo>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 环境基本信息列表
     * @return result
     */
    public List<EnvironmentBaseInfo> getResult() {
        return result;
    }

    public void setResult(List<EnvironmentBaseInfo> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHostGroupBaseInfosResponse that = (ListHostGroupBaseInfosResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.total, that.total)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, total, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostGroupBaseInfosResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
