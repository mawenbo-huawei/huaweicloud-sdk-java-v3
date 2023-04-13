package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VideoSummarizationTaskInputData
 */
public class VideoSummarizationTaskInputData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public VideoSummarizationTaskInputData withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名，当输入为obs类型时必填。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public VideoSummarizationTaskInputData withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * OBS的路径，当输入为obs类型时必填。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VideoSummarizationTaskInputData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url输入源的地址，当输入为url类型时必填。 长度不超过1000。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoSummarizationTaskInputData withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 数据标识。多输入场景下必选，值由算法定义；单输入场景非必选。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSummarizationTaskInputData videoSummarizationTaskInputData = (VideoSummarizationTaskInputData) o;
        return Objects.equals(this.bucket, videoSummarizationTaskInputData.bucket)
            && Objects.equals(this.path, videoSummarizationTaskInputData.path)
            && Objects.equals(this.url, videoSummarizationTaskInputData.url)
            && Objects.equals(this.key, videoSummarizationTaskInputData.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, path, url, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSummarizationTaskInputData {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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