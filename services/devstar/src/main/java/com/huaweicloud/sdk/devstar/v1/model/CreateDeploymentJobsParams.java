package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CreateDeploymentJobsParams */
public class CreateDeploymentJobsParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private FGSDeploymentJobsParam function;

    public CreateDeploymentJobsParams withFunction(FGSDeploymentJobsParam function) {
        this.function = function;
        return this;
    }

    public CreateDeploymentJobsParams withFunction(Consumer<FGSDeploymentJobsParam> functionSetter) {
        if (this.function == null) {
            this.function = new FGSDeploymentJobsParam();
            functionSetter.accept(this.function);
        }

        return this;
    }

    /** Get function
     * 
     * @return function */
    public FGSDeploymentJobsParam getFunction() {
        return function;
    }

    public void setFunction(FGSDeploymentJobsParam function) {
        this.function = function;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeploymentJobsParams createDeploymentJobsParams = (CreateDeploymentJobsParams) o;
        return Objects.equals(this.function, createDeploymentJobsParams.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentJobsParams {\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}