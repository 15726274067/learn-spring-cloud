package com.zhutao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhutao
 * @Date: 2019/3/13 11:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public Map<String, Object> hi(){
        Map<String, Object> map = new HashMap<>(1);
        map.put("foo", foo);
        return map;
    }
}
