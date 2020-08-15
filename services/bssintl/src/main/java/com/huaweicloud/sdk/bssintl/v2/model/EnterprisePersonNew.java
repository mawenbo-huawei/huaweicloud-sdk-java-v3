package com.huaweicloud.sdk.bssintl.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EnterprisePersonNew
 */
public class EnterprisePersonNew  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certifier_role")
    
    private String certifierRole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="legel_id_number")
    
    private String legelIdNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="legel_name")
    
    private String legelName;

    public EnterprisePersonNew withCertifierRole(String certifierRole) {
        this.certifierRole = certifierRole;
        return this;
    }

    


    /**
     * |参数名称：认证人角色| |参数的约束及描述：该参数非必填，legalPerson ：法人代表 authorizedPerson：授权人|
     * @return certifierRole
     */
    public String getCertifierRole() {
        return certifierRole;
    }

    public void setCertifierRole(String certifierRole) {
        this.certifierRole = certifierRole;
    }

    public EnterprisePersonNew withLegelIdNumber(String legelIdNumber) {
        this.legelIdNumber = legelIdNumber;
        return this;
    }

    


    /**
     * |参数名称：法人身份证号| |参数的约束及描述：该参数必填，且只允许字符串|
     * @return legelIdNumber
     */
    public String getLegelIdNumber() {
        return legelIdNumber;
    }

    public void setLegelIdNumber(String legelIdNumber) {
        this.legelIdNumber = legelIdNumber;
    }

    public EnterprisePersonNew withLegelName(String legelName) {
        this.legelName = legelName;
        return this;
    }

    


    /**
     * |参数名称：法人姓名| |参数的约束及描述：该参数必填，且只允许字符串|
     * @return legelName
     */
    public String getLegelName() {
        return legelName;
    }

    public void setLegelName(String legelName) {
        this.legelName = legelName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterprisePersonNew enterprisePersonNew = (EnterprisePersonNew) o;
        return Objects.equals(this.certifierRole, enterprisePersonNew.certifierRole) &&
            Objects.equals(this.legelIdNumber, enterprisePersonNew.legelIdNumber) &&
            Objects.equals(this.legelName, enterprisePersonNew.legelName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certifierRole, legelIdNumber, legelName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterprisePersonNew {\n");
        sb.append("    certifierRole: ").append(toIndentedString(certifierRole)).append("\n");
        sb.append("    legelIdNumber: ").append(toIndentedString(legelIdNumber)).append("\n");
        sb.append("    legelName: ").append(toIndentedString(legelName)).append("\n");
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

