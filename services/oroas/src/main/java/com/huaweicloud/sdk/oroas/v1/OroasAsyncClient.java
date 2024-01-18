package com.huaweicloud.sdk.oroas.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.oroas.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.oroas.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.oroas.v1.model.ListTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.ListTaskResponse;
import com.huaweicloud.sdk.oroas.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.ShowTaskResponse;

import java.util.concurrent.CompletableFuture;

public class OroasAsyncClient {

    protected HcClient hcClient;

    public OroasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OroasAsyncClient> newBuilder() {
        ClientBuilder<OroasAsyncClient> clientBuilder = new ClientBuilder<>(OroasAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OroasMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<>(request, OroasMeta.createTask, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OroasMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<>(request, OroasMeta.deleteTask, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskRequest 请求对象
     * @return CompletableFuture<ListTaskResponse>
     */
    public CompletableFuture<ListTaskResponse> listTaskAsync(ListTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OroasMeta.listTask);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskRequest 请求对象
     * @return AsyncInvoker<ListTaskRequest, ListTaskResponse>
     */
    public AsyncInvoker<ListTaskRequest, ListTaskResponse> listTaskAsyncInvoker(ListTaskRequest request) {
        return new AsyncInvoker<>(request, OroasMeta.listTask, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OroasMeta.showTask);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<>(request, OroasMeta.showTask, hcClient);
    }

}
