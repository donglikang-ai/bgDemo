package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dlkang
 * @date 2020/5/25 16:20
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Gateway4001 {

    public static void main(String[] args) {
        SpringApplication.run(Gateway4001.class, args);
    }
}
