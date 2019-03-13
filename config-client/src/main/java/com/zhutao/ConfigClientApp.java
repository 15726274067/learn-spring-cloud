package com.zhutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhutao
 * @Date: 2019/3/13 11:20
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigClientApp.class);
    }
}
