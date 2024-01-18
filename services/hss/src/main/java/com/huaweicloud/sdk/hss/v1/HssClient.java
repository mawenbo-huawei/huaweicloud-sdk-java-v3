package com.huaweicloud.sdk.hss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hss.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.hss.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.hss.v1.model.ListHostsRequest;
import com.huaweicloud.sdk.hss.v1.model.ListHostsResponse;

public class HssClient {

    protected HcClient hcClient;

    public HssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssClient> newBuilder() {
        ClientBuilder<HssClient> clientBuilder = new ClientBuilder<>(HssClient::new);
        return clientBuilder;
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEvents);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEvents, hcClient);
    }

    /**
     * 查询弹性云服务器状态列表
     *
     * 查询弹性云服务器状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHosts);
    }

    /**
     * 查询弹性云服务器状态列表
     *
     * 查询弹性云服务器状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHosts, hcClient);
    }

}
