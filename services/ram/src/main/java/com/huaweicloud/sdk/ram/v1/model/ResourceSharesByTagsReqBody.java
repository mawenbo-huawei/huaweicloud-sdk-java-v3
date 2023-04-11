package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceInstance操作的请求体。
 */
public class ResourceSharesByTagsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagFilter> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Match> matches = null;

    public ResourceSharesByTagsReqBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 不包含任意一个标签，该字段为true时查询所有不带标签的资源。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public ResourceSharesByTagsReqBody withTags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    public ResourceSharesByTagsReqBody addTagsItem(TagFilter tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceSharesByTagsReqBody withTags(Consumer<List<TagFilter>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含20个key，每个key下面的value最多20个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }

    public ResourceSharesByTagsReqBody withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    public ResourceSharesByTagsReqBody addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ResourceSharesByTagsReqBody withMatches(Consumer<List<Match>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 要绑定到新创建的帐号的标签列表。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceSharesByTagsReqBody resourceSharesByTagsReqBody = (ResourceSharesByTagsReqBody) o;
        return Objects.equals(this.withoutAnyTag, resourceSharesByTagsReqBody.withoutAnyTag)
            && Objects.equals(this.tags, resourceSharesByTagsReqBody.tags)
            && Objects.equals(this.matches, resourceSharesByTagsReqBody.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSharesByTagsReqBody {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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