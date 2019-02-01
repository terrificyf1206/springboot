package com.hx.springboot.annotation;

import java.lang.annotation.*;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 16:48 2019/1/25.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
    String value();
}
