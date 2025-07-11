package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群列表对象。 **取值范围**： 不涉及。
 */
public class ClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<Endpoints> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<Nodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_node")

    private Integer numberOfNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_event")

    private Integer recentEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_endpoints")

    private List<PublicEndpoints> publicEndpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private Map<String, String> actionProgress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_status")

    private String subStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private FailedReason failedReasons;

    public ClusterInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 集群ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 集群名称。 **取值范围**： 同一个账号ID下唯一。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 集群状态，字符串枚举。 **取值范围**： - CREATING：创建中 - ACTIVE：可用 - FAILED：不可用 - CREATE_FAILED：创建失败 - DELETING：删除中 - DELETE_FAILED：删除失败 - FROZEN：普通冻结 - POLICE_FROZEN：公安冻结
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 数据仓库集群版本。 **取值范围**： 小数点分割的3~4段字符串，如9.1.0.200，每一段数字越大版本越新。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterInfo withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * **参数解释**： 集群上次修改时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ **取值范围**： 大于等于集群创建时间的ISO8601格式时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ClusterInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**： 集群创建时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ **取值范围**： ISO8601格式的时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ClusterInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 集群服务端口，创建集群时如未指定则默认8000。 **取值范围**： 8000~30000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ClusterInfo withEndpoints(List<Endpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ClusterInfo addEndpointsItem(Endpoints endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ClusterInfo withEndpoints(Consumer<List<Endpoints>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**： 集群的内网连接信息。 **取值范围**： 不涉及。
     * @return endpoints
     */
    public List<Endpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public ClusterInfo withNodes(List<Nodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ClusterInfo addNodesItem(Nodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ClusterInfo withNodes(Consumer<List<Nodes>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**： 集群实例。 **取值范围**： 列表大小与集群节点数量字段number_of_node相同。
     * @return nodes
     */
    public List<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<Nodes> nodes) {
        this.nodes = nodes;
    }

    public ClusterInfo withTags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }

    public ClusterInfo addTagsItem(Tags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ClusterInfo withTags(Consumer<List<Tags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 集群标签。 **取值范围**： 默认null。
     * @return tags
     */
    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public ClusterInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 管理员用户名。 **取值范围**： 默认dbadmin。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ClusterInfo withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    /**
     * **参数解释**： 节点数量。创建集群时指定。 **取值范围**： 不涉及。
     * @return numberOfNode
     */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    public ClusterInfo withRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
        return this;
    }

    /**
     * **参数解释**： 事件数。仅记录用户操作且对集群产生影响的事件，部分按钮开闭类操作不记入集群事件数。 **取值范围**： 不涉及。
     * @return recentEvent
     */
    public Integer getRecentEvent() {
        return recentEvent;
    }

    public void setRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
    }

    public ClusterInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**： 可用区。 **取值范围**： 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ClusterInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID，对集群指定企业项目。如果未指定，则使用默认企业项目“default”的ID，即0。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * **参数解释**： 集群规格ID。 **取值范围**： 不涉及。
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ClusterInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 虚拟私有云ID。 **取值范围**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ClusterInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 子网ID。 **取值范围**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ClusterInfo withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public ClusterInfo withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterInfo withPublicEndpoints(List<PublicEndpoints> publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
        return this;
    }

    public ClusterInfo addPublicEndpointsItem(PublicEndpoints publicEndpointsItem) {
        if (this.publicEndpoints == null) {
            this.publicEndpoints = new ArrayList<>();
        }
        this.publicEndpoints.add(publicEndpointsItem);
        return this;
    }

    public ClusterInfo withPublicEndpoints(Consumer<List<PublicEndpoints>> publicEndpointsSetter) {
        if (this.publicEndpoints == null) {
            this.publicEndpoints = new ArrayList<>();
        }
        publicEndpointsSetter.accept(this.publicEndpoints);
        return this;
    }

    /**
     * **参数解释**： 公网IP信息，如果未指定，则默认不支持公网连接。 **取值范围**： 不涉及。
     * @return publicEndpoints
     */
    public List<PublicEndpoints> getPublicEndpoints() {
        return publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoints> publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
    }

    public ClusterInfo withActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ClusterInfo putActionProgressItem(String key, String actionProgressItem) {
        if (this.actionProgress == null) {
            this.actionProgress = new HashMap<>();
        }
        this.actionProgress.put(key, actionProgressItem);
        return this;
    }

    public ClusterInfo withActionProgress(Consumer<Map<String, String>> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new HashMap<>();
        }
        actionProgressSetter.accept(this.actionProgress);
        return this;
    }

    /**
     * **参数解释**： 任务信息，由key、value组成。key值为正在进行的任务，value值为正在进行任务的进度。 **取值范围**： key值的有效值包括但不限于以下这些： - CREATING：创建中 - RESTORING：恢复中 - SNAPSHOTTING：快照中 - GROWING：扩容中 - REBOOTING：重启中 - SETTING_CONFIGURATION：安全设置配置中 - CONFIGURING_EXT_DATASOURCE：MRS连接配置中 - ADD_CN_ING：增加CN中 - DEL_CN_ING：删除CN中 - REDISTRIBUTING：重分布中 - ELB_BINDING：弹性负载均衡绑定中 - ELB_UNBINDING：弹性负载均衡解绑中 - ELB_SWITCHING：弹性负载均衡切换中 - NETWORK_CONFIGURING：网络配置中 - DISK_EXPANDING：磁盘扩容中 - ACTIVE_STANDY_SWITCHOVER：主备恢复中 - CLUSTER_SHRINKING：缩容中 - SHRINK_CHECKING：缩容检测中 - FLAVOR_RESIZING：规格变更中 - MANAGE_IP_BINDING：登录开通中 - FINE_GRAINED_RESTORING：细粒度恢复中 - DR_RECOVERING：容灾恢复中 - REPAIRING：修复中
     * @return actionProgress
     */
    public Map<String, String> getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ClusterInfo withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * **参数解释**： “可用”集群状态的子状态。 **取值范围**： 有效值包括： - NORMAL：正常 - READONLY：只读 - REDISTRIBUTING：重分布中 - REDISTRIBUTION-FAILURE：重分布失败 - UNBALANCED：非均衡 - UNBALANCED | READONLY：非均衡，只读 - DEGRADED：节点故障 - DEGRADED | READONLY：节点故障，只读 - DEGRADED | UNBALANCED：节点故障，非均衡 - UNBALANCED | REDISTRIBUTING：非均衡，重分布中 - UNBALANCED | REDISTRIBUTION-FAILURE：非均衡，重分布失败 - READONLY | REDISTRIBUTION-FAILURE：只读，重分布失败 - UNBALANCED | READONLY | REDISTRIBUTION-FAILURE：非均衡，只读，重分布失败 - DEGRADED | REDISTRIBUTION-FAILURE：节点故障，重分布失败 - DEGRADED | UNBALANCED | REDISTRIBUTION-FAILURE：节点故障，非均衡，只读，重分布失败 - DEGRADED | UNBALANCED | READONLY | REDISTRIBUTION-FAILURE：节点故障，非均衡，只读，重分布失败 - DEGRADED | UNBALANCED | READONLY：节点故障，非均衡，只读
     * @return subStatus
     */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public ClusterInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * **参数解释**： 集群管理任务，表示当前正在进行的任务或已执行的任务的结果。 **取值范围**： 有效值包括但不限于以下值： - UNFREEZING：解冻中 - FREEZING：冻结中 - RESTORING：恢复中 - SNAPSHOTTING：快照中 - GROWING：扩容中 - REBOOTING：重启中 - SETTING_CONFIGURATION：安全设置配置中 - CONFIGURING_EXT_DATASOURCE：MRS连接配置中 - DELETING_EXT_DATASOURCE：删除MRS连接 - REBOOT_FAILURE：重启失败 - RESIZE_FAILURE：扩容失败 - ADD_CN_ING：增加CN中 - DEL_CN_ING：删除CN中 - CREATING_NODE：添加节点 - CREATE_NODE_FAILED：添加节点失败 - DELETING_NODE：删除节点 - DELETE_NODE_FAILED：删除节点失败 - REDISTRIBUTING：重分布中 - REDISTRIBUTE_FAILURE：重分布失败 - WAITING_REDISTRIBUTION：待重分布 - REDISTRIBUTION_PAUSED：重分布暂停 - ELB_BINDING：弹性负载均衡绑定中 - ELB_BIND_FAILED：弹性负载均衡绑定失败 - ELB_UNBINDING：弹性负载均衡解绑中 - ELB_UNBIND_FAILED：弹性负载均衡解绑失败 - ELB_SWITCHING：弹性负载均衡切换中 - ELB_SWITCHING_FAILED：弹性负载均衡切换失败 - NETWORK_CONFIGURING：网络配置中 - NETWORK_CONFIG_FAILED：网络配置失败 - DISK_EXPAND_FAILED：磁盘扩容失败 - DISK_EXPANDING：磁盘扩容中 - ACTIVE_STANDY_SWITCHOVER：主备恢复中 - ACTIVE_STANDY_SWITCHOVER_FAILURE：主备恢复失败 - CLUSTER_SHRINK_FAILED：缩容失败 - CLUSTER_SHRINKING：缩容中 - SHRINK_CHECK_FAILED：缩容检测失败 - SHRINK_CHECKING：缩容检测中 - FLAVOR_RESIZING_FAILED：规格变更失败 - FLAVOR_RESIZING：规格变更中 - MANAGE_IP_BIND_FAILED：登录开通失败 - MANAGE_IP_BINDING：登录开通中 - ORDER_PENDING：订单待支付 - FINE_GRAINED_RESTORING：细粒度恢复中 - DR_RECOVERING：容灾恢复中
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ClusterInfo withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**： 安全组ID。 **取值范围**： 不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ClusterInfo withFailedReasons(FailedReason failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public ClusterInfo withFailedReasons(Consumer<FailedReason> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new FailedReason();
            failedReasonsSetter.accept(this.failedReasons);
        }

        return this;
    }

    /**
     * Get failedReasons
     * @return failedReasons
     */
    public FailedReason getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(FailedReason failedReasons) {
        this.failedReasons = failedReasons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInfo that = (ClusterInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.version, that.version)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.created, that.created)
            && Objects.equals(this.port, that.port) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.numberOfNode, that.numberOfNode)
            && Objects.equals(this.recentEvent, that.recentEvent)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.publicEndpoints, that.publicEndpoints)
            && Objects.equals(this.actionProgress, that.actionProgress)
            && Objects.equals(this.subStatus, that.subStatus) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.failedReasons, that.failedReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            version,
            updated,
            created,
            port,
            endpoints,
            nodes,
            tags,
            userName,
            numberOfNode,
            recentEvent,
            availabilityZone,
            enterpriseProjectId,
            nodeType,
            vpcId,
            subnetId,
            publicIp,
            publicEndpoints,
            actionProgress,
            subStatus,
            taskStatus,
            securityGroupId,
            failedReasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
        sb.append("    recentEvent: ").append(toIndentedString(recentEvent)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicEndpoints: ").append(toIndentedString(publicEndpoints)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
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
