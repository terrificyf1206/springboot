package com.hx.springboot.entity;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 15:53 2019/1/18.
 */
public class RoleInfo {
    // 主键
    private long id;
    // 角色编号
    private String roleCode;
    // 角色名称
    private String roleName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

