package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dlkang
 * @date 2020/5/28 15:51
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelPayment8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelPayment8401.class, args);
    }
}
