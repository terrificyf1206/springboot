package com.hx.springboot.annotation;

import java.lang.annotation.*;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 16:39 2019/1/25.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    String value();
}
