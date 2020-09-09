package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.NamespacesNamespaces;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNamespacesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespaces")
    
    private List<NamespacesNamespaces> namespaces = null;
    
    public ListNamespacesResponse withNamespaces(List<NamespacesNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    
    public ListNamespacesResponse addNamespacesItem(NamespacesNamespaces namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public ListNamespacesResponse withNamespaces(Consumer<List<NamespacesNamespaces>> namespacesSetter) {
        if(this.namespaces == null ){
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 命名空间列表。
     * @return namespaces
     */
    public List<NamespacesNamespaces> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<NamespacesNamespaces> namespaces) {
        this.namespaces = namespaces;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNamespacesResponse listNamespacesResponse = (ListNamespacesResponse) o;
        return Objects.equals(this.namespaces, listNamespacesResponse.namespaces);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespaces);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNamespacesResponse {\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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

