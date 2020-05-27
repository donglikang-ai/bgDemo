package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dlkang
 * @date 2020/5/27 16:33
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClient {


    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient.class, args);
    }
}
