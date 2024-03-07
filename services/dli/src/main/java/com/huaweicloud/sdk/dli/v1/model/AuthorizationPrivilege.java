package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查看数据库的使用者的权限信息。
 */
public class AuthorizationPrivilege {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_admin")

    private Boolean isAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<String> privileges = null;

    public AuthorizationPrivilege withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 授权对象，和赋权API中的“object”对应。
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public AuthorizationPrivilege withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * 判断用户是否为管理员。
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public AuthorizationPrivilege withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称，即该用户在当前数据库上有权限。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AuthorizationPrivilege withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public AuthorizationPrivilege addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public AuthorizationPrivilege withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 该用户在数据库上的权限。
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizationPrivilege that = (AuthorizationPrivilege) obj;
        return Objects.equals(this._object, that._object) && Objects.equals(this.isAdmin, that.isAdmin)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.privileges, that.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, isAdmin, userName, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationPrivilege {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
