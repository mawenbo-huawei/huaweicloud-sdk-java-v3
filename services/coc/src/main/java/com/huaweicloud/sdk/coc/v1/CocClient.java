package com.huaweicloud.sdk.coc.v1;

import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequest;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewResponse;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.GetPublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.GetPublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobBatchRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobBatchResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobStatisticsRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobStatisticsResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationModelRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationModelResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCceCompliantRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCceCompliantResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInterruptRecordsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInterruptRecordsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListMultiCloudResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListMultiCloudResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListPersonnelRequest;
import com.huaweicloud.sdk.coc.v1.model.ListPersonnelResponse;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskHistoryRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskHistoryResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobBatchesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobBatchesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowAccountRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowAccountResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowPatchBaselineRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowPatchBaselineResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaCustomizedTemplateRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaCustomizedTemplateResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaOrderRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaOrderResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowSloDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowSloDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncAddPersonnelRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncAddPersonnelResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CocClient {

    protected HcClient hcClient;

    public CocClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CocClient> newBuilder() {
        ClientBuilder<CocClient> clientBuilder =
            new ClientBuilder<>(CocClient::new, "GlobalCredentials,BasicCredentials");
        return clientBuilder;
    }

    /**
     * 查询客户账号
     *
     * show account ，使用场景：托管功能 sre 账号使用，查询自己管理的客户账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountRequest 请求对象
     * @return ShowAccountResponse
     */
    public ShowAccountResponse showAccount(ShowAccountRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showAccount);
    }

    /**
     * 查询客户账号
     *
     * show account ，使用场景：托管功能 sre 账号使用，查询自己管理的客户账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountRequest 请求对象
     * @return SyncInvoker<ShowAccountRequest, ShowAccountResponse>
     */
    public SyncInvoker<ShowAccountRequest, ShowAccountResponse> showAccountInvoker(ShowAccountRequest request) {
        return new SyncInvoker<>(request, CocMeta.showAccount, hcClient);
    }

    /**
     * 查询告警工单历史
     *
     * 查询告警工单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHandleHistoriesRequest 请求对象
     * @return ListAlarmHandleHistoriesResponse
     */
    public ListAlarmHandleHistoriesResponse listAlarmHandleHistories(ListAlarmHandleHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listAlarmHandleHistories);
    }

    /**
     * 查询告警工单历史
     *
     * 查询告警工单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHandleHistoriesRequest 请求对象
     * @return SyncInvoker<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse>
     */
    public SyncInvoker<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse> listAlarmHandleHistoriesInvoker(
        ListAlarmHandleHistoriesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listAlarmHandleHistories, hcClient);
    }

    /**
     * 查询Alarm
     *
     * Get alarm info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return ShowAlarmResponse
     */
    public ShowAlarmResponse showAlarm(ShowAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showAlarm);
    }

    /**
     * 查询Alarm
     *
     * Get alarm info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return SyncInvoker<ShowAlarmRequest, ShowAlarmResponse>
     */
    public SyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmInvoker(ShowAlarmRequest request) {
        return new SyncInvoker<>(request, CocMeta.showAlarm, hcClient);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listApplications);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listApplications, hcClient);
    }

    /**
     * 查询下一级的子应用、组件、分组
     *
     * 查询下一级的子应用、组件、分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationModelRequest 请求对象
     * @return ListApplicationModelResponse
     */
    public ListApplicationModelResponse listApplicationModel(ListApplicationModelRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listApplicationModel);
    }

    /**
     * 查询下一级的子应用、组件、分组
     *
     * 查询下一级的子应用、组件、分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationModelRequest 请求对象
     * @return SyncInvoker<ListApplicationModelRequest, ListApplicationModelResponse>
     */
    public SyncInvoker<ListApplicationModelRequest, ListApplicationModelResponse> listApplicationModelInvoker(
        ListApplicationModelRequest request) {
        return new SyncInvoker<>(request, CocMeta.listApplicationModel, hcClient);
    }

    /**
     * 批量创建应用视图
     *
     * 批量创建应用视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateApplicationViewRequest 请求对象
     * @return BatchCreateApplicationViewResponse
     */
    public BatchCreateApplicationViewResponse batchCreateApplicationView(BatchCreateApplicationViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.batchCreateApplicationView);
    }

    /**
     * 批量创建应用视图
     *
     * 批量创建应用视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateApplicationViewRequest 请求对象
     * @return SyncInvoker<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse>
     */
    public SyncInvoker<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> batchCreateApplicationViewInvoker(
        BatchCreateApplicationViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.batchCreateApplicationView, hcClient);
    }

    /**
     * 查询Baseline
     *
     * Get baseline info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPatchBaselineRequest 请求对象
     * @return ShowPatchBaselineResponse
     */
    public ShowPatchBaselineResponse showPatchBaseline(ShowPatchBaselineRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showPatchBaseline);
    }

    /**
     * 查询Baseline
     *
     * Get baseline info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPatchBaselineRequest 请求对象
     * @return SyncInvoker<ShowPatchBaselineRequest, ShowPatchBaselineResponse>
     */
    public SyncInvoker<ShowPatchBaselineRequest, ShowPatchBaselineResponse> showPatchBaselineInvoker(
        ShowPatchBaselineRequest request) {
        return new SyncInvoker<>(request, CocMeta.showPatchBaseline, hcClient);
    }

    /**
     * 获取合规性报告cce信息
     *
     * 分页获取合规性报告cce信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceCompliantRequest 请求对象
     * @return ListCceCompliantResponse
     */
    public ListCceCompliantResponse listCceCompliant(ListCceCompliantRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listCceCompliant);
    }

    /**
     * 获取合规性报告cce信息
     *
     * 分页获取合规性报告cce信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceCompliantRequest 请求对象
     * @return SyncInvoker<ListCceCompliantRequest, ListCceCompliantResponse>
     */
    public SyncInvoker<ListCceCompliantRequest, ListCceCompliantResponse> listCceCompliantInvoker(
        ListCceCompliantRequest request) {
        return new SyncInvoker<>(request, CocMeta.listCceCompliant, hcClient);
    }

    /**
     * 获取节点合规性报告
     *
     * 分页获取节点合规性报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceCompliantRequest 请求对象
     * @return ListInstanceCompliantResponse
     */
    public ListInstanceCompliantResponse listInstanceCompliant(ListInstanceCompliantRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listInstanceCompliant);
    }

    /**
     * 获取节点合规性报告
     *
     * 分页获取节点合规性报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceCompliantRequest 请求对象
     * @return SyncInvoker<ListInstanceCompliantRequest, ListInstanceCompliantResponse>
     */
    public SyncInvoker<ListInstanceCompliantRequest, ListInstanceCompliantResponse> listInstanceCompliantInvoker(
        ListInstanceCompliantRequest request) {
        return new SyncInvoker<>(request, CocMeta.listInstanceCompliant, hcClient);
    }

    /**
     * 分页获取节点补丁详情
     *
     * 分页获取节点补丁详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancePatchItemsRequest 请求对象
     * @return ShowInstancePatchItemsResponse
     */
    public ShowInstancePatchItemsResponse showInstancePatchItems(ShowInstancePatchItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showInstancePatchItems);
    }

    /**
     * 分页获取节点补丁详情
     *
     * 分页获取节点补丁详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancePatchItemsRequest 请求对象
     * @return SyncInvoker<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse>
     */
    public SyncInvoker<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> showInstancePatchItemsInvoker(
        ShowInstancePatchItemsRequest request) {
        return new SyncInvoker<>(request, CocMeta.showInstancePatchItems, hcClient);
    }

    /**
     * 支持用户自主接入告警数据
     *
     * 支持租户将自开发的监控系统按照标准化集成至COC，集成后告警会按照标准格式上报至COC告警中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportCustomEventRequest 请求对象
     * @return CreateReportCustomEventResponse
     */
    public CreateReportCustomEventResponse createReportCustomEvent(CreateReportCustomEventRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createReportCustomEvent);
    }

    /**
     * 支持用户自主接入告警数据
     *
     * 支持租户将自开发的监控系统按照标准化集成至COC，集成后告警会按照标准格式上报至COC告警中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportCustomEventRequest 请求对象
     * @return SyncInvoker<CreateReportCustomEventRequest, CreateReportCustomEventResponse>
     */
    public SyncInvoker<CreateReportCustomEventRequest, CreateReportCustomEventResponse> createReportCustomEventInvoker(
        CreateReportCustomEventRequest request) {
        return new SyncInvoker<>(request, CocMeta.createReportCustomEvent, hcClient);
    }

    /**
     * Prometheus事件接入
     *
     * Prometheus事件接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportPrometheusEventRequest 请求对象
     * @return CreateReportPrometheusEventResponse
     */
    public CreateReportPrometheusEventResponse createReportPrometheusEvent(CreateReportPrometheusEventRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createReportPrometheusEvent);
    }

    /**
     * Prometheus事件接入
     *
     * Prometheus事件接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportPrometheusEventRequest 请求对象
     * @return SyncInvoker<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse>
     */
    public SyncInvoker<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> createReportPrometheusEventInvoker(
        CreateReportPrometheusEventRequest request) {
        return new SyncInvoker<>(request, CocMeta.createReportPrometheusEvent, hcClient);
    }

    /**
     * CreateExternalIncident 创建事件单
     *
     * CreateExternalIncident 创建事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIncidentRequest 请求对象
     * @return CreateCocIncidentResponse
     */
    public CreateCocIncidentResponse createCocIncident(CreateCocIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createCocIncident);
    }

    /**
     * CreateExternalIncident 创建事件单
     *
     * CreateExternalIncident 创建事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIncidentRequest 请求对象
     * @return SyncInvoker<CreateCocIncidentRequest, CreateCocIncidentResponse>
     */
    public SyncInvoker<CreateCocIncidentRequest, CreateCocIncidentResponse> createCocIncidentInvoker(
        CreateCocIncidentRequest request) {
        return new SyncInvoker<>(request, CocMeta.createCocIncident, hcClient);
    }

    /**
     * HandleCocIncident处理事件单
     *
     * HandleCocIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleCocIncidentRequest 请求对象
     * @return HandleCocIncidentResponse
     */
    public HandleCocIncidentResponse handleCocIncident(HandleCocIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.handleCocIncident);
    }

    /**
     * HandleCocIncident处理事件单
     *
     * HandleCocIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleCocIncidentRequest 请求对象
     * @return SyncInvoker<HandleCocIncidentRequest, HandleCocIncidentResponse>
     */
    public SyncInvoker<HandleCocIncidentRequest, HandleCocIncidentResponse> handleCocIncidentInvoker(
        HandleCocIncidentRequest request) {
        return new SyncInvoker<>(request, CocMeta.handleCocIncident, hcClient);
    }

    /**
     * GetCocTicketOperationHistories 获取事件单历史
     *
     * ListCocTicketOperationHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCocTicketOperationHistoriesRequest 请求对象
     * @return ListCocTicketOperationHistoriesResponse
     */
    public ListCocTicketOperationHistoriesResponse listCocTicketOperationHistories(
        ListCocTicketOperationHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listCocTicketOperationHistories);
    }

    /**
     * GetCocTicketOperationHistories 获取事件单历史
     *
     * ListCocTicketOperationHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCocTicketOperationHistoriesRequest 请求对象
     * @return SyncInvoker<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse>
     */
    public SyncInvoker<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> listCocTicketOperationHistoriesInvoker(
        ListCocTicketOperationHistoriesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listCocTicketOperationHistories, hcClient);
    }

    /**
     * GetCocIncidentDetail 获取事件单详细
     *
     * ShowCocIncidentDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIncidentDetailRequest 请求对象
     * @return ShowCocIncidentDetailResponse
     */
    public ShowCocIncidentDetailResponse showCocIncidentDetail(ShowCocIncidentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showCocIncidentDetail);
    }

    /**
     * GetCocIncidentDetail 获取事件单详细
     *
     * ShowCocIncidentDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIncidentDetailRequest 请求对象
     * @return SyncInvoker<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse>
     */
    public SyncInvoker<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> showCocIncidentDetailInvoker(
        ShowCocIncidentDetailRequest request) {
        return new SyncInvoker<>(request, CocMeta.showCocIncidentDetail, hcClient);
    }

    /**
     * CreateExternalIssues 创建问题单
     *
     * CreateExternalIssues 创建问题单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIssuesRequest 请求对象
     * @return CreateCocIssuesResponse
     */
    public CreateCocIssuesResponse createCocIssues(CreateCocIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createCocIssues);
    }

    /**
     * CreateExternalIssues 创建问题单
     *
     * CreateExternalIssues 创建问题单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIssuesRequest 请求对象
     * @return SyncInvoker<CreateCocIssuesRequest, CreateCocIssuesResponse>
     */
    public SyncInvoker<CreateCocIssuesRequest, CreateCocIssuesResponse> createCocIssuesInvoker(
        CreateCocIssuesRequest request) {
        return new SyncInvoker<>(request, CocMeta.createCocIssues, hcClient);
    }

    /**
     * GetCocIssuesDetail 获取事件单详细
     *
     * ShowCocIssuesDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIssuesDetailRequest 请求对象
     * @return ShowCocIssuesDetailResponse
     */
    public ShowCocIssuesDetailResponse showCocIssuesDetail(ShowCocIssuesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showCocIssuesDetail);
    }

    /**
     * GetCocIssuesDetail 获取事件单详细
     *
     * ShowCocIssuesDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIssuesDetailRequest 请求对象
     * @return SyncInvoker<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse>
     */
    public SyncInvoker<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> showCocIssuesDetailInvoker(
        ShowCocIssuesDetailRequest request) {
        return new SyncInvoker<>(request, CocMeta.showCocIssuesDetail, hcClient);
    }

    /**
     * 查询COC可授权单列表
     *
     * 查询COC可授权单列表（变更单号、事件单号、warroom和告警）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizableTicketsExternalRequest 请求对象
     * @return ListAuthorizableTicketsExternalResponse
     */
    public ListAuthorizableTicketsExternalResponse listAuthorizableTicketsExternal(
        ListAuthorizableTicketsExternalRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listAuthorizableTicketsExternal);
    }

    /**
     * 查询COC可授权单列表
     *
     * 查询COC可授权单列表（变更单号、事件单号、warroom和告警）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizableTicketsExternalRequest 请求对象
     * @return SyncInvoker<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse>
     */
    public SyncInvoker<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> listAuthorizableTicketsExternalInvoker(
        ListAuthorizableTicketsExternalRequest request) {
        return new SyncInvoker<>(request, CocMeta.listAuthorizableTicketsExternal, hcClient);
    }

    /**
     * 查询用户在云厂商中的资源
     *
     * 查询用户在云厂商中的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudResourcesRequest 请求对象
     * @return ListMultiCloudResourcesResponse
     */
    public ListMultiCloudResourcesResponse listMultiCloudResources(ListMultiCloudResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listMultiCloudResources);
    }

    /**
     * 查询用户在云厂商中的资源
     *
     * 查询用户在云厂商中的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudResourcesRequest 请求对象
     * @return SyncInvoker<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse>
     */
    public SyncInvoker<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse> listMultiCloudResourcesInvoker(
        ListMultiCloudResourcesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listMultiCloudResources, hcClient);
    }

    /**
     * 查询人员列表
     *
     * 获取人员列表（公网调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonnelRequest 请求对象
     * @return ListPersonnelResponse
     */
    public ListPersonnelResponse listPersonnel(ListPersonnelRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listPersonnel);
    }

    /**
     * 查询人员列表
     *
     * 获取人员列表（公网调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonnelRequest 请求对象
     * @return SyncInvoker<ListPersonnelRequest, ListPersonnelResponse>
     */
    public SyncInvoker<ListPersonnelRequest, ListPersonnelResponse> listPersonnelInvoker(ListPersonnelRequest request) {
        return new SyncInvoker<>(request, CocMeta.listPersonnel, hcClient);
    }

    /**
     * 同步人员
     *
     * 同步人员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncAddPersonnelRequest 请求对象
     * @return SyncAddPersonnelResponse
     */
    public SyncAddPersonnelResponse syncAddPersonnel(SyncAddPersonnelRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncAddPersonnel);
    }

    /**
     * 同步人员
     *
     * 同步人员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncAddPersonnelRequest 请求对象
     * @return SyncInvoker<SyncAddPersonnelRequest, SyncAddPersonnelResponse>
     */
    public SyncInvoker<SyncAddPersonnelRequest, SyncAddPersonnelResponse> syncAddPersonnelInvoker(
        SyncAddPersonnelRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncAddPersonnel, hcClient);
    }

    /**
     * 查询用户各种资源总数
     *
     * 查询用户各种资源总数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiResourcesRequest 请求对象
     * @return CountMultiResourcesResponse
     */
    public CountMultiResourcesResponse countMultiResources(CountMultiResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countMultiResources);
    }

    /**
     * 查询用户各种资源总数
     *
     * 查询用户各种资源总数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiResourcesRequest 请求对象
     * @return SyncInvoker<CountMultiResourcesRequest, CountMultiResourcesResponse>
     */
    public SyncInvoker<CountMultiResourcesRequest, CountMultiResourcesResponse> countMultiResourcesInvoker(
        CountMultiResourcesRequest request) {
        return new SyncInvoker<>(request, CocMeta.countMultiResources, hcClient);
    }

    /**
     * 查询用户所有资源
     *
     * 查询用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
     * @return ListResourceResponse
     */
    public ListResourceResponse listResource(ListResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listResource);
    }

    /**
     * 查询用户所有资源
     *
     * 查询用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
     * @return SyncInvoker<ListResourceRequest, ListResourceResponse>
     */
    public SyncInvoker<ListResourceRequest, ListResourceResponse> listResourceInvoker(ListResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.listResource, hcClient);
    }

    /**
     * 从RMS同步用户所有资源
     *
     * 从RMS同步用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceRequest 请求对象
     * @return SyncResourceResponse
     */
    public SyncResourceResponse syncResource(SyncResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncResource);
    }

    /**
     * 从RMS同步用户所有资源
     *
     * 从RMS同步用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceRequest 请求对象
     * @return SyncInvoker<SyncResourceRequest, SyncResourceResponse>
     */
    public SyncInvoker<SyncResourceRequest, SyncResourceResponse> syncResourceInvoker(SyncResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncResource, hcClient);
    }

    /**
     * 新建定时运维
     *
     * Create Scheduled Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTaskRequest 请求对象
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createScheduledTask);
    }

    /**
     * 新建定时运维
     *
     * Create Scheduled Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTaskRequest 请求对象
     * @return SyncInvoker<CreateScheduledTaskRequest, CreateScheduledTaskResponse>
     */
    public SyncInvoker<CreateScheduledTaskRequest, CreateScheduledTaskResponse> createScheduledTaskInvoker(
        CreateScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.createScheduledTask, hcClient);
    }

    /**
     * 删除ScheduledTask
     *
     * Delete scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteScheduledTask);
    }

    /**
     * 删除ScheduledTask
     *
     * Delete scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskInvoker(
        DeleteScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 禁用ScheduledTask
     *
     * Disable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableScheduledTaskRequest 请求对象
     * @return DisableScheduledTaskResponse
     */
    public DisableScheduledTaskResponse disableScheduledTask(DisableScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.disableScheduledTask);
    }

    /**
     * 禁用ScheduledTask
     *
     * Disable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableScheduledTaskRequest 请求对象
     * @return SyncInvoker<DisableScheduledTaskRequest, DisableScheduledTaskResponse>
     */
    public SyncInvoker<DisableScheduledTaskRequest, DisableScheduledTaskResponse> disableScheduledTaskInvoker(
        DisableScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.disableScheduledTask, hcClient);
    }

    /**
     * 启用ScheduledTask
     *
     * Enable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableScheduledTaskRequest 请求对象
     * @return EnableScheduledTaskResponse
     */
    public EnableScheduledTaskResponse enableScheduledTask(EnableScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.enableScheduledTask);
    }

    /**
     * 启用ScheduledTask
     *
     * Enable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableScheduledTaskRequest 请求对象
     * @return SyncInvoker<EnableScheduledTaskRequest, EnableScheduledTaskResponse>
     */
    public SyncInvoker<EnableScheduledTaskRequest, EnableScheduledTaskResponse> enableScheduledTaskInvoker(
        EnableScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.enableScheduledTask, hcClient);
    }

    /**
     * 查询ScheduledTask列表
     *
     * Get ScheduledTask infos
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskRequest 请求对象
     * @return ListScheduledTaskResponse
     */
    public ListScheduledTaskResponse listScheduledTask(ListScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScheduledTask);
    }

    /**
     * 查询ScheduledTask列表
     *
     * Get ScheduledTask infos
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskRequest 请求对象
     * @return SyncInvoker<ListScheduledTaskRequest, ListScheduledTaskResponse>
     */
    public SyncInvoker<ListScheduledTaskRequest, ListScheduledTaskResponse> listScheduledTaskInvoker(
        ListScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScheduledTask, hcClient);
    }

    /**
     * 查询定时运维历史记录
     *
     * get scheduled task history list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskHistoryRequest 请求对象
     * @return ListScheduledTaskHistoryResponse
     */
    public ListScheduledTaskHistoryResponse listScheduledTaskHistory(ListScheduledTaskHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScheduledTaskHistory);
    }

    /**
     * 查询定时运维历史记录
     *
     * get scheduled task history list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskHistoryRequest 请求对象
     * @return SyncInvoker<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse>
     */
    public SyncInvoker<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse> listScheduledTaskHistoryInvoker(
        ListScheduledTaskHistoryRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScheduledTaskHistory, hcClient);
    }

    /**
     * 查询ScheduledTask
     *
     * Get ScheduledTask info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTaskRequest 请求对象
     * @return ShowScheduledTaskResponse
     */
    public ShowScheduledTaskResponse showScheduledTask(ShowScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showScheduledTask);
    }

    /**
     * 查询ScheduledTask
     *
     * Get ScheduledTask info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTaskRequest 请求对象
     * @return SyncInvoker<ShowScheduledTaskRequest, ShowScheduledTaskResponse>
     */
    public SyncInvoker<ShowScheduledTaskRequest, ShowScheduledTaskResponse> showScheduledTaskInvoker(
        ShowScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.showScheduledTask, hcClient);
    }

    /**
     * 修改ScheduledTask
     *
     * Update ScheduledTask
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return UpdateScheduledTaskResponse
     */
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateScheduledTask);
    }

    /**
     * 修改ScheduledTask
     *
     * Update ScheduledTask
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskInvoker(
        UpdateScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateScheduledTask, hcClient);
    }

    /**
     * 展示批次详情
     *
     * 查询：批次详情，分页获取批次中的实例列表。
     * 过滤条件：分页参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobBatchRequest 请求对象
     * @return GetScriptJobBatchResponse
     */
    public GetScriptJobBatchResponse getScriptJobBatch(GetScriptJobBatchRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScriptJobBatch);
    }

    /**
     * 展示批次详情
     *
     * 查询：批次详情，分页获取批次中的实例列表。
     * 过滤条件：分页参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobBatchRequest 请求对象
     * @return SyncInvoker<GetScriptJobBatchRequest, GetScriptJobBatchResponse>
     */
    public SyncInvoker<GetScriptJobBatchRequest, GetScriptJobBatchResponse> getScriptJobBatchInvoker(
        GetScriptJobBatchRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScriptJobBatch, hcClient);
    }

    /**
     * 展示脚本工单基本信息
     *
     * 查询执行：基本信息
     * 执行类型、执行名称、创建人、创建时间、结束时间、执行状态、标签（脚本id，脚本名，执行脚本参数，执行用户，超时时长、成功率阈值）
     * 
     * 不同的任务类型消费标签中的不同key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobInfoRequest 请求对象
     * @return GetScriptJobInfoResponse
     */
    public GetScriptJobInfoResponse getScriptJobInfo(GetScriptJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScriptJobInfo);
    }

    /**
     * 展示脚本工单基本信息
     *
     * 查询执行：基本信息
     * 执行类型、执行名称、创建人、创建时间、结束时间、执行状态、标签（脚本id，脚本名，执行脚本参数，执行用户，超时时长、成功率阈值）
     * 
     * 不同的任务类型消费标签中的不同key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobInfoRequest 请求对象
     * @return SyncInvoker<GetScriptJobInfoRequest, GetScriptJobInfoResponse>
     */
    public SyncInvoker<GetScriptJobInfoRequest, GetScriptJobInfoResponse> getScriptJobInfoInvoker(
        GetScriptJobInfoRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScriptJobInfo, hcClient);
    }

    /**
     * 展示实例状态统计信息
     *
     * 查询：实例状态统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobStatisticsRequest 请求对象
     * @return GetScriptJobStatisticsResponse
     */
    public GetScriptJobStatisticsResponse getScriptJobStatistics(GetScriptJobStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScriptJobStatistics);
    }

    /**
     * 展示实例状态统计信息
     *
     * 查询：实例状态统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobStatisticsRequest 请求对象
     * @return SyncInvoker<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse>
     */
    public SyncInvoker<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> getScriptJobStatisticsInvoker(
        GetScriptJobStatisticsRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScriptJobStatistics, hcClient);
    }

    /**
     * 展示批次列表
     *
     * 查询：批次列表
     * 返回：批次index、批次标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobBatchesRequest 请求对象
     * @return ListScriptJobBatchesResponse
     */
    public ListScriptJobBatchesResponse listScriptJobBatches(ListScriptJobBatchesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScriptJobBatches);
    }

    /**
     * 展示批次列表
     *
     * 查询：批次列表
     * 返回：批次index、批次标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobBatchesRequest 请求对象
     * @return SyncInvoker<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse>
     */
    public SyncInvoker<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> listScriptJobBatchesInvoker(
        ListScriptJobBatchesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScriptJobBatches, hcClient);
    }

    /**
     * 展示工单列表
     *
     * 查询作业工单列表，分页查询
     * 过滤：创建时间开始，创建时间结束、创建人
     * 返回：id、脚本名称、区域、创建人、创建时间、结束时间、总耗时、状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobsRequest 请求对象
     * @return ListScriptJobsResponse
     */
    public ListScriptJobsResponse listScriptJobs(ListScriptJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScriptJobs);
    }

    /**
     * 展示工单列表
     *
     * 查询作业工单列表，分页查询
     * 过滤：创建时间开始，创建时间结束、创建人
     * 返回：id、脚本名称、区域、创建人、创建时间、结束时间、总耗时、状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobsRequest 请求对象
     * @return SyncInvoker<ListScriptJobsRequest, ListScriptJobsResponse>
     */
    public SyncInvoker<ListScriptJobsRequest, ListScriptJobsResponse> listScriptJobsInvoker(
        ListScriptJobsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScriptJobs, hcClient);
    }

    /**
     * 操作脚本工单
     *
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateScriptJobRequest 请求对象
     * @return OperateScriptJobResponse
     */
    public OperateScriptJobResponse operateScriptJob(OperateScriptJobRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.operateScriptJob);
    }

    /**
     * 操作脚本工单
     *
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateScriptJobRequest 请求对象
     * @return SyncInvoker<OperateScriptJobRequest, OperateScriptJobResponse>
     */
    public SyncInvoker<OperateScriptJobRequest, OperateScriptJobResponse> operateScriptJobInvoker(
        OperateScriptJobRequest request) {
        return new SyncInvoker<>(request, CocMeta.operateScriptJob, hcClient);
    }

    /**
     * 创建脚本
     *
     * 创建作业脚本：自定义脚本
     * - 脚本有标签属性，表示是高危脚本。创建时候不需要对脚本进行是否是高危的二次校验。
     * - 进行租户隔离；北向接口创建的脚本，审批人字段不填写，默认不需要审批
     * - 约束条件：
     * - 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * - 脚本内容最大100kb。
     * - 脚本参数个数最多20个。
     * - 脚本描述：最大256个字符。
     * - 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * - 单个参数的值最大1024个字符，正则表达式如下：^((?!\\.{2,})[a-zA-Z0-9_\\-/\\.\\*\\x20\\?:\&quot;,&#x3D;+@\\\\\\[\\{\\]\\}])*$。
     * - 审批人最多支持5人。
     * - 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createScript);
    }

    /**
     * 创建脚本
     *
     * 创建作业脚本：自定义脚本
     * - 脚本有标签属性，表示是高危脚本。创建时候不需要对脚本进行是否是高危的二次校验。
     * - 进行租户隔离；北向接口创建的脚本，审批人字段不填写，默认不需要审批
     * - 约束条件：
     * - 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * - 脚本内容最大100kb。
     * - 脚本参数个数最多20个。
     * - 脚本描述：最大256个字符。
     * - 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * - 单个参数的值最大1024个字符，正则表达式如下：^((?!\\.{2,})[a-zA-Z0-9_\\-/\\.\\*\\x20\\?:\&quot;,&#x3D;+@\\\\\\[\\{\\]\\}])*$。
     * - 审批人最多支持5人。
     * - 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return SyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public SyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptInvoker(CreateScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.createScript, hcClient);
    }

    /**
     * 删除自定义脚本
     *
     * 删除作业脚本：自定义脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteScript);
    }

    /**
     * 删除自定义脚本
     *
     * 删除作业脚本：自定义脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public SyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptInvoker(DeleteScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteScript, hcClient);
    }

    /**
     * 执行自定义脚本
     *
     * 执行脚本
     * 
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.executeScript);
    }

    /**
     * 执行自定义脚本
     *
     * 执行脚本
     * 
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptInvoker(ExecuteScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.executeScript, hcClient);
    }

    /**
     * 获取自定义脚本详情
     *
     * 获取脚本详情
     * 约束条件：
     * 只能查询自定义脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptRequest 请求对象
     * @return GetScriptResponse
     */
    public GetScriptResponse getScript(GetScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScript);
    }

    /**
     * 获取自定义脚本详情
     *
     * 获取脚本详情
     * 约束条件：
     * 只能查询自定义脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptRequest 请求对象
     * @return SyncInvoker<GetScriptRequest, GetScriptResponse>
     */
    public SyncInvoker<GetScriptRequest, GetScriptResponse> getScriptInvoker(GetScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScript, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 作业脚本列表：自定义脚本
     * 
     * limit最大为100
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 作业脚本列表：自定义脚本
     * 
     * limit最大为100
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return SyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public SyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsInvoker(ListScriptsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScripts, hcClient);
    }

    /**
     * 修改脚本
     *
     * 修改作业脚本：自定义脚本
     * 约束条件：
     * 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * 脚本内容最大4096个字符。
     * 脚本参数个数最多20个。
     * 脚本描述：最大256个字符。
     * 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * 单个参数的值最大1024个字符，正则表达式如下：^((?!.{2,})[a-zA-Z0-9_-/.*\\x20?:\&quot;,&#x3D;+@\\[{]}])*$。
     * 修改的脚本如果有审批人，在修改之后，需要再次选择审批人，查询审批
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateScript);
    }

    /**
     * 修改脚本
     *
     * 修改作业脚本：自定义脚本
     * 约束条件：
     * 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * 脚本内容最大4096个字符。
     * 脚本参数个数最多20个。
     * 脚本描述：最大256个字符。
     * 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * 单个参数的值最大1024个字符，正则表达式如下：^((?!.{2,})[a-zA-Z0-9_-/.*\\x20?:\&quot;,&#x3D;+@\\[{]}])*$。
     * 修改的脚本如果有审批人，在修改之后，需要再次选择审批人，查询审批
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return SyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public SyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptInvoker(UpdateScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateScript, hcClient);
    }

    /**
     * 执行公共脚本
     *
     * 执行公共脚本
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePublicScriptRequest 请求对象
     * @return ExecutePublicScriptResponse
     */
    public ExecutePublicScriptResponse executePublicScript(ExecutePublicScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.executePublicScript);
    }

    /**
     * 执行公共脚本
     *
     * 执行公共脚本
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePublicScriptRequest 请求对象
     * @return SyncInvoker<ExecutePublicScriptRequest, ExecutePublicScriptResponse>
     */
    public SyncInvoker<ExecutePublicScriptRequest, ExecutePublicScriptResponse> executePublicScriptInvoker(
        ExecutePublicScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.executePublicScript, hcClient);
    }

    /**
     * 展示公共脚本详情
     *
     * 展示公共脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPublicScriptRequest 请求对象
     * @return GetPublicScriptResponse
     */
    public GetPublicScriptResponse getPublicScript(GetPublicScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getPublicScript);
    }

    /**
     * 展示公共脚本详情
     *
     * 展示公共脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPublicScriptRequest 请求对象
     * @return SyncInvoker<GetPublicScriptRequest, GetPublicScriptResponse>
     */
    public SyncInvoker<GetPublicScriptRequest, GetPublicScriptResponse> getPublicScriptInvoker(
        GetPublicScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.getPublicScript, hcClient);
    }

    /**
     * 获取公共脚本列表
     *
     * 获取公共脚本列表，分页逻辑：采用limit+marker方式，提高分页效率。用自增id作为marker参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicScriptsRequest 请求对象
     * @return ListPublicScriptsResponse
     */
    public ListPublicScriptsResponse listPublicScripts(ListPublicScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listPublicScripts);
    }

    /**
     * 获取公共脚本列表
     *
     * 获取公共脚本列表，分页逻辑：采用limit+marker方式，提高分页效率。用自增id作为marker参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicScriptsRequest 请求对象
     * @return SyncInvoker<ListPublicScriptsRequest, ListPublicScriptsResponse>
     */
    public SyncInvoker<ListPublicScriptsRequest, ListPublicScriptsResponse> listPublicScriptsInvoker(
        ListPublicScriptsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listPublicScripts, hcClient);
    }

    /**
     * 查询Sla模板详情
     *
     * Get Sla Template info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaCustomizedTemplateRequest 请求对象
     * @return ShowSlaCustomizedTemplateResponse
     */
    public ShowSlaCustomizedTemplateResponse showSlaCustomizedTemplate(ShowSlaCustomizedTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showSlaCustomizedTemplate);
    }

    /**
     * 查询Sla模板详情
     *
     * Get Sla Template info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaCustomizedTemplateRequest 请求对象
     * @return SyncInvoker<ShowSlaCustomizedTemplateRequest, ShowSlaCustomizedTemplateResponse>
     */
    public SyncInvoker<ShowSlaCustomizedTemplateRequest, ShowSlaCustomizedTemplateResponse> showSlaCustomizedTemplateInvoker(
        ShowSlaCustomizedTemplateRequest request) {
        return new SyncInvoker<>(request, CocMeta.showSlaCustomizedTemplate, hcClient);
    }

    /**
     * 查询SLA工单信息
     *
     * SLA 工单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaOrderRequest 请求对象
     * @return ShowSlaOrderResponse
     */
    public ShowSlaOrderResponse showSlaOrder(ShowSlaOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showSlaOrder);
    }

    /**
     * 查询SLA工单信息
     *
     * SLA 工单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaOrderRequest 请求对象
     * @return SyncInvoker<ShowSlaOrderRequest, ShowSlaOrderResponse>
     */
    public SyncInvoker<ShowSlaOrderRequest, ShowSlaOrderResponse> showSlaOrderInvoker(ShowSlaOrderRequest request) {
        return new SyncInvoker<>(request, CocMeta.showSlaOrder, hcClient);
    }

    /**
     * 查询中断记录
     *
     * 查询中断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInterruptRecordsRequest 请求对象
     * @return ListInterruptRecordsResponse
     */
    public ListInterruptRecordsResponse listInterruptRecords(ListInterruptRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listInterruptRecords);
    }

    /**
     * 查询中断记录
     *
     * 查询中断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInterruptRecordsRequest 请求对象
     * @return SyncInvoker<ListInterruptRecordsRequest, ListInterruptRecordsResponse>
     */
    public SyncInvoker<ListInterruptRecordsRequest, ListInterruptRecordsResponse> listInterruptRecordsInvoker(
        ListInterruptRecordsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listInterruptRecords, hcClient);
    }

    /**
     * 查询SLO详情
     *
     * 查询SLO详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSloDetailRequest 请求对象
     * @return ShowSloDetailResponse
     */
    public ShowSloDetailResponse showSloDetail(ShowSloDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showSloDetail);
    }

    /**
     * 查询SLO详情
     *
     * 查询SLO详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSloDetailRequest 请求对象
     * @return SyncInvoker<ShowSloDetailRequest, ShowSloDetailResponse>
     */
    public SyncInvoker<ShowSloDetailRequest, ShowSloDetailResponse> showSloDetailInvoker(ShowSloDetailRequest request) {
        return new SyncInvoker<>(request, CocMeta.showSloDetail, hcClient);
    }

    /**
     * 创建租户区WarRoom
     *
     * 创建租户区WarRoom
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarRoomRequest 请求对象
     * @return CreateWarRoomResponse
     */
    public CreateWarRoomResponse createWarRoom(CreateWarRoomRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createWarRoom);
    }

    /**
     * 创建租户区WarRoom
     *
     * 创建租户区WarRoom
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarRoomRequest 请求对象
     * @return SyncInvoker<CreateWarRoomRequest, CreateWarRoomResponse>
     */
    public SyncInvoker<CreateWarRoomRequest, CreateWarRoomResponse> createWarRoomInvoker(CreateWarRoomRequest request) {
        return new SyncInvoker<>(request, CocMeta.createWarRoom, hcClient);
    }

    /**
     * 查询租户区WarRoom信息列表
     *
     * 查询租户区WarRoom信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarRoomsRequest 请求对象
     * @return ListWarRoomsResponse
     */
    public ListWarRoomsResponse listWarRooms(ListWarRoomsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listWarRooms);
    }

    /**
     * 查询租户区WarRoom信息列表
     *
     * 查询租户区WarRoom信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarRoomsRequest 请求对象
     * @return SyncInvoker<ListWarRoomsRequest, ListWarRoomsResponse>
     */
    public SyncInvoker<ListWarRoomsRequest, ListWarRoomsResponse> listWarRoomsInvoker(ListWarRoomsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listWarRooms, hcClient);
    }

}
