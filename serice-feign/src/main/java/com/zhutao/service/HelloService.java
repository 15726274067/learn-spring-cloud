package com.zhutao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 16:37
 * @Version 1.0
 */
@FeignClient("service-hi")
public interface HelloService {
    @GetMapping("/test/hi")
    String sayHello(@RequestParam String name);
}
