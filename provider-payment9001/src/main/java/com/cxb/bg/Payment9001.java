package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dlkang
 * @date 2020/5/26 18:37
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9001.class, args);
    }
}
