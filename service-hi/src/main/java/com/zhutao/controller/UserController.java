package com.zhutao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 15:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hi")
    public Map<String, Object> sayHi(@RequestParam String name){
        Map<String, Object> map = new HashMap<>(5);
        map.put("name", name);
        return map;
    }
}
