package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * 一个Endpoint名称，只能包含中文、字母、数字、下划线、中划线、点、空格
 */
public class EndpointName {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointName {\n");
        sb.append("}");
        return sb.toString();
    }

}
