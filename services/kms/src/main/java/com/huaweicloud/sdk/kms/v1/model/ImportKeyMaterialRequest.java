package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.ImportKeyMaterialRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ImportKeyMaterialRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId = "v1.0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ImportKeyMaterialRequestBody body = null;

    public ImportKeyMaterialRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    


    /**
     * Get versionId
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public ImportKeyMaterialRequest withBody(ImportKeyMaterialRequestBody body) {
        this.body = body;
        return this;
    }

    public ImportKeyMaterialRequest withBody(Consumer<ImportKeyMaterialRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ImportKeyMaterialRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ImportKeyMaterialRequestBody getBody() {
        return body;
    }

    public void setBody(ImportKeyMaterialRequestBody body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportKeyMaterialRequest importKeyMaterialRequest = (ImportKeyMaterialRequest) o;
        return Objects.equals(this.versionId, importKeyMaterialRequest.versionId) &&
            Objects.equals(this.body, importKeyMaterialRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportKeyMaterialRequest {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

