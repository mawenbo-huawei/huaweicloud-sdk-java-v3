package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 搜索结果的相关信息。
 */
public class SearchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private BigDecimal totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_num")

    private BigDecimal returnNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_time")

    private BigDecimal searchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_item")

    private SearchAfterParam lastItem;

    public SearchInfo withTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 搜索结果总数。
     * @return totalNum
     */
    public BigDecimal getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    public SearchInfo withReturnNum(BigDecimal returnNum) {
        this.returnNum = returnNum;
        return this;
    }

    /**
     * 返回结果总数。
     * @return returnNum
     */
    public BigDecimal getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(BigDecimal returnNum) {
        this.returnNum = returnNum;
    }

    public SearchInfo withSearchTime(BigDecimal searchTime) {
        this.searchTime = searchTime;
        return this;
    }

    /**
     * 搜索过程耗时，单位为毫秒。
     * @return searchTime
     */
    public BigDecimal getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(BigDecimal searchTime) {
        this.searchTime = searchTime;
    }

    public SearchInfo withLastItem(SearchAfterParam lastItem) {
        this.lastItem = lastItem;
        return this;
    }

    public SearchInfo withLastItem(Consumer<SearchAfterParam> lastItemSetter) {
        if (this.lastItem == null) {
            this.lastItem = new SearchAfterParam();
            lastItemSetter.accept(this.lastItem);
        }

        return this;
    }

    /**
     * Get lastItem
     * @return lastItem
     */
    public SearchAfterParam getLastItem() {
        return lastItem;
    }

    public void setLastItem(SearchAfterParam lastItem) {
        this.lastItem = lastItem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchInfo that = (SearchInfo) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.returnNum, that.returnNum)
            && Objects.equals(this.searchTime, that.searchTime) && Objects.equals(this.lastItem, that.lastItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, returnNum, searchTime, lastItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchInfo {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    returnNum: ").append(toIndentedString(returnNum)).append("\n");
        sb.append("    searchTime: ").append(toIndentedString(searchTime)).append("\n");
        sb.append("    lastItem: ").append(toIndentedString(lastItem)).append("\n");
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
