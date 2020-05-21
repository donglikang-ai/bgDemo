package com.cxb.bg;

import com.cxb.rule.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author dlkang
 * @date 2020/5/19 16:42
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PROVIDER-SERVICE", configuration = RibbonRule.class)
public class Order80 {

    public static void main(String[] args) {
        SpringApplication.run(Order80.class, args);
    }
}
