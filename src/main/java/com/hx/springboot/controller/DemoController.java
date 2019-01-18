package com.hx.springboot.controller;

import com.hx.springboot.entity.Demo;
import com.hx.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 11:44 2019/1/18.
 */
@Controller
@RequestMapping(value =  "/demo")
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/getAll")
    public String testDemo(Map<String,Object> map) {
        List<Demo> demos = demoService.getDemos();
        map.put("data", demos);
        System.out.println(demos.toString());
        return ("/testDemo");
    }
}
