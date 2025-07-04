package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseVpnConnection
 */
public class ResponseVpnConnection {

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
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_ip")

    private String vgwIp;

    /**
     * 连接模式 允许范围[POLICY, STATIC, BGP] POLICY: 策略模式 STATIC: 静态路由模式 BGP: bgp路由模式
     */
    public static final class StyleEnum {

        /**
         * Enum POLICY for value: "POLICY"
         */
        public static final StyleEnum POLICY = new StyleEnum("POLICY");

        /**
         * Enum STATIC for value: "STATIC"
         */
        public static final StyleEnum STATIC = new StyleEnum("STATIC");

        /**
         * Enum BGP for value: "BGP"
         */
        public static final StyleEnum BGP = new StyleEnum("BGP");

        private static final Map<String, StyleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StyleEnum> createStaticFields() {
            Map<String, StyleEnum> map = new HashMap<>();
            map.put("POLICY", POLICY);
            map.put("STATIC", STATIC);
            map.put("BGP", BGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StyleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StyleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StyleEnum(value));
        }

        public static StyleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StyleEnum) {
                return this.value.equals(((StyleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style")

    private StyleEnum style;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cgw_id")

    private String cgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_subnets")

    private List<String> peerSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_local_address")

    private String tunnelLocalAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_peer_address")

    private String tunnelPeerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_nqa")

    private Boolean enableNqa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hub")

    private Boolean enableHub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rules")

    private List<PolicyRule> policyRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ikepolicy")

    private IkePolicy ikepolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipsecpolicy")

    private IpsecPolicy ipsecpolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_monitor_id")

    private String connectionMonitorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_role")

    private String haRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_subnets_v6")

    private List<String> peerSubnetsV6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rules_v6")

    private List<PolicyRule> policyRulesV6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_peer")

    private BgpPeer bgpPeer;

    public ResponseVpnConnection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPN连接ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseVpnConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPN连接名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponseVpnConnection withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * VPN连接状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResponseVpnConnection withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * VPN网关ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public ResponseVpnConnection withVgwIp(String vgwIp) {
        this.vgwIp = vgwIp;
        return this;
    }

    /**
     * VGW IP
     * @return vgwIp
     */
    public String getVgwIp() {
        return vgwIp;
    }

    public void setVgwIp(String vgwIp) {
        this.vgwIp = vgwIp;
    }

    public ResponseVpnConnection withStyle(StyleEnum style) {
        this.style = style;
        return this;
    }

    /**
     * 连接模式 允许范围[POLICY, STATIC, BGP] POLICY: 策略模式 STATIC: 静态路由模式 BGP: bgp路由模式
     * @return style
     */
    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(StyleEnum style) {
        this.style = style;
    }

    public ResponseVpnConnection withCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

    /**
     * 对端网关ID
     * @return cgwId
     */
    public String getCgwId() {
        return cgwId;
    }

    public void setCgwId(String cgwId) {
        this.cgwId = cgwId;
    }

    public ResponseVpnConnection withPeerSubnets(List<String> peerSubnets) {
        this.peerSubnets = peerSubnets;
        return this;
    }

    public ResponseVpnConnection addPeerSubnetsItem(String peerSubnetsItem) {
        if (this.peerSubnets == null) {
            this.peerSubnets = new ArrayList<>();
        }
        this.peerSubnets.add(peerSubnetsItem);
        return this;
    }

    public ResponseVpnConnection withPeerSubnets(Consumer<List<String>> peerSubnetsSetter) {
        if (this.peerSubnets == null) {
            this.peerSubnets = new ArrayList<>();
        }
        peerSubnetsSetter.accept(this.peerSubnets);
        return this;
    }

    /**
     * 对端网段
     * @return peerSubnets
     */
    public List<String> getPeerSubnets() {
        return peerSubnets;
    }

    public void setPeerSubnets(List<String> peerSubnets) {
        this.peerSubnets = peerSubnets;
    }

    public ResponseVpnConnection withTunnelLocalAddress(String tunnelLocalAddress) {
        this.tunnelLocalAddress = tunnelLocalAddress;
        return this;
    }

    /**
     * 本端隧道口地址
     * @return tunnelLocalAddress
     */
    public String getTunnelLocalAddress() {
        return tunnelLocalAddress;
    }

    public void setTunnelLocalAddress(String tunnelLocalAddress) {
        this.tunnelLocalAddress = tunnelLocalAddress;
    }

    public ResponseVpnConnection withTunnelPeerAddress(String tunnelPeerAddress) {
        this.tunnelPeerAddress = tunnelPeerAddress;
        return this;
    }

    /**
     * 对端隧道口地址
     * @return tunnelPeerAddress
     */
    public String getTunnelPeerAddress() {
        return tunnelPeerAddress;
    }

    public void setTunnelPeerAddress(String tunnelPeerAddress) {
        this.tunnelPeerAddress = tunnelPeerAddress;
    }

    public ResponseVpnConnection withEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
        return this;
    }

    /**
     * 开启NQA检测
     * @return enableNqa
     */
    public Boolean getEnableNqa() {
        return enableNqa;
    }

    public void setEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
    }

    public ResponseVpnConnection withEnableHub(Boolean enableHub) {
        this.enableHub = enableHub;
        return this;
    }

    /**
     * 开启分支互联
     * @return enableHub
     */
    public Boolean getEnableHub() {
        return enableHub;
    }

    public void setEnableHub(Boolean enableHub) {
        this.enableHub = enableHub;
    }

    public ResponseVpnConnection withPolicyRules(List<PolicyRule> policyRules) {
        this.policyRules = policyRules;
        return this;
    }

    public ResponseVpnConnection addPolicyRulesItem(PolicyRule policyRulesItem) {
        if (this.policyRules == null) {
            this.policyRules = new ArrayList<>();
        }
        this.policyRules.add(policyRulesItem);
        return this;
    }

    public ResponseVpnConnection withPolicyRules(Consumer<List<PolicyRule>> policyRulesSetter) {
        if (this.policyRules == null) {
            this.policyRules = new ArrayList<>();
        }
        policyRulesSetter.accept(this.policyRules);
        return this;
    }

    /**
     * 策略模式的策略规则组
     * @return policyRules
     */
    public List<PolicyRule> getPolicyRules() {
        return policyRules;
    }

    public void setPolicyRules(List<PolicyRule> policyRules) {
        this.policyRules = policyRules;
    }

    public ResponseVpnConnection withIkepolicy(IkePolicy ikepolicy) {
        this.ikepolicy = ikepolicy;
        return this;
    }

    public ResponseVpnConnection withIkepolicy(Consumer<IkePolicy> ikepolicySetter) {
        if (this.ikepolicy == null) {
            this.ikepolicy = new IkePolicy();
            ikepolicySetter.accept(this.ikepolicy);
        }

        return this;
    }

    /**
     * Get ikepolicy
     * @return ikepolicy
     */
    public IkePolicy getIkepolicy() {
        return ikepolicy;
    }

    public void setIkepolicy(IkePolicy ikepolicy) {
        this.ikepolicy = ikepolicy;
    }

    public ResponseVpnConnection withIpsecpolicy(IpsecPolicy ipsecpolicy) {
        this.ipsecpolicy = ipsecpolicy;
        return this;
    }

    public ResponseVpnConnection withIpsecpolicy(Consumer<IpsecPolicy> ipsecpolicySetter) {
        if (this.ipsecpolicy == null) {
            this.ipsecpolicy = new IpsecPolicy();
            ipsecpolicySetter.accept(this.ipsecpolicy);
        }

        return this;
    }

    /**
     * Get ipsecpolicy
     * @return ipsecpolicy
     */
    public IpsecPolicy getIpsecpolicy() {
        return ipsecpolicy;
    }

    public void setIpsecpolicy(IpsecPolicy ipsecpolicy) {
        this.ipsecpolicy = ipsecpolicy;
    }

    public ResponseVpnConnection withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ResponseVpnConnection withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ResponseVpnConnection withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ResponseVpnConnection withConnectionMonitorId(String connectionMonitorId) {
        this.connectionMonitorId = connectionMonitorId;
        return this;
    }

    /**
     * 连接监控ID
     * @return connectionMonitorId
     */
    public String getConnectionMonitorId() {
        return connectionMonitorId;
    }

    public void setConnectionMonitorId(String connectionMonitorId) {
        this.connectionMonitorId = connectionMonitorId;
    }

    public ResponseVpnConnection withHaRole(String haRole) {
        this.haRole = haRole;
        return this;
    }

    /**
     * 连接的HA角色
     * @return haRole
     */
    public String getHaRole() {
        return haRole;
    }

    public void setHaRole(String haRole) {
        this.haRole = haRole;
    }

    public ResponseVpnConnection withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ResponseVpnConnection addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResponseVpnConnection withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<VpnResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<VpnResourceTag> tags) {
        this.tags = tags;
    }

    public ResponseVpnConnection withPeerSubnetsV6(List<String> peerSubnetsV6) {
        this.peerSubnetsV6 = peerSubnetsV6;
        return this;
    }

    public ResponseVpnConnection addPeerSubnetsV6Item(String peerSubnetsV6Item) {
        if (this.peerSubnetsV6 == null) {
            this.peerSubnetsV6 = new ArrayList<>();
        }
        this.peerSubnetsV6.add(peerSubnetsV6Item);
        return this;
    }

    public ResponseVpnConnection withPeerSubnetsV6(Consumer<List<String>> peerSubnetsV6Setter) {
        if (this.peerSubnetsV6 == null) {
            this.peerSubnetsV6 = new ArrayList<>();
        }
        peerSubnetsV6Setter.accept(this.peerSubnetsV6);
        return this;
    }

    /**
     * 使能ipv6的对端子网
     * @return peerSubnetsV6
     */
    public List<String> getPeerSubnetsV6() {
        return peerSubnetsV6;
    }

    public void setPeerSubnetsV6(List<String> peerSubnetsV6) {
        this.peerSubnetsV6 = peerSubnetsV6;
    }

    public ResponseVpnConnection withPolicyRulesV6(List<PolicyRule> policyRulesV6) {
        this.policyRulesV6 = policyRulesV6;
        return this;
    }

    public ResponseVpnConnection addPolicyRulesV6Item(PolicyRule policyRulesV6Item) {
        if (this.policyRulesV6 == null) {
            this.policyRulesV6 = new ArrayList<>();
        }
        this.policyRulesV6.add(policyRulesV6Item);
        return this;
    }

    public ResponseVpnConnection withPolicyRulesV6(Consumer<List<PolicyRule>> policyRulesV6Setter) {
        if (this.policyRulesV6 == null) {
            this.policyRulesV6 = new ArrayList<>();
        }
        policyRulesV6Setter.accept(this.policyRulesV6);
        return this;
    }

    /**
     * 策略模式的ipv6策略规则组
     * @return policyRulesV6
     */
    public List<PolicyRule> getPolicyRulesV6() {
        return policyRulesV6;
    }

    public void setPolicyRulesV6(List<PolicyRule> policyRulesV6) {
        this.policyRulesV6 = policyRulesV6;
    }

    public ResponseVpnConnection withBgpPeer(BgpPeer bgpPeer) {
        this.bgpPeer = bgpPeer;
        return this;
    }

    public ResponseVpnConnection withBgpPeer(Consumer<BgpPeer> bgpPeerSetter) {
        if (this.bgpPeer == null) {
            this.bgpPeer = new BgpPeer();
            bgpPeerSetter.accept(this.bgpPeer);
        }

        return this;
    }

    /**
     * Get bgpPeer
     * @return bgpPeer
     */
    public BgpPeer getBgpPeer() {
        return bgpPeer;
    }

    public void setBgpPeer(BgpPeer bgpPeer) {
        this.bgpPeer = bgpPeer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseVpnConnection that = (ResponseVpnConnection) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.vgwId, that.vgwId)
            && Objects.equals(this.vgwIp, that.vgwIp) && Objects.equals(this.style, that.style)
            && Objects.equals(this.cgwId, that.cgwId) && Objects.equals(this.peerSubnets, that.peerSubnets)
            && Objects.equals(this.tunnelLocalAddress, that.tunnelLocalAddress)
            && Objects.equals(this.tunnelPeerAddress, that.tunnelPeerAddress)
            && Objects.equals(this.enableNqa, that.enableNqa) && Objects.equals(this.enableHub, that.enableHub)
            && Objects.equals(this.policyRules, that.policyRules) && Objects.equals(this.ikepolicy, that.ikepolicy)
            && Objects.equals(this.ipsecpolicy, that.ipsecpolicy) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.connectionMonitorId, that.connectionMonitorId)
            && Objects.equals(this.haRole, that.haRole) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.peerSubnetsV6, that.peerSubnetsV6)
            && Objects.equals(this.policyRulesV6, that.policyRulesV6) && Objects.equals(this.bgpPeer, that.bgpPeer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            vgwId,
            vgwIp,
            style,
            cgwId,
            peerSubnets,
            tunnelLocalAddress,
            tunnelPeerAddress,
            enableNqa,
            enableHub,
            policyRules,
            ikepolicy,
            ipsecpolicy,
            createdAt,
            updatedAt,
            enterpriseProjectId,
            connectionMonitorId,
            haRole,
            tags,
            peerSubnetsV6,
            policyRulesV6,
            bgpPeer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseVpnConnection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    vgwIp: ").append(toIndentedString(vgwIp)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    cgwId: ").append(toIndentedString(cgwId)).append("\n");
        sb.append("    peerSubnets: ").append(toIndentedString(peerSubnets)).append("\n");
        sb.append("    tunnelLocalAddress: ").append(toIndentedString(tunnelLocalAddress)).append("\n");
        sb.append("    tunnelPeerAddress: ").append(toIndentedString(tunnelPeerAddress)).append("\n");
        sb.append("    enableNqa: ").append(toIndentedString(enableNqa)).append("\n");
        sb.append("    enableHub: ").append(toIndentedString(enableHub)).append("\n");
        sb.append("    policyRules: ").append(toIndentedString(policyRules)).append("\n");
        sb.append("    ikepolicy: ").append(toIndentedString(ikepolicy)).append("\n");
        sb.append("    ipsecpolicy: ").append(toIndentedString(ipsecpolicy)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    connectionMonitorId: ").append(toIndentedString(connectionMonitorId)).append("\n");
        sb.append("    haRole: ").append(toIndentedString(haRole)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    peerSubnetsV6: ").append(toIndentedString(peerSubnetsV6)).append("\n");
        sb.append("    policyRulesV6: ").append(toIndentedString(policyRulesV6)).append("\n");
        sb.append("    bgpPeer: ").append(toIndentedString(bgpPeer)).append("\n");
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
