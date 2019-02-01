package com.hx.springboot.controller;

import com.hx.springboot.entity.Demo;
import com.hx.springboot.service.DemoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 11:44 2019/1/18.
 */
@Controller
@RequestMapping(value =  "/demo",method = RequestMethod.GET)
@Api(description = "swagger测试接口",tags = {"DemoController"})
public class DemoController {
    @Autowired
    DemoService demoService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/getAll")
    public String testDemo(Map<String,Object> map) {
        List<Demo> demos = demoService.getDemos();
        map.put("data", demos);
        System.out.println(demos.toString());
        return ("/testDemo");
    }

    @RequestMapping(value = "/setValue")
    @ResponseBody
    @ApiOperation(value="获取redis list中的数据",notes = "测试一下")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "键", dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "value", value = "值", dataType = "String",paramType = "query")
    })
    public void setValue(String key,String value) {
//        stringRedisTemplate.opsForValue().set("yangfan","1206");
//        stringRedisTemplate.opsForList().leftPush("user","xiaoming");
//        stringRedisTemplate.opsForList().leftPush("user","xiaogou");
//        stringRedisTemplate.opsForList().set("user",0,"fffff");
//        String list = stringRedisTemplate.opsForList().index(key,3);
        List<String> list = stringRedisTemplate.opsForList().range(key,0,-1);
        System.out.println(list.toString());
    }
}
