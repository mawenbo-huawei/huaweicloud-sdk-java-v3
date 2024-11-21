package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 安抚话术基本信息。
 */
public class PacifyWordsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pacify_words_id")

    private String pacifyWordsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pacify_words")

    private String pacifyWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pacify_words_type")

    private Integer pacifyWordsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent")

    private String intent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public PacifyWordsInfo withPacifyWordsId(String pacifyWordsId) {
        this.pacifyWordsId = pacifyWordsId;
        return this;
    }

    /**
     * 安抚话术ID。
     * @return pacifyWordsId
     */
    public String getPacifyWordsId() {
        return pacifyWordsId;
    }

    public void setPacifyWordsId(String pacifyWordsId) {
        this.pacifyWordsId = pacifyWordsId;
    }

    public PacifyWordsInfo withPacifyWords(String pacifyWords) {
        this.pacifyWords = pacifyWords;
        return this;
    }

    /**
     * 安抚话术。
     * @return pacifyWords
     */
    public String getPacifyWords() {
        return pacifyWords;
    }

    public void setPacifyWords(String pacifyWords) {
        this.pacifyWords = pacifyWords;
    }

    public PacifyWordsInfo withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public PacifyWordsInfo withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 应用ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public PacifyWordsInfo withPacifyWordsType(Integer pacifyWordsType) {
        this.pacifyWordsType = pacifyWordsType;
        return this;
    }

    /**
     * 安抚话术类型 > 0:通用安抚话术, 1:基于意图匹配安抚话术
     * minimum: 0
     * maximum: 32
     * @return pacifyWordsType
     */
    public Integer getPacifyWordsType() {
        return pacifyWordsType;
    }

    public void setPacifyWordsType(Integer pacifyWordsType) {
        this.pacifyWordsType = pacifyWordsType;
    }

    public PacifyWordsInfo withIntent(String intent) {
        this.intent = intent;
        return this;
    }

    /**
     * 意图名称
     * @return intent
     */
    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public PacifyWordsInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PacifyWordsInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PacifyWordsInfo that = (PacifyWordsInfo) obj;
        return Objects.equals(this.pacifyWordsId, that.pacifyWordsId)
            && Objects.equals(this.pacifyWords, that.pacifyWords) && Objects.equals(this.language, that.language)
            && Objects.equals(this.robotId, that.robotId) && Objects.equals(this.pacifyWordsType, that.pacifyWordsType)
            && Objects.equals(this.intent, that.intent) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(pacifyWordsId, pacifyWords, language, robotId, pacifyWordsType, intent, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PacifyWordsInfo {\n");
        sb.append("    pacifyWordsId: ").append(toIndentedString(pacifyWordsId)).append("\n");
        sb.append("    pacifyWords: ").append(toIndentedString(pacifyWords)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    pacifyWordsType: ").append(toIndentedString(pacifyWordsType)).append("\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
