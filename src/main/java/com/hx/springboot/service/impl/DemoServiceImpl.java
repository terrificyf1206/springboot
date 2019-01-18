package com.hx.springboot.service.impl;

import com.hx.springboot.entity.Demo;
import com.hx.springboot.mapper.DemoMapper;
import com.hx.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 11:39 2019/1/18.
 */
@Service(value = "demoServie")
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<Demo> getDemos() {
        return demoMapper.getDemos();
    }
}
