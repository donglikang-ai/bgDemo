package com.cxb.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author dlkang
 * @date 2020/5/25 16:32
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer5001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer5001.class, args);
    }
}
