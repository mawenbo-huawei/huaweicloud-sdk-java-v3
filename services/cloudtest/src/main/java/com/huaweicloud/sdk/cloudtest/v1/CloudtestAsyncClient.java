package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudtestAsyncClient {

    protected HcClient hcClient;

    public CloudtestAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestAsyncClient> newBuilder() {
        ClientBuilder<CloudtestAsyncClient> clientBuilder = new ClientBuilder<>(CloudtestAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestCaseResponse>
     */
    public CompletableFuture<BatchDeleteTestCaseResponse> batchDeleteTestCaseAsync(BatchDeleteTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseAsyncInvoker(
        BatchDeleteTestCaseRequest request) {
        return new AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>(request,
            CloudtestMeta.batchDeleteTestCase, hcClient);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlanRequest 请求对象
     * @return CompletableFuture<CreatePlanResponse>
     */
    public CompletableFuture<CreatePlanResponse> createPlanAsync(CreatePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlanRequest 请求对象
     * @return AsyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public AsyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanAsyncInvoker(CreatePlanRequest request) {
        return new AsyncInvoker<CreatePlanRequest, CreatePlanResponse>(request, CloudtestMeta.createPlan, hcClient);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return AsyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public AsyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceAsyncInvoker(
        CreateServiceRequest request) {
        return new AsyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, CloudtestMeta.createService,
            hcClient);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseRequest 请求对象
     * @return CompletableFuture<CreateTestCaseResponse>
     */
    public CompletableFuture<CreateTestCaseResponse> createTestCaseAsync(CreateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseAsyncInvoker(
        CreateTestCaseRequest request) {
        return new AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>(request, CloudtestMeta.createTestCase,
            hcClient);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return CompletableFuture<CreateTestCaseInPlanResponse>
     */
    public CompletableFuture<CreateTestCaseInPlanResponse> createTestCaseInPlanAsync(
        CreateTestCaseInPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanAsyncInvoker(
        CreateTestCaseInPlanRequest request) {
        return new AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>(request,
            CloudtestMeta.createTestCaseInPlan, hcClient);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceAsyncInvoker(
        DeleteServiceRequest request) {
        return new AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, CloudtestMeta.deleteService,
            hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBranchesRequest 请求对象
     * @return CompletableFuture<ListBranchesResponse>
     */
    public CompletableFuture<ListBranchesResponse> listBranchesAsync(ListBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBranchesRequest 请求对象
     * @return AsyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public AsyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesAsyncInvoker(
        ListBranchesRequest request) {
        return new AsyncInvoker<ListBranchesRequest, ListBranchesResponse>(request, CloudtestMeta.listBranches,
            hcClient);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTestCaseHistoriesRequest 请求对象
     * @return CompletableFuture<ListTestCaseHistoriesResponse>
     */
    public CompletableFuture<ListTestCaseHistoriesResponse> listTestCaseHistoriesAsync(
        ListTestCaseHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCaseHistories);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTestCaseHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse>
     */
    public AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistoriesAsyncInvoker(
        ListTestCaseHistoriesRequest request) {
        return new AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse>(request,
            CloudtestMeta.listTestCaseHistories, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTestCasesRequest 请求对象
     * @return CompletableFuture<ListTestCasesResponse>
     */
    public CompletableFuture<ListTestCasesResponse> listTestCasesAsync(ListTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTestCasesRequest 请求对象
     * @return AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse>
     */
    public AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse> listTestCasesAsyncInvoker(
        ListTestCasesRequest request) {
        return new AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse>(request, CloudtestMeta.listTestCases,
            hcClient);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTestCaseRequest 请求对象
     * @return CompletableFuture<RunTestCaseResponse>
     */
    public CompletableFuture<RunTestCaseResponse> runTestCaseAsync(RunTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTestCaseRequest 请求对象
     * @return AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseAsyncInvoker(RunTestCaseRequest request) {
        return new AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse>(request, CloudtestMeta.runTestCase, hcClient);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiTestcaseHistoriesRequest 请求对象
     * @return CompletableFuture<ShowApiTestcaseHistoriesResponse>
     */
    public CompletableFuture<ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesAsync(
        ShowApiTestcaseHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showApiTestcaseHistories);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiTestcaseHistoriesRequest 请求对象
     * @return AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse>
     */
    public AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesAsyncInvoker(
        ShowApiTestcaseHistoriesRequest request) {
        return new AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse>(request,
            CloudtestMeta.showApiTestcaseHistories, hcClient);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssuesByPlanIdRequest 请求对象
     * @return CompletableFuture<ShowIssuesByPlanIdResponse>
     */
    public CompletableFuture<ShowIssuesByPlanIdResponse> showIssuesByPlanIdAsync(ShowIssuesByPlanIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIssuesByPlanId);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssuesByPlanIdRequest 请求对象
     * @return AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>
     */
    public AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanIdAsyncInvoker(
        ShowIssuesByPlanIdRequest request) {
        return new AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>(request,
            CloudtestMeta.showIssuesByPlanId, hcClient);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanJournalsRequest 请求对象
     * @return CompletableFuture<ShowPlanJournalsResponse>
     */
    public CompletableFuture<ShowPlanJournalsResponse> showPlanJournalsAsync(ShowPlanJournalsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlanJournals);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanJournalsRequest 请求对象
     * @return AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>
     */
    public AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournalsAsyncInvoker(
        ShowPlanJournalsRequest request) {
        return new AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>(request,
            CloudtestMeta.showPlanJournals, hcClient);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanListRequest 请求对象
     * @return CompletableFuture<ShowPlanListResponse>
     */
    public CompletableFuture<ShowPlanListResponse> showPlanListAsync(ShowPlanListRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlanList);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanListRequest 请求对象
     * @return AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse>
     */
    public AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse> showPlanListAsyncInvoker(
        ShowPlanListRequest request) {
        return new AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse>(request, CloudtestMeta.showPlanList,
            hcClient);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlansRequest 请求对象
     * @return CompletableFuture<ShowPlansResponse>
     */
    public CompletableFuture<ShowPlansResponse> showPlansAsync(ShowPlansRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlans);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlansRequest 请求对象
     * @return AsyncInvoker<ShowPlansRequest, ShowPlansResponse>
     */
    public AsyncInvoker<ShowPlansRequest, ShowPlansResponse> showPlansAsyncInvoker(ShowPlansRequest request) {
        return new AsyncInvoker<ShowPlansRequest, ShowPlansResponse>(request, CloudtestMeta.showPlans, hcClient);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return CompletableFuture<ShowRegisterServiceResponse>
     */
    public CompletableFuture<ShowRegisterServiceResponse> showRegisterServiceAsync(ShowRegisterServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceAsyncInvoker(
        ShowRegisterServiceRequest request) {
        return new AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>(request,
            CloudtestMeta.showRegisterService, hcClient);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse>
     */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showReport);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<ShowReportRequest, ShowReportResponse>(request, CloudtestMeta.showReport, hcClient);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseAndDefectInfoRequest 请求对象
     * @return CompletableFuture<ShowTestCaseAndDefectInfoResponse>
     */
    public CompletableFuture<ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoAsync(
        ShowTestCaseAndDefectInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseAndDefectInfo);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseAndDefectInfoRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse>
     */
    public AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoAsyncInvoker(
        ShowTestCaseAndDefectInfoRequest request) {
        return new AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse>(request,
            CloudtestMeta.showTestCaseAndDefectInfo, hcClient);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowTestCaseDetailResponse>
     */
    public CompletableFuture<ShowTestCaseDetailResponse> showTestCaseDetailAsync(ShowTestCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailAsyncInvoker(
        ShowTestCaseDetailRequest request) {
        return new AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>(request,
            CloudtestMeta.showTestCaseDetail, hcClient);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return CompletableFuture<ShowTestCaseDetailV2Response>
     */
    public CompletableFuture<ShowTestCaseDetailV2Response> showTestCaseDetailV2Async(
        ShowTestCaseDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2AsyncInvoker(
        ShowTestCaseDetailV2Request request) {
        return new AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>(request,
            CloudtestMeta.showTestCaseDetailV2, hcClient);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return CompletableFuture<ShowUserExecuteTestCaseInfoResponse>
     */
    public CompletableFuture<ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoAsync(
        ShowUserExecuteTestCaseInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showUserExecuteTestCaseInfo);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse>
     */
    public AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoAsyncInvoker(
        ShowUserExecuteTestCaseInfoRequest request) {
        return new AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse>(request,
            CloudtestMeta.showUserExecuteTestCaseInfo, hcClient);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceAsyncInvoker(
        UpdateServiceRequest request) {
        return new AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, CloudtestMeta.updateService,
            hcClient);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResponse>
     */
    public CompletableFuture<UpdateTestCaseResponse> updateTestCaseAsync(UpdateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseAsyncInvoker(
        UpdateTestCaseRequest request) {
        return new AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>(request, CloudtestMeta.updateTestCase,
            hcClient);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResultResponse>
     */
    public CompletableFuture<UpdateTestCaseResultResponse> updateTestCaseResultAsync(
        UpdateTestCaseResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultAsyncInvoker(
        UpdateTestCaseResultRequest request) {
        return new AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>(request,
            CloudtestMeta.updateTestCaseResult, hcClient);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CompletableFuture<CreateApiTestSuiteByRepoFileResponse>
     */
    public CompletableFuture<CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileAsync(
        CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileAsyncInvoker(
        CreateApiTestSuiteByRepoFileRequest request) {
        return new AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>(request,
            CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request,
            CloudtestMeta.listEnvironments, hcClient);
    }

}
