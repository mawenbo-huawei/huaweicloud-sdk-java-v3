package com.huaweicloud.sdk.frs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.frs.v2.model.AddFacesBase64Req;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByFileRequestBody;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.AddFacesUrlReq;
import com.huaweicloud.sdk.frs.v2.model.BatchDeleteFacesRequest;
import com.huaweicloud.sdk.frs.v2.model.BatchDeleteFacesResponse;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByFileRequestBody;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.CreateFaceSetReq;
import com.huaweicloud.sdk.frs.v2.model.CreateFaceSetRequest;
import com.huaweicloud.sdk.frs.v2.model.CreateFaceSetResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByExternalImageIdRequest;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByExternalImageIdResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByFaceIdRequest;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByFaceIdResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceSetRequest;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceSetResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFacesBatchReq;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64IntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64IntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileIntlRequestBody;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileRequestBody;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64IntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64IntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileIntlRequestBody;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileRequestBody;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByFileRequestBody;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.FaceCompareBase64Req;
import com.huaweicloud.sdk.frs.v2.model.FaceCompareUrlReq;
import com.huaweicloud.sdk.frs.v2.model.FaceDetectBase64Req;
import com.huaweicloud.sdk.frs.v2.model.FaceDetectUrlReq;
import com.huaweicloud.sdk.frs.v2.model.FaceSearchBase64Req;
import com.huaweicloud.sdk.frs.v2.model.FaceSearchFaceIdReq;
import com.huaweicloud.sdk.frs.v2.model.FaceSearchUrlReq;
import com.huaweicloud.sdk.frs.v2.model.LiveDetectBase64Req;
import com.huaweicloud.sdk.frs.v2.model.LiveDetectFaceBase64Req;
import com.huaweicloud.sdk.frs.v2.model.LiveDetectFaceUrlReq;
import com.huaweicloud.sdk.frs.v2.model.LiveDetectUrlReq;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFaceIdRequest;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFaceIdResponse;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFileRequestBody;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowAllFaceSetsRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowAllFaceSetsResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowFaceSetRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowFaceSetResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByFaceIdRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByFaceIdResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByLimitRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByLimitResponse;
import com.huaweicloud.sdk.frs.v2.model.UpdateFaceReq;
import com.huaweicloud.sdk.frs.v2.model.UpdateFaceRequest;
import com.huaweicloud.sdk.frs.v2.model.UpdateFaceResponse;

@SuppressWarnings("unchecked")
public class FrsMeta {

    public static final HttpRequestDef<AddFacesByBase64Request, AddFacesByBase64Response> addFacesByBase64 =
        genForAddFacesByBase64();

    private static HttpRequestDef<AddFacesByBase64Request, AddFacesByBase64Response> genForAddFacesByBase64() {
        // basic
        HttpRequestDef.Builder<AddFacesByBase64Request, AddFacesByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFacesByBase64Request.class, AddFacesByBase64Response.class)
                .withName("AddFacesByBase64")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByBase64Request::getFaceSetName, AddFacesByBase64Request::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByBase64Request::getEnterpriseProjectId,
                AddFacesByBase64Request::setEnterpriseProjectId));
        builder.<AddFacesBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFacesBase64Req.class),
            f -> f.withMarshaller(AddFacesByBase64Request::getBody, AddFacesByBase64Request::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddFacesByBase64Response::getXRequestId, AddFacesByBase64Response::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AddFacesByFileRequest, AddFacesByFileResponse> addFacesByFile =
        genForAddFacesByFile();

    private static HttpRequestDef<AddFacesByFileRequest, AddFacesByFileResponse> genForAddFacesByFile() {
        // basic
        HttpRequestDef.Builder<AddFacesByFileRequest, AddFacesByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFacesByFileRequest.class, AddFacesByFileResponse.class)
                .withName("AddFacesByFile")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByFileRequest::getFaceSetName, AddFacesByFileRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByFileRequest::getEnterpriseProjectId,
                AddFacesByFileRequest::setEnterpriseProjectId));
        builder.<AddFacesByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFacesByFileRequestBody.class),
            f -> f.withMarshaller(AddFacesByFileRequest::getBody, AddFacesByFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddFacesByFileResponse::getXRequestId, AddFacesByFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AddFacesByUrlRequest, AddFacesByUrlResponse> addFacesByUrl =
        genForAddFacesByUrl();

    private static HttpRequestDef<AddFacesByUrlRequest, AddFacesByUrlResponse> genForAddFacesByUrl() {
        // basic
        HttpRequestDef.Builder<AddFacesByUrlRequest, AddFacesByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFacesByUrlRequest.class, AddFacesByUrlResponse.class)
                .withName("AddFacesByUrl")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByUrlRequest::getFaceSetName, AddFacesByUrlRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByUrlRequest::getEnterpriseProjectId,
                AddFacesByUrlRequest::setEnterpriseProjectId));
        builder.<AddFacesUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFacesUrlReq.class),
            f -> f.withMarshaller(AddFacesByUrlRequest::getBody, AddFacesByUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddFacesByUrlResponse::getXRequestId, AddFacesByUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFacesRequest, BatchDeleteFacesResponse> batchDeleteFaces =
        genForBatchDeleteFaces();

    private static HttpRequestDef<BatchDeleteFacesRequest, BatchDeleteFacesResponse> genForBatchDeleteFaces() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFacesRequest, BatchDeleteFacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteFacesRequest.class, BatchDeleteFacesResponse.class)
                .withName("BatchDeleteFaces")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces/batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFacesRequest::getFaceSetName, BatchDeleteFacesRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFacesRequest::getEnterpriseProjectId,
                BatchDeleteFacesRequest::setEnterpriseProjectId));
        builder.<DeleteFacesBatchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFacesBatchReq.class),
            f -> f.withMarshaller(BatchDeleteFacesRequest::getBody, BatchDeleteFacesRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteFacesResponse::getXRequestId, BatchDeleteFacesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CompareFaceByBase64Request, CompareFaceByBase64Response> compareFaceByBase64 =
        genForCompareFaceByBase64();

    private static HttpRequestDef<CompareFaceByBase64Request, CompareFaceByBase64Response> genForCompareFaceByBase64() {
        // basic
        HttpRequestDef.Builder<CompareFaceByBase64Request, CompareFaceByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareFaceByBase64Request.class, CompareFaceByBase64Response.class)
                .withName("CompareFaceByBase64")
                .withUri("/v2/{project_id}/face-compare")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareFaceByBase64Request::getEnterpriseProjectId,
                CompareFaceByBase64Request::setEnterpriseProjectId));
        builder.<FaceCompareBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceCompareBase64Req.class),
            f -> f.withMarshaller(CompareFaceByBase64Request::getBody, CompareFaceByBase64Request::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CompareFaceByBase64Response::getXRequestId,
                CompareFaceByBase64Response::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CompareFaceByFileRequest, CompareFaceByFileResponse> compareFaceByFile =
        genForCompareFaceByFile();

    private static HttpRequestDef<CompareFaceByFileRequest, CompareFaceByFileResponse> genForCompareFaceByFile() {
        // basic
        HttpRequestDef.Builder<CompareFaceByFileRequest, CompareFaceByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareFaceByFileRequest.class, CompareFaceByFileResponse.class)
                .withName("CompareFaceByFile")
                .withUri("/v2/{project_id}/face-compare")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareFaceByFileRequest::getEnterpriseProjectId,
                CompareFaceByFileRequest::setEnterpriseProjectId));
        builder.<CompareFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CompareFaceByFileRequestBody.class),
            f -> f.withMarshaller(CompareFaceByFileRequest::getBody, CompareFaceByFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CompareFaceByFileResponse::getXRequestId, CompareFaceByFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CompareFaceByUrlRequest, CompareFaceByUrlResponse> compareFaceByUrl =
        genForCompareFaceByUrl();

    private static HttpRequestDef<CompareFaceByUrlRequest, CompareFaceByUrlResponse> genForCompareFaceByUrl() {
        // basic
        HttpRequestDef.Builder<CompareFaceByUrlRequest, CompareFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareFaceByUrlRequest.class, CompareFaceByUrlResponse.class)
                .withName("CompareFaceByUrl")
                .withUri("/v2/{project_id}/face-compare")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CompareFaceByUrlRequest::getEnterpriseProjectId,
                CompareFaceByUrlRequest::setEnterpriseProjectId));
        builder.<FaceCompareUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceCompareUrlReq.class),
            f -> f.withMarshaller(CompareFaceByUrlRequest::getBody, CompareFaceByUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CompareFaceByUrlResponse::getXRequestId, CompareFaceByUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateFaceSetRequest, CreateFaceSetResponse> createFaceSet =
        genForCreateFaceSet();

    private static HttpRequestDef<CreateFaceSetRequest, CreateFaceSetResponse> genForCreateFaceSet() {
        // basic
        HttpRequestDef.Builder<CreateFaceSetRequest, CreateFaceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFaceSetRequest.class, CreateFaceSetResponse.class)
                .withName("CreateFaceSet")
                .withUri("/v2/{project_id}/face-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFaceSetRequest::getEnterpriseProjectId,
                CreateFaceSetRequest::setEnterpriseProjectId));
        builder.<CreateFaceSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFaceSetReq.class),
            f -> f.withMarshaller(CreateFaceSetRequest::getBody, CreateFaceSetRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFaceSetResponse::getXRequestId, CreateFaceSetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageId =
        genForDeleteFaceByExternalImageId();

    private static HttpRequestDef<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> genForDeleteFaceByExternalImageId() {
        // basic
        HttpRequestDef.Builder<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteFaceByExternalImageIdRequest.class,
                    DeleteFaceByExternalImageIdResponse.class)
                .withName("DeleteFaceByExternalImageId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByExternalImageIdRequest::getFaceSetName,
                DeleteFaceByExternalImageIdRequest::setFaceSetName));
        builder.<String>withRequestField("external_image_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByExternalImageIdRequest::getExternalImageId,
                DeleteFaceByExternalImageIdRequest::setExternalImageId));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByExternalImageIdRequest::getEnterpriseProjectId,
                DeleteFaceByExternalImageIdRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFaceByExternalImageIdResponse::getXRequestId,
                DeleteFaceByExternalImageIdResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> deleteFaceByFaceId =
        genForDeleteFaceByFaceId();

    private static HttpRequestDef<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> genForDeleteFaceByFaceId() {
        // basic
        HttpRequestDef.Builder<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFaceByFaceIdRequest.class, DeleteFaceByFaceIdResponse.class)
                .withName("DeleteFaceByFaceId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByFaceIdRequest::getFaceSetName,
                DeleteFaceByFaceIdRequest::setFaceSetName));
        builder.<String>withRequestField("face_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByFaceIdRequest::getFaceId, DeleteFaceByFaceIdRequest::setFaceId));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByFaceIdRequest::getEnterpriseProjectId,
                DeleteFaceByFaceIdRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFaceByFaceIdResponse::getXRequestId,
                DeleteFaceByFaceIdResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFaceSetRequest, DeleteFaceSetResponse> deleteFaceSet =
        genForDeleteFaceSet();

    private static HttpRequestDef<DeleteFaceSetRequest, DeleteFaceSetResponse> genForDeleteFaceSet() {
        // basic
        HttpRequestDef.Builder<DeleteFaceSetRequest, DeleteFaceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFaceSetRequest.class, DeleteFaceSetResponse.class)
                .withName("DeleteFaceSet")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceSetRequest::getFaceSetName, DeleteFaceSetRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceSetRequest::getEnterpriseProjectId,
                DeleteFaceSetRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFaceSetResponse::getXRequestId, DeleteFaceSetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByBase64Request, DetectFaceByBase64Response> detectFaceByBase64 =
        genForDetectFaceByBase64();

    private static HttpRequestDef<DetectFaceByBase64Request, DetectFaceByBase64Response> genForDetectFaceByBase64() {
        // basic
        HttpRequestDef.Builder<DetectFaceByBase64Request, DetectFaceByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByBase64Request.class, DetectFaceByBase64Response.class)
                .withName("DetectFaceByBase64")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectFaceByBase64Request::getEnterpriseProjectId,
                DetectFaceByBase64Request::setEnterpriseProjectId));
        builder.<FaceDetectBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceDetectBase64Req.class),
            f -> f.withMarshaller(DetectFaceByBase64Request::getBody, DetectFaceByBase64Request::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectFaceByBase64Response::getXRequestId,
                DetectFaceByBase64Response::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse> detectFaceByBase64Intl =
        genForDetectFaceByBase64Intl();

    private static HttpRequestDef<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse> genForDetectFaceByBase64Intl() {
        // basic
        HttpRequestDef.Builder<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetectFaceByBase64IntlRequest.class, DetectFaceByBase64IntlResponse.class)
            .withName("DetectFaceByBase64Intl")
            .withUri("/v2/{project_id}/face-detect")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectFaceByBase64IntlRequest::getEnterpriseProjectId,
                DetectFaceByBase64IntlRequest::setEnterpriseProjectId));
        builder.<FaceDetectBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceDetectBase64Req.class),
            f -> f.withMarshaller(DetectFaceByBase64IntlRequest::getBody, DetectFaceByBase64IntlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectFaceByBase64IntlResponse::getXRequestId,
                DetectFaceByBase64IntlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByFileRequest, DetectFaceByFileResponse> detectFaceByFile =
        genForDetectFaceByFile();

    private static HttpRequestDef<DetectFaceByFileRequest, DetectFaceByFileResponse> genForDetectFaceByFile() {
        // basic
        HttpRequestDef.Builder<DetectFaceByFileRequest, DetectFaceByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByFileRequest.class, DetectFaceByFileResponse.class)
                .withName("DetectFaceByFile")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectFaceByFileRequest::getEnterpriseProjectId,
                DetectFaceByFileRequest::setEnterpriseProjectId));
        builder.<DetectFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetectFaceByFileRequestBody.class),
            f -> f.withMarshaller(DetectFaceByFileRequest::getBody, DetectFaceByFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectFaceByFileResponse::getXRequestId, DetectFaceByFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse> detectFaceByFileIntl =
        genForDetectFaceByFileIntl();

    private static HttpRequestDef<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse> genForDetectFaceByFileIntl() {
        // basic
        HttpRequestDef.Builder<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetectFaceByFileIntlRequest.class, DetectFaceByFileIntlResponse.class)
            .withName("DetectFaceByFileIntl")
            .withUri("/v2/{project_id}/face-detect")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectFaceByFileIntlRequest::getEnterpriseProjectId,
                DetectFaceByFileIntlRequest::setEnterpriseProjectId));
        builder.<DetectFaceByFileIntlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetectFaceByFileIntlRequestBody.class),
            f -> f.withMarshaller(DetectFaceByFileIntlRequest::getBody, DetectFaceByFileIntlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectFaceByFileIntlResponse::getXRequestId,
                DetectFaceByFileIntlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByUrlRequest, DetectFaceByUrlResponse> detectFaceByUrl =
        genForDetectFaceByUrl();

    private static HttpRequestDef<DetectFaceByUrlRequest, DetectFaceByUrlResponse> genForDetectFaceByUrl() {
        // basic
        HttpRequestDef.Builder<DetectFaceByUrlRequest, DetectFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByUrlRequest.class, DetectFaceByUrlResponse.class)
                .withName("DetectFaceByUrl")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectFaceByUrlRequest::getEnterpriseProjectId,
                DetectFaceByUrlRequest::setEnterpriseProjectId));
        builder.<FaceDetectUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceDetectUrlReq.class),
            f -> f.withMarshaller(DetectFaceByUrlRequest::getBody, DetectFaceByUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectFaceByUrlResponse::getXRequestId, DetectFaceByUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse> detectFaceByUrlIntl =
        genForDetectFaceByUrlIntl();

    private static HttpRequestDef<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse> genForDetectFaceByUrlIntl() {
        // basic
        HttpRequestDef.Builder<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByUrlIntlRequest.class, DetectFaceByUrlIntlResponse.class)
                .withName("DetectFaceByUrlIntl")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectFaceByUrlIntlRequest::getEnterpriseProjectId,
                DetectFaceByUrlIntlRequest::setEnterpriseProjectId));
        builder.<FaceDetectUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceDetectUrlReq.class),
            f -> f.withMarshaller(DetectFaceByUrlIntlRequest::getBody, DetectFaceByUrlIntlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectFaceByUrlIntlResponse::getXRequestId,
                DetectFaceByUrlIntlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveByBase64Request, DetectLiveByBase64Response> detectLiveByBase64 =
        genForDetectLiveByBase64();

    private static HttpRequestDef<DetectLiveByBase64Request, DetectLiveByBase64Response> genForDetectLiveByBase64() {
        // basic
        HttpRequestDef.Builder<DetectLiveByBase64Request, DetectLiveByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectLiveByBase64Request.class, DetectLiveByBase64Response.class)
                .withName("DetectLiveByBase64")
                .withUri("/v1/{project_id}/live-detect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveByBase64Request::getEnterpriseProjectId,
                DetectLiveByBase64Request::setEnterpriseProjectId));
        builder.<LiveDetectBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDetectBase64Req.class),
            f -> f.withMarshaller(DetectLiveByBase64Request::getBody, DetectLiveByBase64Request::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveByBase64Response::getXRequestId,
                DetectLiveByBase64Response::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse> detectLiveByBase64Intl =
        genForDetectLiveByBase64Intl();

    private static HttpRequestDef<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse> genForDetectLiveByBase64Intl() {
        // basic
        HttpRequestDef.Builder<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetectLiveByBase64IntlRequest.class, DetectLiveByBase64IntlResponse.class)
            .withName("DetectLiveByBase64Intl")
            .withUri("/v2/{project_id}/live-detect")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveByBase64IntlRequest::getEnterpriseProjectId,
                DetectLiveByBase64IntlRequest::setEnterpriseProjectId));
        builder.<LiveDetectBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDetectBase64Req.class),
            f -> f.withMarshaller(DetectLiveByBase64IntlRequest::getBody, DetectLiveByBase64IntlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveByBase64IntlResponse::getXRequestId,
                DetectLiveByBase64IntlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveByFileRequest, DetectLiveByFileResponse> detectLiveByFile =
        genForDetectLiveByFile();

    private static HttpRequestDef<DetectLiveByFileRequest, DetectLiveByFileResponse> genForDetectLiveByFile() {
        // basic
        HttpRequestDef.Builder<DetectLiveByFileRequest, DetectLiveByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectLiveByFileRequest.class, DetectLiveByFileResponse.class)
                .withName("DetectLiveByFile")
                .withUri("/v1/{project_id}/live-detect")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveByFileRequest::getEnterpriseProjectId,
                DetectLiveByFileRequest::setEnterpriseProjectId));
        builder.<DetectLiveByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetectLiveByFileRequestBody.class),
            f -> f.withMarshaller(DetectLiveByFileRequest::getBody, DetectLiveByFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveByFileResponse::getXRequestId, DetectLiveByFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse> detectLiveByFileIntl =
        genForDetectLiveByFileIntl();

    private static HttpRequestDef<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse> genForDetectLiveByFileIntl() {
        // basic
        HttpRequestDef.Builder<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetectLiveByFileIntlRequest.class, DetectLiveByFileIntlResponse.class)
            .withName("DetectLiveByFileIntl")
            .withUri("/v2/{project_id}/live-detect")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveByFileIntlRequest::getEnterpriseProjectId,
                DetectLiveByFileIntlRequest::setEnterpriseProjectId));
        builder.<DetectLiveByFileIntlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetectLiveByFileIntlRequestBody.class),
            f -> f.withMarshaller(DetectLiveByFileIntlRequest::getBody, DetectLiveByFileIntlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveByFileIntlResponse::getXRequestId,
                DetectLiveByFileIntlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveByUrlRequest, DetectLiveByUrlResponse> detectLiveByUrl =
        genForDetectLiveByUrl();

    private static HttpRequestDef<DetectLiveByUrlRequest, DetectLiveByUrlResponse> genForDetectLiveByUrl() {
        // basic
        HttpRequestDef.Builder<DetectLiveByUrlRequest, DetectLiveByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectLiveByUrlRequest.class, DetectLiveByUrlResponse.class)
                .withName("DetectLiveByUrl")
                .withUri("/v1/{project_id}/live-detect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveByUrlRequest::getEnterpriseProjectId,
                DetectLiveByUrlRequest::setEnterpriseProjectId));
        builder.<LiveDetectUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDetectUrlReq.class),
            f -> f.withMarshaller(DetectLiveByUrlRequest::getBody, DetectLiveByUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveByUrlResponse::getXRequestId, DetectLiveByUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse> detectLiveByUrlIntl =
        genForDetectLiveByUrlIntl();

    private static HttpRequestDef<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse> genForDetectLiveByUrlIntl() {
        // basic
        HttpRequestDef.Builder<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectLiveByUrlIntlRequest.class, DetectLiveByUrlIntlResponse.class)
                .withName("DetectLiveByUrlIntl")
                .withUri("/v2/{project_id}/live-detect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveByUrlIntlRequest::getEnterpriseProjectId,
                DetectLiveByUrlIntlRequest::setEnterpriseProjectId));
        builder.<LiveDetectUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDetectUrlReq.class),
            f -> f.withMarshaller(DetectLiveByUrlIntlRequest::getBody, DetectLiveByUrlIntlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveByUrlIntlResponse::getXRequestId,
                DetectLiveByUrlIntlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response> detectLiveFaceByBase64 =
        genForDetectLiveFaceByBase64();

    private static HttpRequestDef<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response> genForDetectLiveFaceByBase64() {
        // basic
        HttpRequestDef.Builder<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetectLiveFaceByBase64Request.class, DetectLiveFaceByBase64Response.class)
            .withName("DetectLiveFaceByBase64")
            .withUri("/v1/{project_id}/live-detect-face")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveFaceByBase64Request::getEnterpriseProjectId,
                DetectLiveFaceByBase64Request::setEnterpriseProjectId));
        builder.<LiveDetectFaceBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDetectFaceBase64Req.class),
            f -> f.withMarshaller(DetectLiveFaceByBase64Request::getBody, DetectLiveFaceByBase64Request::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveFaceByBase64Response::getXRequestId,
                DetectLiveFaceByBase64Response::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse> detectLiveFaceByFile =
        genForDetectLiveFaceByFile();

    private static HttpRequestDef<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse> genForDetectLiveFaceByFile() {
        // basic
        HttpRequestDef.Builder<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetectLiveFaceByFileRequest.class, DetectLiveFaceByFileResponse.class)
            .withName("DetectLiveFaceByFile")
            .withUri("/v1/{project_id}/live-detect-face")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveFaceByFileRequest::getEnterpriseProjectId,
                DetectLiveFaceByFileRequest::setEnterpriseProjectId));
        builder.<DetectLiveFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetectLiveFaceByFileRequestBody.class),
            f -> f.withMarshaller(DetectLiveFaceByFileRequest::getBody, DetectLiveFaceByFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveFaceByFileResponse::getXRequestId,
                DetectLiveFaceByFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse> detectLiveFaceByUrl =
        genForDetectLiveFaceByUrl();

    private static HttpRequestDef<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse> genForDetectLiveFaceByUrl() {
        // basic
        HttpRequestDef.Builder<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectLiveFaceByUrlRequest.class, DetectLiveFaceByUrlResponse.class)
                .withName("DetectLiveFaceByUrl")
                .withUri("/v1/{project_id}/live-detect-face")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectLiveFaceByUrlRequest::getEnterpriseProjectId,
                DetectLiveFaceByUrlRequest::setEnterpriseProjectId));
        builder.<LiveDetectFaceUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDetectFaceUrlReq.class),
            f -> f.withMarshaller(DetectLiveFaceByUrlRequest::getBody, DetectLiveFaceByUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectLiveFaceByUrlResponse::getXRequestId,
                DetectLiveFaceByUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByBase64Request, SearchFaceByBase64Response> searchFaceByBase64 =
        genForSearchFaceByBase64();

    private static HttpRequestDef<SearchFaceByBase64Request, SearchFaceByBase64Response> genForSearchFaceByBase64() {
        // basic
        HttpRequestDef.Builder<SearchFaceByBase64Request, SearchFaceByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByBase64Request.class, SearchFaceByBase64Response.class)
                .withName("SearchFaceByBase64")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByBase64Request::getFaceSetName,
                SearchFaceByBase64Request::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByBase64Request::getEnterpriseProjectId,
                SearchFaceByBase64Request::setEnterpriseProjectId));
        builder.<FaceSearchBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceSearchBase64Req.class),
            f -> f.withMarshaller(SearchFaceByBase64Request::getBody, SearchFaceByBase64Request::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchFaceByBase64Response::getXRequestId,
                SearchFaceByBase64Response::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> searchFaceByFaceId =
        genForSearchFaceByFaceId();

    private static HttpRequestDef<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> genForSearchFaceByFaceId() {
        // basic
        HttpRequestDef.Builder<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByFaceIdRequest.class, SearchFaceByFaceIdResponse.class)
                .withName("SearchFaceByFaceId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByFaceIdRequest::getFaceSetName,
                SearchFaceByFaceIdRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByFaceIdRequest::getEnterpriseProjectId,
                SearchFaceByFaceIdRequest::setEnterpriseProjectId));
        builder.<FaceSearchFaceIdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceSearchFaceIdReq.class),
            f -> f.withMarshaller(SearchFaceByFaceIdRequest::getBody, SearchFaceByFaceIdRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchFaceByFaceIdResponse::getXRequestId,
                SearchFaceByFaceIdResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByFileRequest, SearchFaceByFileResponse> searchFaceByFile =
        genForSearchFaceByFile();

    private static HttpRequestDef<SearchFaceByFileRequest, SearchFaceByFileResponse> genForSearchFaceByFile() {
        // basic
        HttpRequestDef.Builder<SearchFaceByFileRequest, SearchFaceByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByFileRequest.class, SearchFaceByFileResponse.class)
                .withName("SearchFaceByFile")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByFileRequest::getFaceSetName, SearchFaceByFileRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByFileRequest::getEnterpriseProjectId,
                SearchFaceByFileRequest::setEnterpriseProjectId));
        builder.<SearchFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchFaceByFileRequestBody.class),
            f -> f.withMarshaller(SearchFaceByFileRequest::getBody, SearchFaceByFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchFaceByFileResponse::getXRequestId, SearchFaceByFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByUrlRequest, SearchFaceByUrlResponse> searchFaceByUrl =
        genForSearchFaceByUrl();

    private static HttpRequestDef<SearchFaceByUrlRequest, SearchFaceByUrlResponse> genForSearchFaceByUrl() {
        // basic
        HttpRequestDef.Builder<SearchFaceByUrlRequest, SearchFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByUrlRequest.class, SearchFaceByUrlResponse.class)
                .withName("SearchFaceByUrl")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByUrlRequest::getFaceSetName, SearchFaceByUrlRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByUrlRequest::getEnterpriseProjectId,
                SearchFaceByUrlRequest::setEnterpriseProjectId));
        builder.<FaceSearchUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceSearchUrlReq.class),
            f -> f.withMarshaller(SearchFaceByUrlRequest::getBody, SearchFaceByUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchFaceByUrlResponse::getXRequestId, SearchFaceByUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> showAllFaceSets =
        genForShowAllFaceSets();

    private static HttpRequestDef<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> genForShowAllFaceSets() {
        // basic
        HttpRequestDef.Builder<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAllFaceSetsRequest.class, ShowAllFaceSetsResponse.class)
                .withName("ShowAllFaceSets")
                .withUri("/v2/{project_id}/face-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFaceSetsRequest::getEnterpriseProjectId,
                ShowAllFaceSetsRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAllFaceSetsResponse::getXRequestId, ShowAllFaceSetsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFaceSetRequest, ShowFaceSetResponse> showFaceSet = genForShowFaceSet();

    private static HttpRequestDef<ShowFaceSetRequest, ShowFaceSetResponse> genForShowFaceSet() {
        // basic
        HttpRequestDef.Builder<ShowFaceSetRequest, ShowFaceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFaceSetRequest.class, ShowFaceSetResponse.class)
                .withName("ShowFaceSet")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFaceSetRequest::getFaceSetName, ShowFaceSetRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFaceSetRequest::getEnterpriseProjectId,
                ShowFaceSetRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFaceSetResponse::getXRequestId, ShowFaceSetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> showFacesByFaceId =
        genForShowFacesByFaceId();

    private static HttpRequestDef<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> genForShowFacesByFaceId() {
        // basic
        HttpRequestDef.Builder<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFacesByFaceIdRequest.class, ShowFacesByFaceIdResponse.class)
                .withName("ShowFacesByFaceId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByFaceIdRequest::getFaceSetName, ShowFacesByFaceIdRequest::setFaceSetName));
        builder.<String>withRequestField("face_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByFaceIdRequest::getFaceId, ShowFacesByFaceIdRequest::setFaceId));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByFaceIdRequest::getEnterpriseProjectId,
                ShowFacesByFaceIdRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFacesByFaceIdResponse::getXRequestId, ShowFacesByFaceIdResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFacesByLimitRequest, ShowFacesByLimitResponse> showFacesByLimit =
        genForShowFacesByLimit();

    private static HttpRequestDef<ShowFacesByLimitRequest, ShowFacesByLimitResponse> genForShowFacesByLimit() {
        // basic
        HttpRequestDef.Builder<ShowFacesByLimitRequest, ShowFacesByLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFacesByLimitRequest.class, ShowFacesByLimitResponse.class)
                .withName("ShowFacesByLimit")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getFaceSetName, ShowFacesByLimitRequest::setFaceSetName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getOffset, ShowFacesByLimitRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getLimit, ShowFacesByLimitRequest::setLimit));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getEnterpriseProjectId,
                ShowFacesByLimitRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFacesByLimitResponse::getXRequestId, ShowFacesByLimitResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateFaceRequest, UpdateFaceResponse> updateFace = genForUpdateFace();

    private static HttpRequestDef<UpdateFaceRequest, UpdateFaceResponse> genForUpdateFace() {
        // basic
        HttpRequestDef.Builder<UpdateFaceRequest, UpdateFaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFaceRequest.class, UpdateFaceResponse.class)
                .withName("UpdateFace")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFaceRequest::getFaceSetName, UpdateFaceRequest::setFaceSetName));
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFaceRequest::getEnterpriseProjectId,
                UpdateFaceRequest::setEnterpriseProjectId));
        builder.<UpdateFaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFaceReq.class),
            f -> f.withMarshaller(UpdateFaceRequest::getBody, UpdateFaceRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateFaceResponse::getXRequestId, UpdateFaceResponse::setXRequestId));
        return builder.build();
    }

}
