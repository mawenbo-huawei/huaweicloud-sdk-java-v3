package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CertDistinguishedName
 */
public class CertDistinguishedName {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_name")

    private String commonName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locality")

    private String locality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit")

    private String organizationalUnit;

    public CertDistinguishedName withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * 证书通用名称（CN），名称只能由\"-\"、\"_\"、\" \"、\".\"、\",\"、\"*\"、字母、数字、汉字组成，长度不能超过64位字符。
     * @return commonName
     */
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public CertDistinguishedName withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 国家编码，只能由英文组成，长度为2位字符。若不传入，则默认继承父CA对应的值。
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CertDistinguishedName withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 省市名称，名称只能由\"-\"、\"_\"、\" \"、\".\"、\",\"、字母、数字、汉字组成，长度不能超过128位字符。若不传入，则默认继承父CA对应的值。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CertDistinguishedName withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * 地区名称，名称只能由\"-\"、\"_\"、\" \"、\".\"、\",\"、字母、数字、汉字组成，长度不能超过128位字符。若不传入，则默认继承父CA对应的值。
     * @return locality
     */
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public CertDistinguishedName withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * 组织名称，名称只能由\"-\"、\"_\"、\" \"、\".\"、\",\"、字母、数字、汉字组成，长度不能超过64位字符。若不传入，则默认继承父CA对应的值。
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public CertDistinguishedName withOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    /**
     * 组织单元名称，名称只能由\"-\"、\"_\"、\" \"、\".\"、\",\"、字母、数字、汉字组成，长度不能超过64位字符。若不传入，则默认继承父CA对应的值。
     * @return organizationalUnit
     */
    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertDistinguishedName that = (CertDistinguishedName) obj;
        return Objects.equals(this.commonName, that.commonName) && Objects.equals(this.country, that.country)
            && Objects.equals(this.state, that.state) && Objects.equals(this.locality, that.locality)
            && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.organizationalUnit, that.organizationalUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonName, country, state, locality, organization, organizationalUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertDistinguishedName {\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
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
