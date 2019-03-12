package com.zhutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 16:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApp {

    public static void main(String[] args){
        SpringApplication.run(RibbonApp.class);
    }

    /**
     * @LoadBalanced 开启负载均衡的功能
     * @return
     */
    @Bean("restTemplate")
    @LoadBalanced
    RestTemplate initRestTemplate(){
        return new RestTemplate();
    }
}
