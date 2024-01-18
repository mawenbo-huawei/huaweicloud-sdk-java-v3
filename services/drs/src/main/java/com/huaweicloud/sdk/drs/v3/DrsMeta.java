package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.drs.v3.model.BatchChangeDataRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchChangeDataResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckResultsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckResultsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchCreateJobReq;
import com.huaweicloud.sdk.drs.v3.model.BatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchDataTransformationReq;
import com.huaweicloud.sdk.drs.v3.model.BatchDeleteJobReq;
import com.huaweicloud.sdk.drs.v3.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchImportSmnInfoReq;
import com.huaweicloud.sdk.drs.v3.model.BatchLimitSpeedReq;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobDetailsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobDetailsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobStatusRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobStatusResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListProgressesRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListProgressesResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListRposAndRtosRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListRposAndRtosResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructDetailRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructDetailResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructProcessRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructProcessResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchModifyJobReq;
import com.huaweicloud.sdk.drs.v3.model.BatchModifyPwdReq;
import com.huaweicloud.sdk.drs.v3.model.BatchPauseJobReq;
import com.huaweicloud.sdk.drs.v3.model.BatchPrecheckReq;
import com.huaweicloud.sdk.drs.v3.model.BatchQueryJobReq;
import com.huaweicloud.sdk.drs.v3.model.BatchQueryJobReqPage;
import com.huaweicloud.sdk.drs.v3.model.BatchQueryParamReq;
import com.huaweicloud.sdk.drs.v3.model.BatchQueryPrecheckResultReq;
import com.huaweicloud.sdk.drs.v3.model.BatchQueryProgressReq;
import com.huaweicloud.sdk.drs.v3.model.BatchQueryRpoAndRtoReq;
import com.huaweicloud.sdk.drs.v3.model.BatchReplaceDefinerReq;
import com.huaweicloud.sdk.drs.v3.model.BatchResetPasswordRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchResetPasswordResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchRestoreTaskRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchRestoreTaskResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchRetryReq;
import com.huaweicloud.sdk.drs.v3.model.BatchSetDefinerRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetDefinerResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetObjectsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetObjectsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetPolicyRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetPolicyResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSmnRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSmnResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSpeedRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSpeedResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetupSyncPolicyReq;
import com.huaweicloud.sdk.drs.v3.model.BatchShowParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchShowParamsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSpecialTestConnectionReq;
import com.huaweicloud.sdk.drs.v3.model.BatchStartJobReq;
import com.huaweicloud.sdk.drs.v3.model.BatchStartJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchStartJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchStopJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchStopJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSwitchoverReq;
import com.huaweicloud.sdk.drs.v3.model.BatchSwitchoverRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSwitchoverResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchTestConnectionReq;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateDatabaseObjectReq;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateJobRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateJobResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateSrcUserReq;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateUserRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateUserResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateClustersConnectionsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateClustersConnectionsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateConnectionsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateConnectionsResponse;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareTaskReq;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareTaskRequest;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareTaskResponse;
import com.huaweicloud.sdk.drs.v3.model.ListAvailableZoneRequest;
import com.huaweicloud.sdk.drs.v3.model.ListAvailableZoneResponse;
import com.huaweicloud.sdk.drs.v3.model.ListCompareResultRequest;
import com.huaweicloud.sdk.drs.v3.model.ListCompareResultResponse;
import com.huaweicloud.sdk.drs.v3.model.ListUsersRequest;
import com.huaweicloud.sdk.drs.v3.model.ListUsersResponse;
import com.huaweicloud.sdk.drs.v3.model.ModifyTargetParamsReq;
import com.huaweicloud.sdk.drs.v3.model.ModifyTuningParamsReq;
import com.huaweicloud.sdk.drs.v3.model.QueryAvailableNodeTypeReq;
import com.huaweicloud.sdk.drs.v3.model.QueryCompareResultReq;
import com.huaweicloud.sdk.drs.v3.model.QueryJobsReq;
import com.huaweicloud.sdk.drs.v3.model.ShowJobListRequest;
import com.huaweicloud.sdk.drs.v3.model.ShowJobListResponse;
import com.huaweicloud.sdk.drs.v3.model.ShowMonitoringDataRequest;
import com.huaweicloud.sdk.drs.v3.model.ShowMonitoringDataResponse;
import com.huaweicloud.sdk.drs.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.drs.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.drs.v3.model.UpdateParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.UpdateParamsResponse;
import com.huaweicloud.sdk.drs.v3.model.UpdateTuningParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.UpdateTuningParamsResponse;

@SuppressWarnings("unchecked")
public class DrsMeta {

    public static final HttpRequestDef<BatchChangeDataRequest, BatchChangeDataResponse> batchChangeData =
        genForBatchChangeData();

    private static HttpRequestDef<BatchChangeDataRequest, BatchChangeDataResponse> genForBatchChangeData() {
        // basic
        HttpRequestDef.Builder<BatchChangeDataRequest, BatchChangeDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchChangeDataRequest.class, BatchChangeDataResponse.class)
                .withName("BatchChangeData")
                .withUri("/v3/{project_id}/jobs/batch-transformation")
                .withContentType("application/json");

        // requests
        builder.<BatchChangeDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchChangeDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchChangeDataRequest::getXLanguage, BatchChangeDataRequest::setXLanguage));
        builder.<BatchDataTransformationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDataTransformationReq.class),
            f -> f.withMarshaller(BatchChangeDataRequest::getBody, BatchChangeDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckJobsRequest, BatchCheckJobsResponse> batchCheckJobs =
        genForBatchCheckJobs();

    private static HttpRequestDef<BatchCheckJobsRequest, BatchCheckJobsResponse> genForBatchCheckJobs() {
        // basic
        HttpRequestDef.Builder<BatchCheckJobsRequest, BatchCheckJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckJobsRequest.class, BatchCheckJobsResponse.class)
                .withName("BatchCheckJobs")
                .withUri("/v3/{project_id}/jobs/batch-precheck")
                .withContentType("application/json");

        // requests
        builder.<BatchCheckJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCheckJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchCheckJobsRequest::getXLanguage, BatchCheckJobsRequest::setXLanguage));
        builder.<BatchPrecheckReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchPrecheckReq.class),
            f -> f.withMarshaller(BatchCheckJobsRequest::getBody, BatchCheckJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckResultsRequest, BatchCheckResultsResponse> batchCheckResults =
        genForBatchCheckResults();

    private static HttpRequestDef<BatchCheckResultsRequest, BatchCheckResultsResponse> genForBatchCheckResults() {
        // basic
        HttpRequestDef.Builder<BatchCheckResultsRequest, BatchCheckResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckResultsRequest.class, BatchCheckResultsResponse.class)
                .withName("BatchCheckResults")
                .withUri("/v3/{project_id}/jobs/batch-precheck-result")
                .withContentType("application/json");

        // requests
        builder.<BatchCheckResultsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCheckResultsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchCheckResultsRequest::getXLanguage, BatchCheckResultsRequest::setXLanguage));
        builder.<BatchQueryPrecheckResultReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryPrecheckResultReq.class),
            f -> f.withMarshaller(BatchCheckResultsRequest::getBody, BatchCheckResultsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateJobsRequest, BatchCreateJobsResponse> batchCreateJobs =
        genForBatchCreateJobs();

    private static HttpRequestDef<BatchCreateJobsRequest, BatchCreateJobsResponse> genForBatchCreateJobs() {
        // basic
        HttpRequestDef.Builder<BatchCreateJobsRequest, BatchCreateJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateJobsRequest.class, BatchCreateJobsResponse.class)
                .withName("BatchCreateJobs")
                .withUri("/v3/{project_id}/jobs/batch-creation")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchCreateJobsRequest::getXLanguage, BatchCreateJobsRequest::setXLanguage));
        builder.<BatchCreateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateJobReq.class),
            f -> f.withMarshaller(BatchCreateJobsRequest::getBody, BatchCreateJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobs =
        genForBatchDeleteJobs();

    private static HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> genForBatchDeleteJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobsRequest, BatchDeleteJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteJobsRequest.class, BatchDeleteJobsResponse.class)
                .withName("BatchDeleteJobs")
                .withUri("/v3/{project_id}/jobs/batch-jobs")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getXLanguage, BatchDeleteJobsRequest::setXLanguage));
        builder.<BatchDeleteJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteJobReq.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getBody, BatchDeleteJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListJobDetailsRequest, BatchListJobDetailsResponse> batchListJobDetails =
        genForBatchListJobDetails();

    private static HttpRequestDef<BatchListJobDetailsRequest, BatchListJobDetailsResponse> genForBatchListJobDetails() {
        // basic
        HttpRequestDef.Builder<BatchListJobDetailsRequest, BatchListJobDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListJobDetailsRequest.class, BatchListJobDetailsResponse.class)
                .withName("BatchListJobDetails")
                .withUri("/v3/{project_id}/jobs/batch-detail")
                .withContentType("application/json");

        // requests
        builder.<BatchListJobDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListJobDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchListJobDetailsRequest::getXLanguage, BatchListJobDetailsRequest::setXLanguage));
        builder.<BatchQueryJobReqPage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryJobReqPage.class),
            f -> f.withMarshaller(BatchListJobDetailsRequest::getBody, BatchListJobDetailsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListJobStatusRequest, BatchListJobStatusResponse> batchListJobStatus =
        genForBatchListJobStatus();

    private static HttpRequestDef<BatchListJobStatusRequest, BatchListJobStatusResponse> genForBatchListJobStatus() {
        // basic
        HttpRequestDef.Builder<BatchListJobStatusRequest, BatchListJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListJobStatusRequest.class, BatchListJobStatusResponse.class)
                .withName("BatchListJobStatus")
                .withUri("/v3/{project_id}/jobs/batch-status")
                .withContentType("application/json");

        // requests
        builder.<BatchListJobStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListJobStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchListJobStatusRequest::getXLanguage, BatchListJobStatusRequest::setXLanguage));
        builder.<BatchQueryJobReqPage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryJobReqPage.class),
            f -> f.withMarshaller(BatchListJobStatusRequest::getBody, BatchListJobStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListProgressesRequest, BatchListProgressesResponse> batchListProgresses =
        genForBatchListProgresses();

    private static HttpRequestDef<BatchListProgressesRequest, BatchListProgressesResponse> genForBatchListProgresses() {
        // basic
        HttpRequestDef.Builder<BatchListProgressesRequest, BatchListProgressesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListProgressesRequest.class, BatchListProgressesResponse.class)
                .withName("BatchListProgresses")
                .withUri("/v3/{project_id}/jobs/batch-progress")
                .withContentType("application/json");

        // requests
        builder.<BatchListProgressesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListProgressesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchListProgressesRequest::getXLanguage, BatchListProgressesRequest::setXLanguage));
        builder.<BatchQueryProgressReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryProgressReq.class),
            f -> f.withMarshaller(BatchListProgressesRequest::getBody, BatchListProgressesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> batchListRposAndRtos =
        genForBatchListRposAndRtos();

    private static HttpRequestDef<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> genForBatchListRposAndRtos() {
        // basic
        HttpRequestDef.Builder<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchListRposAndRtosRequest.class, BatchListRposAndRtosResponse.class)
            .withName("BatchListRposAndRtos")
            .withUri("/v3/{project_id}/jobs/batch-rpo-and-rto")
            .withContentType("application/json");

        // requests
        builder.<BatchListRposAndRtosRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListRposAndRtosRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchListRposAndRtosRequest::getXLanguage,
                BatchListRposAndRtosRequest::setXLanguage));
        builder.<BatchQueryRpoAndRtoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryRpoAndRtoReq.class),
            f -> f.withMarshaller(BatchListRposAndRtosRequest::getBody, BatchListRposAndRtosRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListStructDetailRequest, BatchListStructDetailResponse> batchListStructDetail =
        genForBatchListStructDetail();

    private static HttpRequestDef<BatchListStructDetailRequest, BatchListStructDetailResponse> genForBatchListStructDetail() {
        // basic
        HttpRequestDef.Builder<BatchListStructDetailRequest, BatchListStructDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchListStructDetailRequest.class, BatchListStructDetailResponse.class)
            .withName("BatchListStructDetail")
            .withUri("/v3/{project_id}/jobs/{type}/batch-struct-detail")
            .withContentType("application/json");

        // requests
        builder.<BatchListStructDetailRequest.TypeEnum>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchListStructDetailRequest.TypeEnum.class),
            f -> f.withMarshaller(BatchListStructDetailRequest::getType, BatchListStructDetailRequest::setType));
        builder.<BatchListStructDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListStructDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchListStructDetailRequest::getXLanguage,
                BatchListStructDetailRequest::setXLanguage));
        builder.<BatchQueryJobReqPage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryJobReqPage.class),
            f -> f.withMarshaller(BatchListStructDetailRequest::getBody, BatchListStructDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListStructProcessRequest, BatchListStructProcessResponse> batchListStructProcess =
        genForBatchListStructProcess();

    private static HttpRequestDef<BatchListStructProcessRequest, BatchListStructProcessResponse> genForBatchListStructProcess() {
        // basic
        HttpRequestDef.Builder<BatchListStructProcessRequest, BatchListStructProcessResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchListStructProcessRequest.class, BatchListStructProcessResponse.class)
            .withName("BatchListStructProcess")
            .withUri("/v3/{project_id}/jobs/batch-struct-process")
            .withContentType("application/json");

        // requests
        builder.<BatchListStructProcessRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListStructProcessRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchListStructProcessRequest::getXLanguage,
                BatchListStructProcessRequest::setXLanguage));
        builder.<BatchQueryJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryJobReq.class),
            f -> f.withMarshaller(BatchListStructProcessRequest::getBody, BatchListStructProcessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetPasswordRequest, BatchResetPasswordResponse> batchResetPassword =
        genForBatchResetPassword();

    private static HttpRequestDef<BatchResetPasswordRequest, BatchResetPasswordResponse> genForBatchResetPassword() {
        // basic
        HttpRequestDef.Builder<BatchResetPasswordRequest, BatchResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchResetPasswordRequest.class, BatchResetPasswordResponse.class)
                .withName("BatchResetPassword")
                .withUri("/v3/{project_id}/jobs/batch-modify-pwd")
                .withContentType("application/json");

        // requests
        builder.<BatchResetPasswordRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchResetPasswordRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchResetPasswordRequest::getXLanguage, BatchResetPasswordRequest::setXLanguage));
        builder.<BatchModifyPwdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchModifyPwdReq.class),
            f -> f.withMarshaller(BatchResetPasswordRequest::getBody, BatchResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreTaskRequest, BatchRestoreTaskResponse> batchRestoreTask =
        genForBatchRestoreTask();

    private static HttpRequestDef<BatchRestoreTaskRequest, BatchRestoreTaskResponse> genForBatchRestoreTask() {
        // basic
        HttpRequestDef.Builder<BatchRestoreTaskRequest, BatchRestoreTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRestoreTaskRequest.class, BatchRestoreTaskResponse.class)
                .withName("BatchRestoreTask")
                .withUri("/v3/{project_id}/jobs/batch-retry-task")
                .withContentType("application/json");

        // requests
        builder.<BatchRestoreTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchRestoreTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchRestoreTaskRequest::getXLanguage, BatchRestoreTaskRequest::setXLanguage));
        builder.<BatchRetryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRetryReq.class),
            f -> f.withMarshaller(BatchRestoreTaskRequest::getBody, BatchRestoreTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetDefinerRequest, BatchSetDefinerResponse> batchSetDefiner =
        genForBatchSetDefiner();

    private static HttpRequestDef<BatchSetDefinerRequest, BatchSetDefinerResponse> genForBatchSetDefiner() {
        // basic
        HttpRequestDef.Builder<BatchSetDefinerRequest, BatchSetDefinerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetDefinerRequest.class, BatchSetDefinerResponse.class)
                .withName("BatchSetDefiner")
                .withUri("/v3/{project_id}/jobs/batch-replace-definer")
                .withContentType("application/json");

        // requests
        builder.<BatchSetDefinerRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSetDefinerRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchSetDefinerRequest::getXLanguage, BatchSetDefinerRequest::setXLanguage));
        builder.<BatchReplaceDefinerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchReplaceDefinerReq.class),
            f -> f.withMarshaller(BatchSetDefinerRequest::getBody, BatchSetDefinerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetObjectsRequest, BatchSetObjectsResponse> batchSetObjects =
        genForBatchSetObjects();

    private static HttpRequestDef<BatchSetObjectsRequest, BatchSetObjectsResponse> genForBatchSetObjects() {
        // basic
        HttpRequestDef.Builder<BatchSetObjectsRequest, BatchSetObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchSetObjectsRequest.class, BatchSetObjectsResponse.class)
                .withName("BatchSetObjects")
                .withUri("/v3/{project_id}/jobs/batch-select-objects")
                .withContentType("application/json");

        // requests
        builder.<BatchSetObjectsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSetObjectsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchSetObjectsRequest::getXLanguage, BatchSetObjectsRequest::setXLanguage));
        builder.<BatchUpdateDatabaseObjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateDatabaseObjectReq.class),
            f -> f.withMarshaller(BatchSetObjectsRequest::getBody, BatchSetObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetPolicyRequest, BatchSetPolicyResponse> batchSetPolicy =
        genForBatchSetPolicy();

    private static HttpRequestDef<BatchSetPolicyRequest, BatchSetPolicyResponse> genForBatchSetPolicy() {
        // basic
        HttpRequestDef.Builder<BatchSetPolicyRequest, BatchSetPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetPolicyRequest.class, BatchSetPolicyResponse.class)
                .withName("BatchSetPolicy")
                .withUri("/v3/{project_id}/jobs/batch-sync-policy")
                .withContentType("application/json");

        // requests
        builder.<BatchSetPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSetPolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchSetPolicyRequest::getXLanguage, BatchSetPolicyRequest::setXLanguage));
        builder.<BatchSetupSyncPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSetupSyncPolicyReq.class),
            f -> f.withMarshaller(BatchSetPolicyRequest::getBody, BatchSetPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetSmnRequest, BatchSetSmnResponse> batchSetSmn = genForBatchSetSmn();

    private static HttpRequestDef<BatchSetSmnRequest, BatchSetSmnResponse> genForBatchSetSmn() {
        // basic
        HttpRequestDef.Builder<BatchSetSmnRequest, BatchSetSmnResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetSmnRequest.class, BatchSetSmnResponse.class)
                .withName("BatchSetSmn")
                .withUri("/v3/{project_id}/jobs/batch-set-smn")
                .withContentType("application/json");

        // requests
        builder.<BatchSetSmnRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSetSmnRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchSetSmnRequest::getXLanguage, BatchSetSmnRequest::setXLanguage));
        builder.<BatchImportSmnInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportSmnInfoReq.class),
            f -> f.withMarshaller(BatchSetSmnRequest::getBody, BatchSetSmnRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetSpeedRequest, BatchSetSpeedResponse> batchSetSpeed =
        genForBatchSetSpeed();

    private static HttpRequestDef<BatchSetSpeedRequest, BatchSetSpeedResponse> genForBatchSetSpeed() {
        // basic
        HttpRequestDef.Builder<BatchSetSpeedRequest, BatchSetSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchSetSpeedRequest.class, BatchSetSpeedResponse.class)
                .withName("BatchSetSpeed")
                .withUri("/v3/{project_id}/jobs/batch-limit-speed")
                .withContentType("application/json");

        // requests
        builder.<BatchSetSpeedRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSetSpeedRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchSetSpeedRequest::getXLanguage, BatchSetSpeedRequest::setXLanguage));
        builder.<BatchLimitSpeedReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchLimitSpeedReq.class),
            f -> f.withMarshaller(BatchSetSpeedRequest::getBody, BatchSetSpeedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowParamsRequest, BatchShowParamsResponse> batchShowParams =
        genForBatchShowParams();

    private static HttpRequestDef<BatchShowParamsRequest, BatchShowParamsResponse> genForBatchShowParams() {
        // basic
        HttpRequestDef.Builder<BatchShowParamsRequest, BatchShowParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchShowParamsRequest.class, BatchShowParamsResponse.class)
                .withName("BatchShowParams")
                .withUri("/v3/{project_id}/jobs/batch-get-params")
                .withContentType("application/json");

        // requests
        builder.<BatchShowParamsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowParamsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchShowParamsRequest::getXLanguage, BatchShowParamsRequest::setXLanguage));
        builder.<BatchQueryParamReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryParamReq.class),
            f -> f.withMarshaller(BatchShowParamsRequest::getBody, BatchShowParamsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartJobsRequest, BatchStartJobsResponse> batchStartJobs =
        genForBatchStartJobs();

    private static HttpRequestDef<BatchStartJobsRequest, BatchStartJobsResponse> genForBatchStartJobs() {
        // basic
        HttpRequestDef.Builder<BatchStartJobsRequest, BatchStartJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartJobsRequest.class, BatchStartJobsResponse.class)
                .withName("BatchStartJobs")
                .withUri("/v3/{project_id}/jobs/batch-starting")
                .withContentType("application/json");

        // requests
        builder.<BatchStartJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchStartJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchStartJobsRequest::getXLanguage, BatchStartJobsRequest::setXLanguage));
        builder.<BatchStartJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartJobReq.class),
            f -> f.withMarshaller(BatchStartJobsRequest::getBody, BatchStartJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopJobsRequest, BatchStopJobsResponse> batchStopJobs =
        genForBatchStopJobs();

    private static HttpRequestDef<BatchStopJobsRequest, BatchStopJobsResponse> genForBatchStopJobs() {
        // basic
        HttpRequestDef.Builder<BatchStopJobsRequest, BatchStopJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopJobsRequest.class, BatchStopJobsResponse.class)
                .withName("BatchStopJobs")
                .withUri("/v3/{project_id}/jobs/batch-pause-task")
                .withContentType("application/json");

        // requests
        builder.<BatchStopJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchStopJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchStopJobsRequest::getXLanguage, BatchStopJobsRequest::setXLanguage));
        builder.<BatchPauseJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchPauseJobReq.class),
            f -> f.withMarshaller(BatchStopJobsRequest::getBody, BatchStopJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSwitchoverRequest, BatchSwitchoverResponse> batchSwitchover =
        genForBatchSwitchover();

    private static HttpRequestDef<BatchSwitchoverRequest, BatchSwitchoverResponse> genForBatchSwitchover() {
        // basic
        HttpRequestDef.Builder<BatchSwitchoverRequest, BatchSwitchoverResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSwitchoverRequest.class, BatchSwitchoverResponse.class)
                .withName("BatchSwitchover")
                .withUri("/v3/{project_id}/jobs/batch-switchover")
                .withContentType("application/json");

        // requests
        builder.<BatchSwitchoverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSwitchoverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchSwitchoverRequest::getXLanguage, BatchSwitchoverRequest::setXLanguage));
        builder.<BatchSwitchoverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSwitchoverReq.class),
            f -> f.withMarshaller(BatchSwitchoverRequest::getBody, BatchSwitchoverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateJobRequest, BatchUpdateJobResponse> batchUpdateJob =
        genForBatchUpdateJob();

    private static HttpRequestDef<BatchUpdateJobRequest, BatchUpdateJobResponse> genForBatchUpdateJob() {
        // basic
        HttpRequestDef.Builder<BatchUpdateJobRequest, BatchUpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateJobRequest.class, BatchUpdateJobResponse.class)
                .withName("BatchUpdateJob")
                .withUri("/v3/{project_id}/jobs/batch-modification")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchUpdateJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchUpdateJobRequest::getXLanguage, BatchUpdateJobRequest::setXLanguage));
        builder.<BatchModifyJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchModifyJobReq.class),
            f -> f.withMarshaller(BatchUpdateJobRequest::getBody, BatchUpdateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUserRequest, BatchUpdateUserResponse> batchUpdateUser =
        genForBatchUpdateUser();

    private static HttpRequestDef<BatchUpdateUserRequest, BatchUpdateUserResponse> genForBatchUpdateUser() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUserRequest, BatchUpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateUserRequest.class, BatchUpdateUserResponse.class)
                .withName("BatchUpdateUser")
                .withUri("/v3/{project_id}/jobs/batch-update-user")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchUpdateUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchUpdateUserRequest::getXLanguage, BatchUpdateUserRequest::setXLanguage));
        builder.<BatchUpdateSrcUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateSrcUserReq.class),
            f -> f.withMarshaller(BatchUpdateUserRequest::getBody, BatchUpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> batchValidateClustersConnections =
        genForBatchValidateClustersConnections();

    private static HttpRequestDef<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> genForBatchValidateClustersConnections() {
        // basic
        HttpRequestDef.Builder<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchValidateClustersConnectionsRequest.class,
                    BatchValidateClustersConnectionsResponse.class)
                .withName("BatchValidateClustersConnections")
                .withUri("/v3/{project_id}/jobs/cluster/batch-connection")
                .withContentType("application/json");

        // requests
        builder.<BatchValidateClustersConnectionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchValidateClustersConnectionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchValidateClustersConnectionsRequest::getXLanguage,
                BatchValidateClustersConnectionsRequest::setXLanguage));
        builder.<BatchSpecialTestConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSpecialTestConnectionReq.class),
            f -> f.withMarshaller(BatchValidateClustersConnectionsRequest::getBody,
                BatchValidateClustersConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> batchValidateConnections =
        genForBatchValidateConnections();

    private static HttpRequestDef<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> genForBatchValidateConnections() {
        // basic
        HttpRequestDef.Builder<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchValidateConnectionsRequest.class, BatchValidateConnectionsResponse.class)
                .withName("BatchValidateConnections")
                .withUri("/v3/{project_id}/jobs/batch-connection")
                .withContentType("application/json");

        // requests
        builder.<BatchValidateConnectionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchValidateConnectionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchValidateConnectionsRequest::getXLanguage,
                BatchValidateConnectionsRequest::setXLanguage));
        builder.<BatchTestConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTestConnectionReq.class),
            f -> f.withMarshaller(BatchValidateConnectionsRequest::getBody, BatchValidateConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCompareTaskRequest, CreateCompareTaskResponse> createCompareTask =
        genForCreateCompareTask();

    private static HttpRequestDef<CreateCompareTaskRequest, CreateCompareTaskResponse> genForCreateCompareTask() {
        // basic
        HttpRequestDef.Builder<CreateCompareTaskRequest, CreateCompareTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCompareTaskRequest.class, CreateCompareTaskResponse.class)
                .withName("CreateCompareTask")
                .withUri("/v3/{project_id}/jobs/create-compare-task")
                .withContentType("application/json");

        // requests
        builder.<CreateCompareTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCompareTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateCompareTaskRequest::getXLanguage, CreateCompareTaskRequest::setXLanguage));
        builder.<CreateCompareTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCompareTaskReq.class),
            f -> f.withMarshaller(CreateCompareTaskRequest::getBody, CreateCompareTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZoneRequest, ListAvailableZoneResponse> listAvailableZone =
        genForListAvailableZone();

    private static HttpRequestDef<ListAvailableZoneRequest, ListAvailableZoneResponse> genForListAvailableZone() {
        // basic
        HttpRequestDef.Builder<ListAvailableZoneRequest, ListAvailableZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAvailableZoneRequest.class, ListAvailableZoneResponse.class)
                .withName("ListAvailableZone")
                .withUri("/v3/{project_id}/available-zone")
                .withContentType("application/json");

        // requests
        builder.<ListAvailableZoneRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAvailableZoneRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAvailableZoneRequest::getXLanguage, ListAvailableZoneRequest::setXLanguage));
        builder.<QueryAvailableNodeTypeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryAvailableNodeTypeReq.class),
            f -> f.withMarshaller(ListAvailableZoneRequest::getBody, ListAvailableZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompareResultRequest, ListCompareResultResponse> listCompareResult =
        genForListCompareResult();

    private static HttpRequestDef<ListCompareResultRequest, ListCompareResultResponse> genForListCompareResult() {
        // basic
        HttpRequestDef.Builder<ListCompareResultRequest, ListCompareResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCompareResultRequest.class, ListCompareResultResponse.class)
                .withName("ListCompareResult")
                .withUri("/v3/{project_id}/jobs/query-compare-result")
                .withContentType("application/json");

        // requests
        builder.<ListCompareResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCompareResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListCompareResultRequest::getXLanguage, ListCompareResultRequest::setXLanguage));
        builder.<QueryCompareResultReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryCompareResultReq.class),
            f -> f.withMarshaller(ListCompareResultRequest::getBody, ListCompareResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v3/{project_id}/jobs/{job_id}/get-src-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getJobId, ListUsersRequest::setJobId));
        builder.<ListUsersRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListUsersRequest::getXLanguage, ListUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobListRequest, ShowJobListResponse> showJobList = genForShowJobList();

    private static HttpRequestDef<ShowJobListRequest, ShowJobListResponse> genForShowJobList() {
        // basic
        HttpRequestDef.Builder<ShowJobListRequest, ShowJobListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowJobListRequest.class, ShowJobListResponse.class)
                .withName("ShowJobList")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<ShowJobListRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobListRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowJobListRequest::getXLanguage, ShowJobListRequest::setXLanguage));
        builder.<QueryJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryJobsReq.class),
            f -> f.withMarshaller(ShowJobListRequest::getBody, ShowJobListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitoringDataRequest, ShowMonitoringDataResponse> showMonitoringData =
        genForShowMonitoringData();

    private static HttpRequestDef<ShowMonitoringDataRequest, ShowMonitoringDataResponse> genForShowMonitoringData() {
        // basic
        HttpRequestDef.Builder<ShowMonitoringDataRequest, ShowMonitoringDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMonitoringDataRequest.class, ShowMonitoringDataResponse.class)
                .withName("ShowMonitoringData")
                .withUri("/v3/{project_id}/jobs/disaster-recovery-monitoring-data")
                .withContentType("application/json");

        // requests
        builder.<ShowMonitoringDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMonitoringDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowMonitoringDataRequest::getXLanguage, ShowMonitoringDataRequest::setXLanguage));
        builder.<BatchQueryJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryJobReq.class),
            f -> f.withMarshaller(ShowMonitoringDataRequest::getBody, ShowMonitoringDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowQuotasRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowQuotasRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowQuotasRequest::getXLanguage, ShowQuotasRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateParamsRequest, UpdateParamsResponse> updateParams = genForUpdateParams();

    private static HttpRequestDef<UpdateParamsRequest, UpdateParamsResponse> genForUpdateParams() {
        // basic
        HttpRequestDef.Builder<UpdateParamsRequest, UpdateParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateParamsRequest.class, UpdateParamsResponse.class)
                .withName("UpdateParams")
                .withUri("/v3/{project_id}/jobs/{job_id}/params")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateParamsRequest::getJobId, UpdateParamsRequest::setJobId));
        builder.<UpdateParamsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateParamsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateParamsRequest::getXLanguage, UpdateParamsRequest::setXLanguage));
        builder.<ModifyTargetParamsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTargetParamsReq.class),
            f -> f.withMarshaller(UpdateParamsRequest::getBody, UpdateParamsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTuningParamsRequest, UpdateTuningParamsResponse> updateTuningParams =
        genForUpdateTuningParams();

    private static HttpRequestDef<UpdateTuningParamsRequest, UpdateTuningParamsResponse> genForUpdateTuningParams() {
        // basic
        HttpRequestDef.Builder<UpdateTuningParamsRequest, UpdateTuningParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTuningParamsRequest.class, UpdateTuningParamsResponse.class)
                .withName("UpdateTuningParams")
                .withUri("/v3/{project_id}/job/{job_id}/tuning-params/modify-params")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTuningParamsRequest::getJobId, UpdateTuningParamsRequest::setJobId));
        builder.<UpdateTuningParamsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTuningParamsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateTuningParamsRequest::getXLanguage, UpdateTuningParamsRequest::setXLanguage));
        builder.<ModifyTuningParamsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTuningParamsReq.class),
            f -> f.withMarshaller(UpdateTuningParamsRequest::getBody, UpdateTuningParamsRequest::setBody));

        // response

        return builder.build();
    }

}
