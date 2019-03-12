package com.zhutao.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhutao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 16:10
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 直接用的程序名替代了具体的url地址，在ribbon中它会根据服务名来选择具体的服务实例，
     * 根据服务实例在请求的时候会用具体的url替换掉服务名
     * @param name
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "sayHelloError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/test/hi?name="+name,String.class);
    }

    public String sayHelloError(String name){
        return "Hi " + name + ", sorry error";
    }
}
