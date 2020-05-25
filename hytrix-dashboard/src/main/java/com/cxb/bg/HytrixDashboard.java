package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author dlkang
 * @date 2020/5/22 11:38
 * @description
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HytrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(HytrixDashboard.class, args);
    }
}
