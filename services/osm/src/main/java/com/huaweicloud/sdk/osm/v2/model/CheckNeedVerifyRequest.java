package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CheckNeedVerifyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contact_value")
    
    private String contactValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contact_way")
    
    private Integer contactWay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area_code")
    
    private String areaCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public CheckNeedVerifyRequest withContactValue(String contactValue) {
        this.contactValue = contactValue;
        return this;
    }

    


    /**
     * Get contactValue
     * @return contactValue
     */
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public CheckNeedVerifyRequest withContactWay(Integer contactWay) {
        this.contactWay = contactWay;
        return this;
    }

    


    /**
     * Get contactWay
     * minimum: 0
     * maximum: 1
     * @return contactWay
     */
    public Integer getContactWay() {
        return contactWay;
    }

    public void setContactWay(Integer contactWay) {
        this.contactWay = contactWay;
    }

    public CheckNeedVerifyRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    


    /**
     * Get areaCode
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public CheckNeedVerifyRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    


    /**
     * Get xSite
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public CheckNeedVerifyRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CheckNeedVerifyRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * Get xTimeZone
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckNeedVerifyRequest checkNeedVerifyRequest = (CheckNeedVerifyRequest) o;
        return Objects.equals(this.contactValue, checkNeedVerifyRequest.contactValue) &&
            Objects.equals(this.contactWay, checkNeedVerifyRequest.contactWay) &&
            Objects.equals(this.areaCode, checkNeedVerifyRequest.areaCode) &&
            Objects.equals(this.xSite, checkNeedVerifyRequest.xSite) &&
            Objects.equals(this.xLanguage, checkNeedVerifyRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, checkNeedVerifyRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(contactValue, contactWay, areaCode, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNeedVerifyRequest {\n");
        sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
        sb.append("    contactWay: ").append(toIndentedString(contactWay)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

