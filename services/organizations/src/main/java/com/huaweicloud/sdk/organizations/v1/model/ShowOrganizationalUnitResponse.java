package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOrganizationalUnitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit")

    private OrganizationalUnitDto organizationalUnit;

    public ShowOrganizationalUnitResponse withOrganizationalUnit(OrganizationalUnitDto organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    public ShowOrganizationalUnitResponse withOrganizationalUnit(
        Consumer<OrganizationalUnitDto> organizationalUnitSetter) {
        if (this.organizationalUnit == null) {
            this.organizationalUnit = new OrganizationalUnitDto();
            organizationalUnitSetter.accept(this.organizationalUnit);
        }

        return this;
    }

    /**
     * Get organizationalUnit
     * @return organizationalUnit
     */
    public OrganizationalUnitDto getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(OrganizationalUnitDto organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOrganizationalUnitResponse showOrganizationalUnitResponse = (ShowOrganizationalUnitResponse) o;
        return Objects.equals(this.organizationalUnit, showOrganizationalUnitResponse.organizationalUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationalUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationalUnitResponse {\n");
        sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
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