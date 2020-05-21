package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dlkang
 * @date 2020/5/21 16:33
 * @description
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeign80.class, args);
    }
}
