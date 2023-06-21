package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowEntitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<OpenEntityHeader> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scroll_id")

    private String scrollId;

    public ShowEntitiesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 技术资产总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowEntitiesResponse withEntities(List<OpenEntityHeader> entities) {
        this.entities = entities;
        return this;
    }

    public ShowEntitiesResponse addEntitiesItem(OpenEntityHeader entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ShowEntitiesResponse withEntities(Consumer<List<OpenEntityHeader>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 技术资产列表
     * @return entities
     */
    public List<OpenEntityHeader> getEntities() {
        return entities;
    }

    public void setEntities(List<OpenEntityHeader> entities) {
        this.entities = entities;
    }

    public ShowEntitiesResponse withScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    /**
     * scroll_id
     * @return scrollId
     */
    public String getScrollId() {
        return scrollId;
    }

    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEntitiesResponse showEntitiesResponse = (ShowEntitiesResponse) o;
        return Objects.equals(this.count, showEntitiesResponse.count)
            && Objects.equals(this.entities, showEntitiesResponse.entities)
            && Objects.equals(this.scrollId, showEntitiesResponse.scrollId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, entities, scrollId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEntitiesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
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
