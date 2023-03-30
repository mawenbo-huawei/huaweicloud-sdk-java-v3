package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddServiceItemsUsingPostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ServiceItemIds data;

    public AddServiceItemsUsingPostResponse withData(ServiceItemIds data) {
        this.data = data;
        return this;
    }

    public AddServiceItemsUsingPostResponse withData(Consumer<ServiceItemIds> dataSetter) {
        if (this.data == null) {
            this.data = new ServiceItemIds();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ServiceItemIds getData() {
        return data;
    }

    public void setData(ServiceItemIds data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddServiceItemsUsingPostResponse addServiceItemsUsingPostResponse = (AddServiceItemsUsingPostResponse) o;
        return Objects.equals(this.data, addServiceItemsUsingPostResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServiceItemsUsingPostResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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