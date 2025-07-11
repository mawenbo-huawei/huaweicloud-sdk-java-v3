package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 处置状态，包含如下:   - unhandled：未处理   - handled: 已处理
 */
public class HandleStatus {

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
        sb.append("class HandleStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
