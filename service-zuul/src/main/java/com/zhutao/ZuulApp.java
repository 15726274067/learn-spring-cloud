package com.zhutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 18:06
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApp {
    public static void main(String[] args){
        SpringApplication.run(ZuulApp.class);
    }
}
