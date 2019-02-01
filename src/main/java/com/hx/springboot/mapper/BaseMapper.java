package com.hx.springboot.mapper;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 16:56 2019/1/25.
 */
public interface BaseMapper {
    <T> int insert(T obj);

    <T> int delete(T obj);

    <T> T selectById(long id,T obj);

    <T> int update(T obj);
}
