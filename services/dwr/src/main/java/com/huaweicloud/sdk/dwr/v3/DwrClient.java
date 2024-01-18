package com.huaweicloud.sdk.dwr.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dwr.v3.model.AcceptServiceContractRequest;
import com.huaweicloud.sdk.dwr.v3.model.AcceptServiceContractResponse;
import com.huaweicloud.sdk.dwr.v3.model.AsyncInvokeApiStartWorkflowRequest;
import com.huaweicloud.sdk.dwr.v3.model.AsyncInvokeApiStartWorkflowResponse;
import com.huaweicloud.sdk.dwr.v3.model.CheckWorkflowAuthenticationRequest;
import com.huaweicloud.sdk.dwr.v3.model.CheckWorkflowAuthenticationResponse;
import com.huaweicloud.sdk.dwr.v3.model.CreateMyActionTemplateRequest;
import com.huaweicloud.sdk.dwr.v3.model.CreateMyActionTemplateResponse;
import com.huaweicloud.sdk.dwr.v3.model.CreateWorkflowAuthenticationRequest;
import com.huaweicloud.sdk.dwr.v3.model.CreateWorkflowAuthenticationResponse;
import com.huaweicloud.sdk.dwr.v3.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.dwr.v3.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.dwr.v3.model.DeleteMyActionTemplateRequest;
import com.huaweicloud.sdk.dwr.v3.model.DeleteMyActionTemplateResponse;
import com.huaweicloud.sdk.dwr.v3.model.DeleteWorkflowRequest;
import com.huaweicloud.sdk.dwr.v3.model.DeleteWorkflowResponse;
import com.huaweicloud.sdk.dwr.v3.model.ListMyActionTemplateRequest;
import com.huaweicloud.sdk.dwr.v3.model.ListMyActionTemplateResponse;
import com.huaweicloud.sdk.dwr.v3.model.ListSystemTemplatesRequest;
import com.huaweicloud.sdk.dwr.v3.model.ListSystemTemplatesResponse;
import com.huaweicloud.sdk.dwr.v3.model.ListWorkflowInstanceRequest;
import com.huaweicloud.sdk.dwr.v3.model.ListWorkflowInstanceResponse;
import com.huaweicloud.sdk.dwr.v3.model.ListWorkflowsRequest;
import com.huaweicloud.sdk.dwr.v3.model.ListWorkflowsResponse;
import com.huaweicloud.sdk.dwr.v3.model.RestoreWorkflowExecutionRequest;
import com.huaweicloud.sdk.dwr.v3.model.RestoreWorkflowExecutionResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowPublicActionListRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowPublicActionListResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowPublicTemplateInfoRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowPublicTemplateInfoResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowServiceContractRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowServiceContractResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowSystemTemplateDetailRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowSystemTemplateDetailResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowThirdTemplateInfoRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowThirdTemplateInfoResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowWorkflowInfoRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowWorkflowInfoResponse;
import com.huaweicloud.sdk.dwr.v3.model.ShowWorkflowInstanceRequest;
import com.huaweicloud.sdk.dwr.v3.model.ShowWorkflowInstanceResponse;
import com.huaweicloud.sdk.dwr.v3.model.UpdateMyActionTemplateRequest;
import com.huaweicloud.sdk.dwr.v3.model.UpdateMyActionTemplateResponse;
import com.huaweicloud.sdk.dwr.v3.model.UpdateMyActionTemplateToDeprecatedRequest;
import com.huaweicloud.sdk.dwr.v3.model.UpdateMyActionTemplateToDeprecatedResponse;
import com.huaweicloud.sdk.dwr.v3.model.UpdateWorkflowRequest;
import com.huaweicloud.sdk.dwr.v3.model.UpdateWorkflowResponse;

public class DwrClient {

    protected HcClient hcClient;

    public DwrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwrClient> newBuilder() {
        ClientBuilder<DwrClient> clientBuilder = new ClientBuilder<>(DwrClient::new);
        return clientBuilder;
    }

    /**
     * 同意服务协议
     *
     * 本接口用于使用工作流时需要同意服务使用协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptServiceContractRequest 请求对象
     * @return AcceptServiceContractResponse
     */
    public AcceptServiceContractResponse acceptServiceContract(AcceptServiceContractRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.acceptServiceContract);
    }

    /**
     * 同意服务协议
     *
     * 本接口用于使用工作流时需要同意服务使用协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptServiceContractRequest 请求对象
     * @return SyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse>
     */
    public SyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse> acceptServiceContractInvoker(
        AcceptServiceContractRequest request) {
        return new SyncInvoker<>(request, DwrMeta.acceptServiceContract, hcClient);
    }

    /**
     * API异步启动工作流
     *
     * 本接口用于API方式异步启动已有工作流，产生工作流实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AsyncInvokeApiStartWorkflowRequest 请求对象
     * @return AsyncInvokeApiStartWorkflowResponse
     */
    public AsyncInvokeApiStartWorkflowResponse asyncInvokeApiStartWorkflow(AsyncInvokeApiStartWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.asyncInvokeApiStartWorkflow);
    }

    /**
     * API异步启动工作流
     *
     * 本接口用于API方式异步启动已有工作流，产生工作流实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AsyncInvokeApiStartWorkflowRequest 请求对象
     * @return SyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse>
     */
    public SyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse> asyncInvokeApiStartWorkflowInvoker(
        AsyncInvokeApiStartWorkflowRequest request) {
        return new SyncInvoker<>(request, DwrMeta.asyncInvokeApiStartWorkflow, hcClient);
    }

    /**
     * 查询授权
     *
     * 本接口用于查询授权，查询由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWorkflowAuthenticationRequest 请求对象
     * @return CheckWorkflowAuthenticationResponse
     */
    public CheckWorkflowAuthenticationResponse checkWorkflowAuthentication(CheckWorkflowAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.checkWorkflowAuthentication);
    }

    /**
     * 查询授权
     *
     * 本接口用于查询授权，查询由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWorkflowAuthenticationRequest 请求对象
     * @return SyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse>
     */
    public SyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse> checkWorkflowAuthenticationInvoker(
        CheckWorkflowAuthenticationRequest request) {
        return new SyncInvoker<>(request, DwrMeta.checkWorkflowAuthentication, hcClient);
    }

    /**
     * 创建第三方算子模板
     *
     * 创建第三方算子模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMyActionTemplateRequest 请求对象
     * @return CreateMyActionTemplateResponse
     */
    public CreateMyActionTemplateResponse createMyActionTemplate(CreateMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createMyActionTemplate);
    }

    /**
     * 创建第三方算子模板
     *
     * 创建第三方算子模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMyActionTemplateRequest 请求对象
     * @return SyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse>
     */
    public SyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse> createMyActionTemplateInvoker(
        CreateMyActionTemplateRequest request) {
        return new SyncInvoker<>(request, DwrMeta.createMyActionTemplate, hcClient);
    }

    /**
     * 开通授权
     *
     * 本接口用于开通授权，由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowAuthenticationRequest 请求对象
     * @return CreateWorkflowAuthenticationResponse
     */
    public CreateWorkflowAuthenticationResponse createWorkflowAuthentication(
        CreateWorkflowAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createWorkflowAuthentication);
    }

    /**
     * 开通授权
     *
     * 本接口用于开通授权，由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowAuthenticationRequest 请求对象
     * @return SyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse>
     */
    public SyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse> createWorkflowAuthenticationInvoker(
        CreateWorkflowAuthenticationRequest request) {
        return new SyncInvoker<>(request, DwrMeta.createWorkflowAuthentication, hcClient);
    }

    /**
     * 删除第三方算子模板
     *
     * 本接口用于标记删除提交的第三方算子模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMyActionTemplateRequest 请求对象
     * @return DeleteMyActionTemplateResponse
     */
    public DeleteMyActionTemplateResponse deleteMyActionTemplate(DeleteMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteMyActionTemplate);
    }

    /**
     * 删除第三方算子模板
     *
     * 本接口用于标记删除提交的第三方算子模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMyActionTemplateRequest 请求对象
     * @return SyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse>
     */
    public SyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse> deleteMyActionTemplateInvoker(
        DeleteMyActionTemplateRequest request) {
        return new SyncInvoker<>(request, DwrMeta.deleteMyActionTemplate, hcClient);
    }

    /**
     * 查询第三方算子列表
     *
     * 本接口用于查询提交注册过的三方算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMyActionTemplateRequest 请求对象
     * @return ListMyActionTemplateResponse
     */
    public ListMyActionTemplateResponse listMyActionTemplate(ListMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listMyActionTemplate);
    }

    /**
     * 查询第三方算子列表
     *
     * 本接口用于查询提交注册过的三方算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMyActionTemplateRequest 请求对象
     * @return SyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse>
     */
    public SyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse> listMyActionTemplateInvoker(
        ListMyActionTemplateRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listMyActionTemplate, hcClient);
    }

    /**
     * 查询华为云内置算子列表
     *
     * 本接口用于按名称查询系统内置算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemTemplatesRequest 请求对象
     * @return ListSystemTemplatesResponse
     */
    public ListSystemTemplatesResponse listSystemTemplates(ListSystemTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listSystemTemplates);
    }

    /**
     * 查询华为云内置算子列表
     *
     * 本接口用于按名称查询系统内置算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemTemplatesRequest 请求对象
     * @return SyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse>
     */
    public SyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse> listSystemTemplatesInvoker(
        ListSystemTemplatesRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listSystemTemplates, hcClient);
    }

    /**
     * 本接口用于查询用户工作流的实例列表
     *
     * 本接口用于查询用户工作流的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowInstanceRequest 请求对象
     * @return ListWorkflowInstanceResponse
     */
    public ListWorkflowInstanceResponse listWorkflowInstance(ListWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listWorkflowInstance);
    }

    /**
     * 本接口用于查询用户工作流的实例列表
     *
     * 本接口用于查询用户工作流的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse>
     */
    public SyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse> listWorkflowInstanceInvoker(
        ListWorkflowInstanceRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listWorkflowInstance, hcClient);
    }

    /**
     * 恢复一个执行失败状态的工作流实例
     *
     * 本接口用于恢复一个执行失败状态的工作流实例。恢复后，工作流实例将从上次失败的状态处继续执行，而工作流步骤中已经执行成功的状态不会再执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreWorkflowExecutionRequest 请求对象
     * @return RestoreWorkflowExecutionResponse
     */
    public RestoreWorkflowExecutionResponse restoreWorkflowExecution(RestoreWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.restoreWorkflowExecution);
    }

    /**
     * 恢复一个执行失败状态的工作流实例
     *
     * 本接口用于恢复一个执行失败状态的工作流实例。恢复后，工作流实例将从上次失败的状态处继续执行，而工作流步骤中已经执行成功的状态不会再执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse>
     */
    public SyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse> restoreWorkflowExecutionInvoker(
        RestoreWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, DwrMeta.restoreWorkflowExecution, hcClient);
    }

    /**
     * 查询已发布算子列表
     *
     * 本接口用于查询开放的算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicActionListRequest 请求对象
     * @return ShowPublicActionListResponse
     */
    public ShowPublicActionListResponse showPublicActionList(ShowPublicActionListRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showPublicActionList);
    }

    /**
     * 查询已发布算子列表
     *
     * 本接口用于查询开放的算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicActionListRequest 请求对象
     * @return SyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse>
     */
    public SyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse> showPublicActionListInvoker(
        ShowPublicActionListRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showPublicActionList, hcClient);
    }

    /**
     * 查询已发布算子模板详情
     *
     * 本接口用于按名称查询开放的算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicTemplateInfoRequest 请求对象
     * @return ShowPublicTemplateInfoResponse
     */
    public ShowPublicTemplateInfoResponse showPublicTemplateInfo(ShowPublicTemplateInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showPublicTemplateInfo);
    }

    /**
     * 查询已发布算子模板详情
     *
     * 本接口用于按名称查询开放的算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicTemplateInfoRequest 请求对象
     * @return SyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse>
     */
    public SyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse> showPublicTemplateInfoInvoker(
        ShowPublicTemplateInfoRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showPublicTemplateInfo, hcClient);
    }

    /**
     * 查询服务协议
     *
     * 本接口用于查询使用工作流时同意的服务协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceContractRequest 请求对象
     * @return ShowServiceContractResponse
     */
    public ShowServiceContractResponse showServiceContract(ShowServiceContractRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showServiceContract);
    }

    /**
     * 查询服务协议
     *
     * 本接口用于查询使用工作流时同意的服务协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceContractRequest 请求对象
     * @return SyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse>
     */
    public SyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse> showServiceContractInvoker(
        ShowServiceContractRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showServiceContract, hcClient);
    }

    /**
     * 查询华为云内置算子模板信息
     *
     * 本接口用于按名称查询系统内置算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemTemplateDetailRequest 请求对象
     * @return ShowSystemTemplateDetailResponse
     */
    public ShowSystemTemplateDetailResponse showSystemTemplateDetail(ShowSystemTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showSystemTemplateDetail);
    }

    /**
     * 查询华为云内置算子模板信息
     *
     * 本接口用于按名称查询系统内置算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse>
     */
    public SyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse> showSystemTemplateDetailInvoker(
        ShowSystemTemplateDetailRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showSystemTemplateDetail, hcClient);
    }

    /**
     * 查询公共Action模板详情
     *
     * 本接口用于按名称查询第三方模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowThirdTemplateInfoRequest 请求对象
     * @return ShowThirdTemplateInfoResponse
     */
    public ShowThirdTemplateInfoResponse showThirdTemplateInfo(ShowThirdTemplateInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showThirdTemplateInfo);
    }

    /**
     * 查询公共Action模板详情
     *
     * 本接口用于按名称查询第三方模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowThirdTemplateInfoRequest 请求对象
     * @return SyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse>
     */
    public SyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse> showThirdTemplateInfoInvoker(
        ShowThirdTemplateInfoRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showThirdTemplateInfo, hcClient);
    }

    /**
     * 本接口用于查询指定工作流实例详细
     *
     * 本接口用于查询指定工作流实例详细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowInstanceRequest 请求对象
     * @return ShowWorkflowInstanceResponse
     */
    public ShowWorkflowInstanceResponse showWorkflowInstance(ShowWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showWorkflowInstance);
    }

    /**
     * 本接口用于查询指定工作流实例详细
     *
     * 本接口用于查询指定工作流实例详细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse>
     */
    public SyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse> showWorkflowInstanceInvoker(
        ShowWorkflowInstanceRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showWorkflowInstance, hcClient);
    }

    /**
     * 更新第三方算子模板
     *
     * 本接口用于修改第三方算子和将三方算子提交审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyActionTemplateRequest 请求对象
     * @return UpdateMyActionTemplateResponse
     */
    public UpdateMyActionTemplateResponse updateMyActionTemplate(UpdateMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.updateMyActionTemplate);
    }

    /**
     * 更新第三方算子模板
     *
     * 本接口用于修改第三方算子和将三方算子提交审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyActionTemplateRequest 请求对象
     * @return SyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse>
     */
    public SyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse> updateMyActionTemplateInvoker(
        UpdateMyActionTemplateRequest request) {
        return new SyncInvoker<>(request, DwrMeta.updateMyActionTemplate, hcClient);
    }

    /**
     * 禁用第三方算子模板
     *
     * 本接口用于申请禁用第三方算子。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyActionTemplateToDeprecatedRequest 请求对象
     * @return UpdateMyActionTemplateToDeprecatedResponse
     */
    public UpdateMyActionTemplateToDeprecatedResponse updateMyActionTemplateToDeprecated(
        UpdateMyActionTemplateToDeprecatedRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.updateMyActionTemplateToDeprecated);
    }

    /**
     * 禁用第三方算子模板
     *
     * 本接口用于申请禁用第三方算子。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyActionTemplateToDeprecatedRequest 请求对象
     * @return SyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse>
     */
    public SyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse> updateMyActionTemplateToDeprecatedInvoker(
        UpdateMyActionTemplateToDeprecatedRequest request) {
        return new SyncInvoker<>(request, DwrMeta.updateMyActionTemplateToDeprecated, hcClient);
    }

    /**
     * 创建工作流
     *
     * 本接口用于通过Body体直接创建工作流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createWorkflow);
    }

    /**
     * 创建工作流
     *
     * 本接口用于通过Body体直接创建工作流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<>(request, DwrMeta.createWorkflow, hcClient);
    }

    /**
     * 删除工作流
     *
     * 本接口用于删除工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteWorkflow);
    }

    /**
     * 删除工作流
     *
     * 本接口用于删除工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowInvoker(
        DeleteWorkflowRequest request) {
        return new SyncInvoker<>(request, DwrMeta.deleteWorkflow, hcClient);
    }

    /**
     * 查询工作流列表
     *
     * 本接口用于查询工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listWorkflows);
    }

    /**
     * 查询工作流列表
     *
     * 本接口用于查询工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsInvoker(ListWorkflowsRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listWorkflows, hcClient);
    }

    /**
     * 查询工作流信息
     *
     * 本接口用于根据工作流名称查询工作流详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowInfoRequest 请求对象
     * @return ShowWorkflowInfoResponse
     */
    public ShowWorkflowInfoResponse showWorkflowInfo(ShowWorkflowInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showWorkflowInfo);
    }

    /**
     * 查询工作流信息
     *
     * 本接口用于根据工作流名称查询工作流详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowInfoRequest 请求对象
     * @return SyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse>
     */
    public SyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse> showWorkflowInfoInvoker(
        ShowWorkflowInfoRequest request) {
        return new SyncInvoker<>(request, DwrMeta.showWorkflowInfo, hcClient);
    }

    /**
     * 更新工作流
     *
     * Update Workflow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.updateWorkflow);
    }

    /**
     * 更新工作流
     *
     * Update Workflow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowInvoker(
        UpdateWorkflowRequest request) {
        return new SyncInvoker<>(request, DwrMeta.updateWorkflow, hcClient);
    }

}
