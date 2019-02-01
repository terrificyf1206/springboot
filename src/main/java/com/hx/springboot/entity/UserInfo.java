package com.hx.springboot.entity;

import com.hx.springboot.annotation.Column;
import com.hx.springboot.annotation.Id;
import com.hx.springboot.annotation.Table;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 15:53 2019/1/18.
 */
@Table(value = "user_info")
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

    @Id(value = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(value = "userCode")
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Column(value = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(value = "userPwd")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Column(value = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

