package com.huaweicloud.sdk.codehub.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.Error;
import com.huaweicloud.sdk.codehub.v3.model.RepoListInfoV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListUserAllRepositoriesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private Error error = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private RepoListInfoV2 result = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public ListUserAllRepositoriesResponse withError(Error error) {
        this.error = error;
        return this;
    }

    public ListUserAllRepositoriesResponse withError(Consumer<Error> errorSetter) {
        if(this.error == null ){
            this.error = new Error();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public ListUserAllRepositoriesResponse withResult(RepoListInfoV2 result) {
        this.result = result;
        return this;
    }

    public ListUserAllRepositoriesResponse withResult(Consumer<RepoListInfoV2> resultSetter) {
        if(this.result == null ){
            this.result = new RepoListInfoV2();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public RepoListInfoV2 getResult() {
        return result;
    }

    public void setResult(RepoListInfoV2 result) {
        this.result = result;
    }

    public ListUserAllRepositoriesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 响应状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUserAllRepositoriesResponse listUserAllRepositoriesResponse = (ListUserAllRepositoriesResponse) o;
        return Objects.equals(this.error, listUserAllRepositoriesResponse.error) &&
            Objects.equals(this.result, listUserAllRepositoriesResponse.result) &&
            Objects.equals(this.status, listUserAllRepositoriesResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(error, result, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserAllRepositoriesResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

