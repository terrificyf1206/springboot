package com.hx.springboot.controller;

import com.hx.springboot.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 14:27 2018/12/27.
 */
@RestController
public class TestController {
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/index")
    public String index() {
        return "My name is "+authorSettings.getName()+" and password is "+authorSettings.getPassword()+" and I'm a "+authorSettings.getSex();
    }
}
