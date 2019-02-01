package com.hx.springboot.service.impl;

import com.hx.springboot.entity.Demo;
import com.hx.springboot.entity.UserInfo;
import com.hx.springboot.entity.UserRoleInfo;
import com.hx.springboot.mapper.DemoMapper;
import com.hx.springboot.mapper.UserInfoMapper;
import com.hx.springboot.service.BaseService;
import com.hx.springboot.service.DemoService;
import com.hx.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 11:39 2019/1/18.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private BaseServiceImpl baseService;

    @Override
    public List<UserInfo> getUserInfos(Map<String, Object> paramMap) {
        return userInfoMapper.getUserInfos(paramMap);
    }

    @Override
    public List<UserRoleInfo> getUserRoleInfos(Map<String, Object> paramMap) {
        return userInfoMapper.getUserRoleInfos(paramMap);
    }

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        return baseService.insert(userInfo);
    }
}
