package com.zhutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: zhutao
 * @Date: 2019/3/13 10:53
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApp.class);
    }
}
