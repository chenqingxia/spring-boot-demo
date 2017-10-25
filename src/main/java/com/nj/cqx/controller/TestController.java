package com.nj.cqx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * TestController
 * Author: chenqingxia
 * Date: 2017/10/25
 */
@RestController
@RequestMapping("/api")
public class TestController {
    @RequestMapping("/test")
    String index(){
        return "Hello Spring Boot";
    }
}
