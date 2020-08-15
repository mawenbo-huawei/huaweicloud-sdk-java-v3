package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.CustomerOrderV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomerOrdersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_infos")
    
    private List<CustomerOrderV2> orderInfos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListCustomerOrdersResponse withOrderInfos(List<CustomerOrderV2> orderInfos) {
        this.orderInfos = orderInfos;
        return this;
    }

    
    public ListCustomerOrdersResponse addOrderInfosItem(CustomerOrderV2 orderInfosItem) {
        if (this.orderInfos == null) {
            this.orderInfos = new ArrayList<>();
        }
        this.orderInfos.add(orderInfosItem);
        return this;
    }

    public ListCustomerOrdersResponse withOrderInfos(Consumer<List<CustomerOrderV2>> orderInfosSetter) {
        if(this.orderInfos == null ){
            this.orderInfos = new ArrayList<>();
        }
        orderInfosSetter.accept(this.orderInfos);
        return this;
    }

    /**
     * |参数名称：客户订单详情信息。具体请参见表 CustomerOrderV2| |参数约束以及描述：客户订单详情信息。具体请参见表 CustomerOrderV2|
     * @return orderInfos
     */
    public List<CustomerOrderV2> getOrderInfos() {
        return orderInfos;
    }

    public void setOrderInfos(List<CustomerOrderV2> orderInfos) {
        this.orderInfos = orderInfos;
    }

    public ListCustomerOrdersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：符合条件的记录总数。| |参数的约束及描述：符合条件的记录总数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerOrdersResponse listCustomerOrdersResponse = (ListCustomerOrdersResponse) o;
        return Objects.equals(this.orderInfos, listCustomerOrdersResponse.orderInfos) &&
            Objects.equals(this.totalCount, listCustomerOrdersResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderInfos, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerOrdersResponse {\n");
        sb.append("    orderInfos: ").append(toIndentedString(orderInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

