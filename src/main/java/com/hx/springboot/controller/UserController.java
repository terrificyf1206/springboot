package com.hx.springboot.controller;

import com.hx.springboot.entity.UserInfo;
import com.hx.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 14:41 2019/1/28.
 */
@Controller
@RequestMapping(value =  "/user")
@Api(description = "用户相关接口",tags = {"UserController"})
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/saveUserInfo")
    @ResponseBody
    @ApiOperation(value="保存用户信息")
    public void setValue(UserInfo userInfo) {
        userService.insertUserInfo(userInfo);
    }
}
