package com.itheima.ssm.domain;

import java.util.List;

/**
 * @Author: admin
 * @Date: 2019/11/2 14:42
 */
public class Role {
    private String id;
    private String roleName;
    private String roleDesc;
    //添加一个判断性的标识 flag
    // 0代表为拥有角色  1 代表拥有角色
    private int flag;
    private List<Permission> permissions;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", flag=" + flag +
                ", permissions=" + permissions +
                '}';
    }
}
