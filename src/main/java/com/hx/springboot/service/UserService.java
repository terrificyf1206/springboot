package com.hx.springboot.service;

import com.hx.springboot.entity.UserInfo;
import com.hx.springboot.entity.UserRoleInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 15:04 2019/1/18.
 */
public interface UserService {
    /**
    * 批量获取用户信息
    *
    * @param paramMap
    * @return List<UserInfo>
    */
    List<UserInfo> getUserInfos(Map<String, Object> paramMap);


    /**
    * 获取用户角色信息
    *
    * @param paramMap
    * @return List<UserRoleInfo>
    */
    List<UserRoleInfo> getUserRoleInfos(Map<String, Object> paramMap);

}

