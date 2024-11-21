package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAsyncTtsJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_url")

    private String audioFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_info_file_url")

    private String audioInfoFileUrl;

    public ShowAsyncTtsJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 音频文件是否已生成完成。该标记为PROCESSING时，应该每隔3秒再次调用本接口获取音频文件(WAITING 等待中,PROCESSING 处理中,SUCCEED 成功,FAILED 失败)
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowAsyncTtsJobResponse withAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }

    /**
     * 音频文件下载链接，有效期为1个小时。
     * @return audioFileUrl
     */
    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    public void setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

    public ShowAsyncTtsJobResponse withAudioInfoFileUrl(String audioInfoFileUrl) {
        this.audioInfoFileUrl = audioInfoFileUrl;
        return this;
    }

    /**
     * 音频信息文件下载链接，有效期为1个小时。
     * @return audioInfoFileUrl
     */
    public String getAudioInfoFileUrl() {
        return audioInfoFileUrl;
    }

    public void setAudioInfoFileUrl(String audioInfoFileUrl) {
        this.audioInfoFileUrl = audioInfoFileUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAsyncTtsJobResponse that = (ShowAsyncTtsJobResponse) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.audioFileUrl, that.audioFileUrl)
            && Objects.equals(this.audioInfoFileUrl, that.audioInfoFileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, audioFileUrl, audioInfoFileUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAsyncTtsJobResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    audioFileUrl: ").append(toIndentedString(audioFileUrl)).append("\n");
        sb.append("    audioInfoFileUrl: ").append(toIndentedString(audioInfoFileUrl)).append("\n");
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
