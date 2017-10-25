package com.nj.cqx.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * DemoApplication
 * Author: chenqingxia
 * Date: 2017/10/25
 */
@RestController
@SpringBootApplication //Spring Boot核心注解，用于开启自动配置
public class DemoApplication {

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
