package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdatePublicKibanaWhitelistReq */
public class UpdatePublicKibanaWhitelistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whiteList")

    private String whiteList;

    public UpdatePublicKibanaWhitelistReq withWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    /** 白名单。
     * 
     * @return whiteList */
    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePublicKibanaWhitelistReq updatePublicKibanaWhitelistReq = (UpdatePublicKibanaWhitelistReq) o;
        return Objects.equals(this.whiteList, updatePublicKibanaWhitelistReq.whiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicKibanaWhitelistReq {\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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