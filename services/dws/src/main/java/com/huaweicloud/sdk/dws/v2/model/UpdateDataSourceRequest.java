package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDataSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_data_source_id")

    private String extDataSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ReconfigureExtDataSourceActionReq body;

    public UpdateDataSourceRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： 36位UUID。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateDataSourceRequest withExtDataSourceId(String extDataSourceId) {
        this.extDataSourceId = extDataSourceId;
        return this;
    }

    /**
     * **参数解释**： 数据源ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return extDataSourceId
     */
    public String getExtDataSourceId() {
        return extDataSourceId;
    }

    public void setExtDataSourceId(String extDataSourceId) {
        this.extDataSourceId = extDataSourceId;
    }

    public UpdateDataSourceRequest withBody(ReconfigureExtDataSourceActionReq body) {
        this.body = body;
        return this;
    }

    public UpdateDataSourceRequest withBody(Consumer<ReconfigureExtDataSourceActionReq> bodySetter) {
        if (this.body == null) {
            this.body = new ReconfigureExtDataSourceActionReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ReconfigureExtDataSourceActionReq getBody() {
        return body;
    }

    public void setBody(ReconfigureExtDataSourceActionReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDataSourceRequest that = (UpdateDataSourceRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.extDataSourceId, that.extDataSourceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, extDataSourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataSourceRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    extDataSourceId: ").append(toIndentedString(extDataSourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
