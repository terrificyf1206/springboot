package com.hx.springboot.entity;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 15:53 2019/1/18.
 */
public class UserRoleInfo {
    // 主键
    private long id;
    // 用户编号
    private String userCode;
    // 角色编号
    private String roleCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}

