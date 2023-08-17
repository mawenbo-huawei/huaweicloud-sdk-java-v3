package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEquipmentEsnRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_id")

    private String iegId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_id")

    private String equipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EquipmentEsn body;

    public UpdateEquipmentEsnRequest withIegId(String iegId) {
        this.iegId = iegId;
        return this;
    }

    /**
     * 智能企业网关ID
     * @return iegId
     */
    public String getIegId() {
        return iegId;
    }

    public void setIegId(String iegId) {
        this.iegId = iegId;
    }

    public UpdateEquipmentEsnRequest withEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
        return this;
    }

    /**
     * 智能企业网关设备ID
     * @return equipmentId
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public UpdateEquipmentEsnRequest withBody(EquipmentEsn body) {
        this.body = body;
        return this;
    }

    public UpdateEquipmentEsnRequest withBody(Consumer<EquipmentEsn> bodySetter) {
        if (this.body == null) {
            this.body = new EquipmentEsn();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EquipmentEsn getBody() {
        return body;
    }

    public void setBody(EquipmentEsn body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEquipmentEsnRequest that = (UpdateEquipmentEsnRequest) obj;
        return Objects.equals(this.iegId, that.iegId) && Objects.equals(this.equipmentId, that.equipmentId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iegId, equipmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEquipmentEsnRequest {\n");
        sb.append("    iegId: ").append(toIndentedString(iegId)).append("\n");
        sb.append("    equipmentId: ").append(toIndentedString(equipmentId)).append("\n");
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
