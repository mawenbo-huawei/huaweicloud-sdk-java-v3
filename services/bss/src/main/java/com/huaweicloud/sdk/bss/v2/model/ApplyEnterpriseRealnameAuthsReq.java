package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.EnterprisePersonNew;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApplyEnterpriseRealnameAuthsReq
 */
public class ApplyEnterpriseRealnameAuthsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_type")
    
    private Integer certificateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corp_name")
    
    private String corpName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_person")
    
    private EnterprisePersonNew enterprisePerson = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="identify_type")
    
    private Integer identifyType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reg_address")
    
    private String regAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reg_country")
    
    private String regCountry;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verified_file_url")
    
    private List<String> verifiedFileUrl = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verified_number")
    
    private String verifiedNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xaccount_type")
    
    private String xaccountType;

    public ApplyEnterpriseRealnameAuthsReq withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    


    /**
     * |参数名称：企业证件类型：0：企业营业执照1：事业单位法人证书2：社会团体法人登记证书3：行政执法主体资格证4：组织机构代码证99：其他| |参数的约束及描述：企业证件类型：0：企业营业执照1：事业单位法人证书2：社会团体法人登记证书3：行政执法主体资格证4：组织机构代码证99：其他|
     * minimum: 0
     * maximum: 99
     * @return certificateType
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public ApplyEnterpriseRealnameAuthsReq withCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }

    


    /**
     * |参数名称：单位名称。不能全是数字、特殊字符、空格。| |参数约束及描述：单位名称。不能全是数字、特殊字符、空格。|
     * @return corpName
     */
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public ApplyEnterpriseRealnameAuthsReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID。| |参数约束及描述：客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ApplyEnterpriseRealnameAuthsReq withEnterprisePerson(EnterprisePersonNew enterprisePerson) {
        this.enterprisePerson = enterprisePerson;
        return this;
    }

    public ApplyEnterpriseRealnameAuthsReq withEnterprisePerson(Consumer<EnterprisePersonNew> enterprisePersonSetter) {
        if(this.enterprisePerson == null ){
            this.enterprisePerson = new EnterprisePersonNew();
            enterprisePersonSetter.accept(this.enterprisePerson);
        }
        
        return this;
    }


    /**
     * Get enterprisePerson
     * @return enterprisePerson
     */
    public EnterprisePersonNew getEnterprisePerson() {
        return enterprisePerson;
    }

    public void setEnterprisePerson(EnterprisePersonNew enterprisePerson) {
        this.enterprisePerson = enterprisePerson;
    }

    public ApplyEnterpriseRealnameAuthsReq withIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
        return this;
    }

    


    /**
     * |参数名称：认证方案。1：企业证件扫描| |参数的约束及描述：认证方案。1：企业证件扫描|
     * minimum: 0
     * maximum: 32
     * @return identifyType
     */
    public Integer getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
    }

    public ApplyEnterpriseRealnameAuthsReq withRegAddress(String regAddress) {
        this.regAddress = regAddress;
        return this;
    }

    


    /**
     * |参数名称：实名认证企业注册地址。| |参数约束及描述：实名认证企业注册地址。|
     * @return regAddress
     */
    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public ApplyEnterpriseRealnameAuthsReq withRegCountry(String regCountry) {
        this.regCountry = regCountry;
        return this;
    }

    


    /**
     * |参数名称：实名认证填写的注册国家。国家的两位字母简码。例如：注册国家为“中国”请填写“CN”。| |参数约束及描述：实名认证填写的注册国家。国家的两位字母简码。例如：注册国家为“中国”请填写“CN”。|
     * @return regCountry
     */
    public String getRegCountry() {
        return regCountry;
    }

    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    public ApplyEnterpriseRealnameAuthsReq withVerifiedFileUrl(List<String> verifiedFileUrl) {
        this.verifiedFileUrl = verifiedFileUrl;
        return this;
    }

    
    public ApplyEnterpriseRealnameAuthsReq addVerifiedFileUrlItem(String verifiedFileUrlItem) {
        this.verifiedFileUrl.add(verifiedFileUrlItem);
        return this;
    }

    public ApplyEnterpriseRealnameAuthsReq withVerifiedFileUrl(Consumer<List<String>> verifiedFileUrlSetter) {
        if(this.verifiedFileUrl == null ){
            this.verifiedFileUrl = new ArrayList<>();
        }
        verifiedFileUrlSetter.accept(this.verifiedFileUrl);
        return this;
    }

    /**
     * |参数名称：企业证件认证时证件附件的文件URL。附件地址必须按照顺序填写，先填写企业证件的附件，如果请求中填写了企业人员信息，再填写企业人员的身份证附件。企业证件顺序为：第1张企业证件照附件，企业人员的证件顺序为：第1张个人身份证的人像面第2张个人身份证的国徽面以营业执照举例，假设存在法人的情况下，第1张上传的是营业执照扫描件abc.023，第2张是法人的身份证人像面照片def004，第3张是法人的国徽面照片gh007，那么上传顺序需要是：abc023def004gh007文件名称区分大小写附件地址必须按照顺序填写，先填写企业证件的附件，如果请求中填写了企业人员信息，再填写企业人员的身份证附件。企业证件顺序为：第1张企业证件照正面，第2张企业证件照反面，个人证件顺序为：第1张个人身份证的人像面第2张个人身份证的国徽面假设不存在法人的情况下，第1张上传的是企业证件正面扫描件abc.023，第2张上传的是企业证件反面扫描件def004，那么上传顺序需要是：abc023def004文件名称区分大小写证件附件目前仅仅支持jpg、jpeg、bmp、png、gif、pdf格式，单个文件最大不超过10M。这个URL是相对URL，不需要包含桶名和download目录，只要包含download目录下的子目录和对应文件名称即可。举例如下：如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/abc023.jpg，该字段填写abc023.jpg；如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/test/abc023.jpg，该字段填写test/abc023.jpg。| |参数约束以及描述：企业证件认证时证件附件的文件URL。附件地址必须按照顺序填写，先填写企业证件的附件，如果请求中填写了企业人员信息，再填写企业人员的身份证附件。企业证件顺序为：第1张企业证件照附件，企业人员的证件顺序为：第1张个人身份证的人像面第2张个人身份证的国徽面以营业执照举例，假设存在法人的情况下，第1张上传的是营业执照扫描件abc.023，第2张是法人的身份证人像面照片def004，第3张是法人的国徽面照片gh007，那么上传顺序需要是：abc023def004gh007文件名称区分大小写附件地址必须按照顺序填写，先填写企业证件的附件，如果请求中填写了企业人员信息，再填写企业人员的身份证附件。企业证件顺序为：第1张企业证件照正面，第2张企业证件照反面，个人证件顺序为：第1张个人身份证的人像面第2张个人身份证的国徽面假设不存在法人的情况下，第1张上传的是企业证件正面扫描件abc.023，第2张上传的是企业证件反面扫描件def004，那么上传顺序需要是：abc023def004文件名称区分大小写证件附件目前仅仅支持jpg、jpeg、bmp、png、gif、pdf格式，单个文件最大不超过10M。这个URL是相对URL，不需要包含桶名和download目录，只要包含download目录下的子目录和对应文件名称即可。举例如下：如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/abc023.jpg，该字段填写abc023.jpg；如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/test/abc023.jpg，该字段填写test/abc023.jpg。|
     * @return verifiedFileUrl
     */
    public List<String> getVerifiedFileUrl() {
        return verifiedFileUrl;
    }

    public void setVerifiedFileUrl(List<String> verifiedFileUrl) {
        this.verifiedFileUrl = verifiedFileUrl;
    }

    public ApplyEnterpriseRealnameAuthsReq withVerifiedNumber(String verifiedNumber) {
        this.verifiedNumber = verifiedNumber;
        return this;
    }

    


    /**
     * |参数名称：单位证件号码。| |参数约束及描述：单位证件号码。|
     * @return verifiedNumber
     */
    public String getVerifiedNumber() {
        return verifiedNumber;
    }

    public void setVerifiedNumber(String verifiedNumber) {
        this.verifiedNumber = verifiedNumber;
    }

    public ApplyEnterpriseRealnameAuthsReq withXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
        return this;
    }

    


    /**
     * |参数名称：华为分给合作伙伴的平台标识。该标识的具体值由华为分配。获取方法请参见如何获取xaccountType的取值| |参数约束及描述：华为分给合作伙伴的平台标识。该标识的具体值由华为分配。获取方法请参见如何获取xaccountType的取值|
     * @return xaccountType
     */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyEnterpriseRealnameAuthsReq applyEnterpriseRealnameAuthsReq = (ApplyEnterpriseRealnameAuthsReq) o;
        return Objects.equals(this.certificateType, applyEnterpriseRealnameAuthsReq.certificateType) &&
            Objects.equals(this.corpName, applyEnterpriseRealnameAuthsReq.corpName) &&
            Objects.equals(this.customerId, applyEnterpriseRealnameAuthsReq.customerId) &&
            Objects.equals(this.enterprisePerson, applyEnterpriseRealnameAuthsReq.enterprisePerson) &&
            Objects.equals(this.identifyType, applyEnterpriseRealnameAuthsReq.identifyType) &&
            Objects.equals(this.regAddress, applyEnterpriseRealnameAuthsReq.regAddress) &&
            Objects.equals(this.regCountry, applyEnterpriseRealnameAuthsReq.regCountry) &&
            Objects.equals(this.verifiedFileUrl, applyEnterpriseRealnameAuthsReq.verifiedFileUrl) &&
            Objects.equals(this.verifiedNumber, applyEnterpriseRealnameAuthsReq.verifiedNumber) &&
            Objects.equals(this.xaccountType, applyEnterpriseRealnameAuthsReq.xaccountType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificateType, corpName, customerId, enterprisePerson, identifyType, regAddress, regCountry, verifiedFileUrl, verifiedNumber, xaccountType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyEnterpriseRealnameAuthsReq {\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    corpName: ").append(toIndentedString(corpName)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    enterprisePerson: ").append(toIndentedString(enterprisePerson)).append("\n");
        sb.append("    identifyType: ").append(toIndentedString(identifyType)).append("\n");
        sb.append("    regAddress: ").append(toIndentedString(regAddress)).append("\n");
        sb.append("    regCountry: ").append(toIndentedString(regCountry)).append("\n");
        sb.append("    verifiedFileUrl: ").append(toIndentedString(verifiedFileUrl)).append("\n");
        sb.append("    verifiedNumber: ").append(toIndentedString(verifiedNumber)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
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

