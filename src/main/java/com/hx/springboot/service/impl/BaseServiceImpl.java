package com.hx.springboot.service.impl;

import com.hx.springboot.annotation.Column;
import com.hx.springboot.annotation.Id;
import com.hx.springboot.annotation.Table;
import com.hx.springboot.mapper.BaseMapper;
import com.hx.springboot.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 17:23 2019/1/25.
 */
@Service(value = "baseService")
public class BaseServiceImpl implements BaseService {
    @Autowired
    private BaseMapper baseMapper;

    public <T> Map<String, Object> transformObj(T obj) {
        //获取表名
        if (null == obj.getClass().getAnnotation(Table.class)) {
            throw new RuntimeException("Error Input Object! Error @Table Annotation.");
        }
        Map<String, Object> re = new HashMap<>();
        re.put("TABLE_NAME", obj.getClass().getAnnotation(Table.class).value());

        Method[] m = obj.getClass().getMethods();
        if (null == m || m.length <= 0) {
            throw new RuntimeException("Error Input Object! No Method.");
        }
        //存放列名
        List k = new ArrayList();
        //存放列值
        List v = new ArrayList();
        for (Method i : m) {
            //获取列名和值
            try {
                if (null != i.getAnnotation(Column.class)) {
                    k.add(i.getAnnotation(Column.class).value());
                    v.add(i.invoke(obj, null));
                    continue;
                }
                //获取主键
                if (null != i.getAnnotation(Id.class)) {
                    re.put("KEY_ID", i.getAnnotation(Id.class).value());
                    re.put("KEY_VALUE", i.invoke(obj, null));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error Input Object! Error Invoke Get Method.", e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Error Input Object! Error Invoke Get Method.", e);
            }
        }
        re.put("COLUMNS", k);
        re.put("VALUES", v);
        if (k.size() != v.size()) {
            throw new RuntimeException("Error Input Object! Internal Error.");
        }
        return re;
    }

    /**
     * @Author yangfan
     * @Description 1、获取查询语句中所需变量
     *              2、调用通用查询方法
     * @DATE 15:44 2019/1/28.
     * @Param 需要新增的对象
     * @Return int
     */
    @Override
    public <T> int insert(T obj) {
        Map<String, Object> params = transformObj(obj);
        return baseMapper.insert(params);
    }

    /**
     * @Author yangfan
     * @Description 1、获取查询语句中所需变量
     *              2、调用通用查询方法
     * @DATE 15:44 2019/1/28.
     * @Param 需要新增的对象
     * @Return int
     */
    @Override
    public <T> int insert(T obj) {
        Map<String, Object> params = transformObj(obj);
        return baseMapper.selectById(params);
    }
}
