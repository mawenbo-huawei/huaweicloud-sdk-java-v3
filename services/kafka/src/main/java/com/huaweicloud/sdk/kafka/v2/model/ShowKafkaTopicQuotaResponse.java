package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowKafkaTopicQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<KafkaTopicQuota> quotas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowKafkaTopicQuotaResponse withQuotas(List<KafkaTopicQuota> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowKafkaTopicQuotaResponse addQuotasItem(KafkaTopicQuota quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ShowKafkaTopicQuotaResponse withQuotas(Consumer<List<KafkaTopicQuota>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * Topic流控配置
     * @return quotas
     */
    public List<KafkaTopicQuota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<KafkaTopicQuota> quotas) {
        this.quotas = quotas;
    }

    public ShowKafkaTopicQuotaResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Topic流控数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKafkaTopicQuotaResponse that = (ShowKafkaTopicQuotaResponse) obj;
        return Objects.equals(this.quotas, that.quotas) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaTopicQuotaResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
