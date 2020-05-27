package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dlkang
 * @date 2020/5/27 11:55
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order90 {

    public static void main(String[] args) {
        SpringApplication.run(Order90.class, args);
    }
}
