package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CouponSimpleInfo
 */
public class CouponSimpleInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_id")
    
    private String couponId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public CouponSimpleInfo withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    


    /**
     * |参数名称：发放成功的券ID| |参数约束及描述：发放成功的券ID|
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public CouponSimpleInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：批量发放成功客户ID。| |参数约束及描述：批量发放成功客户ID。|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponSimpleInfo couponSimpleInfo = (CouponSimpleInfo) o;
        return Objects.equals(this.couponId, couponSimpleInfo.couponId) &&
            Objects.equals(this.id, couponSimpleInfo.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponId, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponSimpleInfo {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

