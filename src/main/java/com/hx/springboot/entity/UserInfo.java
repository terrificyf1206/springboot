package com.hx.springboot.entity;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 15:53 2019/1/18.
 */
public class UserInfo {
    // 主键
    private long id;
    // 用户编号
    private String userCode;
    // 用户名称
    private String userName;
    // 用户密码
    private String userPwd;
    // 备注
    private String remark;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

