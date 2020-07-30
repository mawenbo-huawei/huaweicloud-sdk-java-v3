package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.TemplateGroup;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateTemplateGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_group")
    
    private TemplateGroup templateGroup = null;

    public CreateTemplateGroupResponse withTemplateGroup(TemplateGroup templateGroup) {
        this.templateGroup = templateGroup;
        return this;
    }

    public CreateTemplateGroupResponse withTemplateGroup(Consumer<TemplateGroup> templateGroupSetter) {
        if(this.templateGroup == null ){
            this.templateGroup = new TemplateGroup();
            templateGroupSetter.accept(this.templateGroup);
        }
        
        return this;
    }


    /**
     * Get templateGroup
     * @return templateGroup
     */
    public TemplateGroup getTemplateGroup() {
        return templateGroup;
    }

    public void setTemplateGroup(TemplateGroup templateGroup) {
        this.templateGroup = templateGroup;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemplateGroupResponse createTemplateGroupResponse = (CreateTemplateGroupResponse) o;
        return Objects.equals(this.templateGroup, createTemplateGroupResponse.templateGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateGroupResponse {\n");
        sb.append("    templateGroup: ").append(toIndentedString(templateGroup)).append("\n");
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

