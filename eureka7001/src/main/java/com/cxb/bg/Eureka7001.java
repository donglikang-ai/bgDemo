package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dlkang
 * @date 2020/5/20 9:48
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class, args);
    }
}
