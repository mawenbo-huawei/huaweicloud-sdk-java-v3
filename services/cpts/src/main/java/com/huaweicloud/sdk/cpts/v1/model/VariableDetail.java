package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VariableDetail
 */
public class VariableDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_quoted")

    private Boolean isQuoted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable")

    private List<Object> variable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private Integer variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_mode")

    private Integer variableMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_mode")

    private Integer shareMode;

    public VariableDetail withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * minimum: 0
     * maximum: 2147483647
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public VariableDetail withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 变量id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VariableDetail withIsQuoted(Boolean isQuoted) {
        this.isQuoted = isQuoted;
        return this;
    }

    /**
     * 是否被引用
     * @return isQuoted
     */
    public Boolean getIsQuoted() {
        return isQuoted;
    }

    public void setIsQuoted(Boolean isQuoted) {
        this.isQuoted = isQuoted;
    }

    public VariableDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 变量名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableDetail withVariable(List<Object> variable) {
        this.variable = variable;
        return this;
    }

    public VariableDetail addVariableItem(Object variableItem) {
        if (this.variable == null) {
            this.variable = new ArrayList<>();
        }
        this.variable.add(variableItem);
        return this;
    }

    public VariableDetail withVariable(Consumer<List<Object>> variableSetter) {
        if (this.variable == null) {
            this.variable = new ArrayList<>();
        }
        variableSetter.accept(this.variable);
        return this;
    }

    /**
     * 变量值
     * @return variable
     */
    public List<Object> getVariable() {
        return variable;
    }

    public void setVariable(List<Object> variable) {
        this.variable = variable;
    }

    public VariableDetail withVariableType(Integer variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 变量类型（1：整数；2：枚举；3：文件[；5：文本](tag:hws,hws_hk)）
     * minimum: 0
     * maximum: 2147483647
     * @return variableType
     */
    public Integer getVariableType() {
        return variableType;
    }

    public void setVariableType(Integer variableType) {
        this.variableType = variableType;
    }

    public VariableDetail withVariableMode(Integer variableMode) {
        this.variableMode = variableMode;
        return this;
    }

    /**
     * 变量读取模式，0：顺序模式；1：随机模式
     * @return variableMode
     */
    public Integer getVariableMode() {
        return variableMode;
    }

    public void setVariableMode(Integer variableMode) {
        this.variableMode = variableMode;
    }

    public VariableDetail withShareMode(Integer shareMode) {
        this.shareMode = shareMode;
        return this;
    }

    /**
     * 变量共享模式，0：用例模式；1：并发模式
     * @return shareMode
     */
    public Integer getShareMode() {
        return shareMode;
    }

    public void setShareMode(Integer shareMode) {
        this.shareMode = shareMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VariableDetail that = (VariableDetail) obj;
        return Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isQuoted, that.isQuoted) && Objects.equals(this.name, that.name)
            && Objects.equals(this.variable, that.variable) && Objects.equals(this.variableType, that.variableType)
            && Objects.equals(this.variableMode, that.variableMode) && Objects.equals(this.shareMode, that.shareMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSize, id, isQuoted, name, variable, variableType, variableMode, shareMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableDetail {\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isQuoted: ").append(toIndentedString(isQuoted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    variableMode: ").append(toIndentedString(variableMode)).append("\n");
        sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
