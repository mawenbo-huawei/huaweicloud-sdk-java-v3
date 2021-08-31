package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.waf.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class WafMeta {

    public static final HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHost =
        genForapplyCertificateToHost();

    private static HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> genForapplyCertificateToHost() {
        // basic
        HttpRequestDef.Builder<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyCertificateToHostRequest.class, ApplyCertificateToHostResponse.class)
            .withName("ApplyCertificateToHost")
            .withUri("/v1/{project_id}/waf/certificate/{certificate_id}/apply-to-hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<ApplyCertificateToHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyCertificateToHostRequestBody.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRule =
        genForcreateAntiTamperRule();

    private static HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> genForcreateAntiTamperRule() {
        // basic
        HttpRequestDef.Builder<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntiTamperRuleRequest.class, CreateAntiTamperRuleResponse.class)
            .withName("CreateAntiTamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<CreateAntiTamperRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiTamperRulesRequestBody.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRule =
        genForcreateGeoipRule();

    private static HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> genForcreateGeoipRule() {
        // basic
        HttpRequestDef.Builder<CreateGeoipRuleRequest, CreateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGeoipRuleRequest.class, CreateGeoipRuleResponse.class)
                .withName("CreateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<CreateGeoIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGeoIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostRequest, CreateHostResponse> createHost = genForcreateHost();

    private static HttpRequestDef<CreateHostRequest, CreateHostResponse> genForcreateHost() {
        // basic
        HttpRequestDef.Builder<CreateHostRequest, CreateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostRequest.class, CreateHostResponse.class)
                .withName("CreateHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<CreateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostRequestBody.class),
            f -> f.withMarshaller(CreateHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForcreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForcreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHost =
        genForcreatePremiumHost();

    private static HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> genForcreatePremiumHost() {
        // basic
        HttpRequestDef.Builder<CreatePremiumHostRequest, CreatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePremiumHostRequest.class, CreatePremiumHostResponse.class)
                .withName("CreatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<CreatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePremiumHostRequestBody.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRule =
        genForcreatePrivacyRule();

    private static HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> genForcreatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivacyRuleRequest.class, CreatePrivacyRuleResponse.class)
                .withName("CreatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<CreatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateValueListRequest, CreateValueListResponse> createValueList =
        genForcreateValueList();

    private static HttpRequestDef<CreateValueListRequest, CreateValueListResponse> genForcreateValueList() {
        // basic
        HttpRequestDef.Builder<CreateValueListRequest, CreateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateValueListRequest.class, CreateValueListResponse.class)
                .withName("CreateValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<CreateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateValueListRequestBody.class),
            f -> f.withMarshaller(CreateValueListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRule =
        genForcreateWhiteblackipRule();

    private static HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> genForcreateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWhiteblackipRuleRequest.class, CreateWhiteblackipRuleResponse.class)
            .withName("CreateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<CreateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRule =
        genFordeleteAntitamperRule();

    private static HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> genFordeleteAntitamperRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntitamperRuleRequest.class, DeleteAntitamperRuleResponse.class)
            .withName("DeleteAntitamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRule =
        genFordeleteGeoipRule();

    private static HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> genFordeleteGeoipRule() {
        // basic
        HttpRequestDef.Builder<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGeoipRuleRequest.class, DeleteGeoipRuleResponse.class)
                .withName("DeleteGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostRequest, DeleteHostResponse> deleteHost = genFordeleteHost();

    private static HttpRequestDef<DeleteHostRequest, DeleteHostResponse> genFordeleteHost() {
        // basic
        HttpRequestDef.Builder<DeleteHostRequest, DeleteHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostRequest.class, DeleteHostResponse.class)
                .withName("DeleteHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genFordeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genFordeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHost =
        genFordeletePremiumHost();

    private static HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> genFordeletePremiumHost() {
        // basic
        HttpRequestDef.Builder<DeletePremiumHostRequest, DeletePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePremiumHostRequest.class, DeletePremiumHostResponse.class)
                .withName("DeletePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Boolean>withRequestField("keepPolicy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getKeepPolicy, (req, v) -> {
                req.setKeepPolicy(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRule =
        genFordeletePrivacyRule();

    private static HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> genFordeletePrivacyRule() {
        // basic
        HttpRequestDef.Builder<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivacyRuleRequest.class, DeletePrivacyRuleResponse.class)
                .withName("DeletePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> deleteValueList =
        genFordeleteValueList();

    private static HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> genFordeleteValueList() {
        // basic
        HttpRequestDef.Builder<DeleteValueListRequest, DeleteValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteValueListRequest.class, DeleteValueListResponse.class)
                .withName("DeleteValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getValuelistid, (req, v) -> {
                req.setValuelistid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRule =
        genFordeleteWhiteBlackIpRule();

    private static HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> genFordeleteWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWhiteBlackIpRuleRequest.class, DeleteWhiteBlackIpRuleResponse.class)
            .withName("DeleteWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRule =
        genForlistAntitamperRule();

    private static HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> genForlistAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ListAntitamperRuleRequest, ListAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntitamperRuleRequest.class, ListAntitamperRuleResponse.class)
                .withName("ListAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getHost, (req, v) -> {
                req.setHost(v);
            }));
        builder.<ListCertificatesRequest.ExpStatusEnum>withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCertificatesRequest.ExpStatusEnum.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, (req, v) -> {
                req.setExpStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHosts =
        genForlistCompositeHosts();

    private static HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> genForlistCompositeHosts() {
        // basic
        HttpRequestDef.Builder<ListCompositeHostsRequest, ListCompositeHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCompositeHostsRequest.class, ListCompositeHostsResponse.class)
                .withName("ListCompositeHosts")
                .withUri("/v1/{project_id}/composite-waf/host")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            }));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            }));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));
        builder.<String>withRequestField("waf_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getWafType, (req, v) -> {
                req.setWafType(v);
            }));
        builder.<Boolean>withRequestField("is_https",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getIsHttps, (req, v) -> {
                req.setIsHttps(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventRequest, ListEventResponse> listEvent = genForlistEvent();

    private static HttpRequestDef<ListEventRequest, ListEventResponse> genForlistEvent() {
        // basic
        HttpRequestDef.Builder<ListEventRequest, ListEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventRequest.class, ListEventResponse.class)
                .withName("ListEvent")
                .withUri("/v1/{project_id}/waf/event")
                .withContentType("application/json");

        // requests
        builder.<ListEventRequest.RecentEnum>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEventRequest.RecentEnum.class),
            f -> f.withMarshaller(ListEventRequest::getRecent, (req, v) -> {
                req.setRecent(v);
            }));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRule =
        genForlistGeoipRule();

    private static HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> genForlistGeoipRule() {
        // basic
        HttpRequestDef.Builder<ListGeoipRuleRequest, ListGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGeoipRuleRequest.class, ListGeoipRuleResponse.class)
                .withName("ListGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRequest, ListHostResponse> listHost = genForlistHost();

    private static HttpRequestDef<ListHostRequest, ListHostResponse> genForlistHost() {
        // basic
        HttpRequestDef.Builder<ListHostRequest, ListHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRequest.class, ListHostResponse.class)
                .withName("ListHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            }));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> listHostRoute =
        genForlistHostRoute();

    private static HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> genForlistHostRoute() {
        // basic
        HttpRequestDef.Builder<ListHostRouteRequest, ListHostRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRouteRequest.class, ListHostRouteResponse.class)
                .withName("ListHostRoute")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}/route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForlistPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForlistPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHost =
        genForlistPremiumHost();

    private static HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> genForlistPremiumHost() {
        // basic
        HttpRequestDef.Builder<ListPremiumHostRequest, ListPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPremiumHostRequest.class, ListPremiumHostResponse.class)
                .withName("ListPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<String>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getHostname, (req, v) -> {
                req.setHostname(v);
            }));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPolicyname, (req, v) -> {
                req.setPolicyname(v);
            }));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRule =
        genForlistPrivacyRule();

    private static HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> genForlistPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ListPrivacyRuleRequest, ListPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivacyRuleRequest.class, ListPrivacyRuleResponse.class)
                .withName("ListPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListValueListRequest, ListValueListResponse> listValueList =
        genForlistValueList();

    private static HttpRequestDef<ListValueListRequest, ListValueListResponse> genForlistValueList() {
        // basic
        HttpRequestDef.Builder<ListValueListRequest, ListValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListValueListRequest.class, ListValueListResponse.class)
                .withName("ListValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRule =
        genForlistWhiteblackipRule();

    private static HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> genForlistWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWhiteblackipRuleRequest.class, ListWhiteblackipRuleResponse.class)
            .withName("ListWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPagesize, (req, v) -> {
                req.setPagesize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHost =
        genForshowCompositeHost();

    private static HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> genForshowCompositeHost() {
        // basic
        HttpRequestDef.Builder<ShowCompositeHostRequest, ShowCompositeHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCompositeHostRequest.class, ShowCompositeHostResponse.class)
                .withName("ShowCompositeHost")
                .withUri("/v1/{project_id}/composite-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForshowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForshowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v1/{project_id}/waf/event/{eventid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventid, (req, v) -> {
                req.setEventid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostRequest, ShowHostResponse> showHost = genForshowHost();

    private static HttpRequestDef<ShowHostRequest, ShowHostResponse> genForshowHost() {
        // basic
        HttpRequestDef.Builder<ShowHostRequest, ShowHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHostRequest.class, ShowHostResponse.class)
                .withName("ShowHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForshowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForshowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHost =
        genForshowPremiumHost();

    private static HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> genForshowPremiumHost() {
        // basic
        HttpRequestDef.Builder<ShowPremiumHostRequest, ShowPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPremiumHostRequest.class, ShowPremiumHostResponse.class)
                .withName("ShowPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRule =
        genForupdateGeoipRule();

    private static HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> genForupdateGeoipRule() {
        // basic
        HttpRequestDef.Builder<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGeoipRuleRequest.class, UpdateGeoipRuleResponse.class)
                .withName("UpdateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<UpdateGeoipRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGeoipRuleRequestBody.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostRequest, UpdateHostResponse> updateHost = genForupdateHost();

    private static HttpRequestDef<UpdateHostRequest, UpdateHostResponse> genForupdateHost() {
        // basic
        HttpRequestDef.Builder<UpdateHostRequest, UpdateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateHostRequest.class, UpdateHostResponse.class)
                .withName("UpdateHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostRequestBody.class),
            f -> f.withMarshaller(UpdateHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatus =
        genForupdateHostProtectStatus();

    private static HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> genForupdateHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHostProtectStatusRequest.class, UpdateHostProtectStatusResponse.class)
            .withName("UpdateHostProtectStatus")
            .withUri("/v1/{project_id}/waf/instance/{instance_id}/protect-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForupdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForupdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHost =
        genForupdatePolicyProtectHost();

    private static HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> genForupdatePolicyProtectHost() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyProtectHostRequest.class, UpdatePolicyProtectHostResponse.class)
            .withName("UpdatePolicyProtectHost")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getHosts, (req, v) -> {
                req.setHosts(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatus =
        genForupdatePolicyRuleStatus();

    private static HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> genForupdatePolicyRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyRuleStatusRequest.class, UpdatePolicyRuleStatusResponse.class)
            .withName("UpdatePolicyRuleStatus")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/{ruletype}/{rule_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<UpdatePolicyRuleStatusRequest.RuletypeEnum>withRequestField("ruletype",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequest.RuletypeEnum.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuletype, (req, v) -> {
                req.setRuletype(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<UpdateRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHost =
        genForupdatePremiumHost();

    private static HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> genForupdatePremiumHost() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostRequest, UpdatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostRequest.class, UpdatePremiumHostResponse.class)
                .withName("UpdatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<UpdatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatus =
        genForupdatePremiumHostProtectStatus();

    private static HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> genForupdatePremiumHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePremiumHostProtectStatusRequest.class,
                    UpdatePremiumHostProtectStatusResponse.class)
                .withName("UpdatePremiumHostProtectStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/protect-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<UpdatePremiumHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRule =
        genForupdatePrivacyRule();

    private static HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> genForupdatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivacyRuleRequest.class, UpdatePrivacyRuleResponse.class)
                .withName("UpdatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<UpdatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> updateValueList =
        genForupdateValueList();

    private static HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> genForupdateValueList() {
        // basic
        HttpRequestDef.Builder<UpdateValueListRequest, UpdateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateValueListRequest.class, UpdateValueListResponse.class)
                .withName("UpdateValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getValuelistid, (req, v) -> {
                req.setValuelistid(v);
            }));
        builder.<UpdateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateValueListRequestBody.class),
            f -> f.withMarshaller(UpdateValueListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRule =
        genForupdateWhiteblackipRule();

    private static HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> genForupdateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWhiteblackipRuleRequest.class, UpdateWhiteblackipRuleResponse.class)
            .withName("UpdateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<UpdateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}