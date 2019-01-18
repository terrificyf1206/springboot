package com.hx.springboot.mapper;

import com.hx.springboot.entity.RoleInfo;
import com.hx.springboot.entity.UserInfo;
import com.hx.springboot.entity.UserRoleInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 15:43 2019/1/18.
 */
public interface UserInfoMapper {
    List<UserInfo> getUserInfos(Map<String, Object> paramMap);
    List<UserRoleInfo> getUserRoleInfos(Map<String, Object> paramMap);
}
