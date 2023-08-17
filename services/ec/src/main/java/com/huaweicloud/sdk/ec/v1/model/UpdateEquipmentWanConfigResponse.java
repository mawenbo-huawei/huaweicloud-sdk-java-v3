package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateEquipmentWanConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wan_interfaces")

    private List<EquipmentWanItem> wanInterfaces = null;

    public UpdateEquipmentWanConfigResponse withWanInterfaces(List<EquipmentWanItem> wanInterfaces) {
        this.wanInterfaces = wanInterfaces;
        return this;
    }

    public UpdateEquipmentWanConfigResponse addWanInterfacesItem(EquipmentWanItem wanInterfacesItem) {
        if (this.wanInterfaces == null) {
            this.wanInterfaces = new ArrayList<>();
        }
        this.wanInterfaces.add(wanInterfacesItem);
        return this;
    }

    public UpdateEquipmentWanConfigResponse withWanInterfaces(Consumer<List<EquipmentWanItem>> wanInterfacesSetter) {
        if (this.wanInterfaces == null) {
            this.wanInterfaces = new ArrayList<>();
        }
        wanInterfacesSetter.accept(this.wanInterfaces);
        return this;
    }

    /**
     * 设备WAN口配置列表
     * @return wanInterfaces
     */
    public List<EquipmentWanItem> getWanInterfaces() {
        return wanInterfaces;
    }

    public void setWanInterfaces(List<EquipmentWanItem> wanInterfaces) {
        this.wanInterfaces = wanInterfaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEquipmentWanConfigResponse that = (UpdateEquipmentWanConfigResponse) obj;
        return Objects.equals(this.wanInterfaces, that.wanInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wanInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEquipmentWanConfigResponse {\n");
        sb.append("    wanInterfaces: ").append(toIndentedString(wanInterfaces)).append("\n");
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
