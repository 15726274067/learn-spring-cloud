package com.zhutao.controller;

import com.zhutao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 16:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public Map<String, Object> sayHi(@RequestParam String name){
        Map<String, Object> map = new HashMap<>(2);
        String res = helloService.sayHello(name);
        map.put(name, res);
        return map;
    }
}
