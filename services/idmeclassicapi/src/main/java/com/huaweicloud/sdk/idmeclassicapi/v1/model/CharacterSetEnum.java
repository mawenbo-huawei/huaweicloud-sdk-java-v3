package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CharacterSetEnum
 */
public class CharacterSetEnum {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cnName")

    private String cnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enName")

    private String enName;

    public CharacterSetEnum withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    /**
     * **参数解释：**  中文名。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public CharacterSetEnum withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：**  编码。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CharacterSetEnum withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * **参数解释：**  英文名。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CharacterSetEnum that = (CharacterSetEnum) obj;
        return Objects.equals(this.cnName, that.cnName) && Objects.equals(this.code, that.code)
            && Objects.equals(this.enName, that.enName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnName, code, enName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterSetEnum {\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
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
