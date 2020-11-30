package com.huaweicloud.sdk.bms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.bms.v1.model.*;

public class BmsClient {
    protected HcClient hcClient;

    public BmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsClient> newBuilder() {
        return new ClientBuilder<>(BmsClient::new);
    }


    /**
     * 裸金属服务器挂载云硬盘
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     *
     * @param AttachBaremetalServerVolumeRequest 请求对象
     * @return AttachBaremetalServerVolumeResponse
     */
    public AttachBaremetalServerVolumeResponse attachBaremetalServerVolume(AttachBaremetalServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    /**
     * 重启裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     *
     * @param BatchRebootBaremetalServersRequest 请求对象
     * @return BatchRebootBaremetalServersResponse
     */
    public BatchRebootBaremetalServersResponse batchRebootBaremetalServers(BatchRebootBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    /**
     * 启动裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     *
     * @param BatchStartBaremetalServersRequest 请求对象
     * @return BatchStartBaremetalServersResponse
     */
    public BatchStartBaremetalServersResponse batchStartBaremetalServers(BatchStartBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    /**
     * 关闭裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     *
     * @param BatchStopBaremetalServersRequest 请求对象
     * @return BatchStopBaremetalServersResponse
     */
    public BatchStopBaremetalServersResponse batchStopBaremetalServers(BatchStopBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    /**
     * 修改裸金属服务器名称
     * 修改裸金属服务器名称
     *
     * @param ChangeBaremetalServerNameRequest 请求对象
     * @return ChangeBaremetalServerNameResponse
     */
    public ChangeBaremetalServerNameResponse changeBaremetalServerName(ChangeBaremetalServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    /**
     * 创建裸金属服务器
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     *
     * @param CreateBareMetalServersRequest 请求对象
     * @return CreateBareMetalServersResponse
     */
    public CreateBareMetalServersResponse createBareMetalServers(CreateBareMetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    /**
     * 裸金属服务器卸载云磁盘
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     *
     * @param DetachBaremetalServerVolumeRequest 请求对象
     * @return DetachBaremetalServerVolumeResponse
     */
    public DetachBaremetalServerVolumeResponse detachBaremetalServerVolume(DetachBaremetalServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    /**
     * 查询裸金属服务器详情
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     *
     * @param ListBareMetalServerDetailsRequest 请求对象
     * @return ListBareMetalServerDetailsResponse
     */
    public ListBareMetalServerDetailsResponse listBareMetalServerDetails(ListBareMetalServerDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    /**
     * 查询裸金属服务器详情列表
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     *
     * @param ListBareMetalServersRequest 请求对象
     * @return ListBareMetalServersResponse
     */
    public ListBareMetalServersResponse listBareMetalServers(ListBareMetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     *
     * @param ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return ListBaremetalFlavorDetailExtendsResponse
     */
    public ListBaremetalFlavorDetailExtendsResponse listBaremetalFlavorDetailExtends(ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    /**
     * 重装裸金属服务器操作系统
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     *
     * @param ReinstallBaremetalServerOsRequest 请求对象
     * @return ReinstallBaremetalServerOsResponse
     */
    public ReinstallBaremetalServerOsResponse reinstallBaremetalServerOs(ReinstallBaremetalServerOsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    /**
     * 一键重置裸金属服务器密码
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     *
     * @param ResetPwdOneClickRequest 请求对象
     * @return ResetPwdOneClickResponse
     */
    public ResetPwdOneClickResponse resetPwdOneClick(ResetPwdOneClickRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    /**
     * 查询裸金属服务器网卡信息
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     *
     * @param ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return ShowBaremetalServerInterfaceAttachmentsResponse
     */
    public ShowBaremetalServerInterfaceAttachmentsResponse showBaremetalServerInterfaceAttachments(ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     * 查询裸金属服务器挂载的磁盘信息
     *
     * @param ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return ShowBaremetalServerVolumeInfoResponse
     */
    public ShowBaremetalServerVolumeInfoResponse showBaremetalServerVolumeInfo(ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    /**
     * 查询是否支持一键重置密码
     * 查询是否支持一键重置密码
     *
     * @param ShowResetPwdRequest 请求对象
     * @return ShowResetPwdResponse
     */
    public ShowResetPwdResponse showResetPwd(ShowResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    /**
     * 查询租户配额
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     *
     * @param ShowTenantQuotaRequest 请求对象
     * @return ShowTenantQuotaResponse
     */
    public ShowTenantQuotaResponse showTenantQuota(ShowTenantQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    /**
     * Windows裸金属服务器获取密码
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     *
     * @param ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return ShowWindowsBaremetalServerPwdResponse
     */
    public ShowWindowsBaremetalServerPwdResponse showWindowsBaremetalServerPwd(ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    /**
     * 更新裸金属服务器元数据
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     *
     * @param UpdateBaremetalServerMetadataRequest 请求对象
     * @return UpdateBaremetalServerMetadataResponse
     */
    public UpdateBaremetalServerMetadataResponse updateBaremetalServerMetadata(UpdateBaremetalServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    /**
     * Windows裸金属服务器清除密码
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     *
     * @param WindowsBaremetalServerCleanPwdRequest 请求对象
     * @return WindowsBaremetalServerCleanPwdResponse
     */
    public WindowsBaremetalServerCleanPwdResponse windowsBaremetalServerCleanPwd(WindowsBaremetalServerCleanPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.windowsBaremetalServerCleanPwd);
    }

    /**
     * 查询指定API版本信息
     * 查询裸金属服务指定接口版本的信息
     *
     * @param ShowSpecifiedVersionRequest 请求对象
     * @return ShowSpecifiedVersionResponse
     */
    public ShowSpecifiedVersionResponse showSpecifiedVersion(ShowSpecifiedVersionRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    /**
     * 查询Job状态
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     *
     * @param ShowJobInfosRequest 请求对象
     * @return ShowJobInfosResponse
     */
    public ShowJobInfosResponse showJobInfos(ShowJobInfosRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showJobInfos);
    }

}