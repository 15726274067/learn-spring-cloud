package com.zhutao.hystric;

import com.zhutao.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 17:11
 * @Version 1.0
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHello(String name) {
        return "sorry " + name;
    }
}
