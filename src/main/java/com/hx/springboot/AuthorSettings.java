package com.hx.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 13:53 2018/12/28.
 */
@Component
@ConfigurationProperties(prefix = "author")
@PropertySource(value = {"classpath:author.properties"})
public class AuthorSettings {
    private String name;
    private String password;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
