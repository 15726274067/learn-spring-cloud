package com.zhutao;

import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhutao
 * @Date: 2019/3/12 15:29
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApp {
    public static void main(String[] args){
        SpringApplication.run(EurekaClientApp.class);
    }
}
