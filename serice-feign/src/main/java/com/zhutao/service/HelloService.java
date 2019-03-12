package com.zhutao.service;

import com.zhutao.hystric.HelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 16:37
 * @Version 1.0
 */
@FeignClient(value = "service-hi", fallback = HelloServiceHystric.class)
@Primary
public interface HelloService {
    @GetMapping("/test/hi")
    String sayHello(@RequestParam String name);
}
