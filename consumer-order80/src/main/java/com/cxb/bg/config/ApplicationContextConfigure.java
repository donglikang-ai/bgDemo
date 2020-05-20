package com.cxb.bg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author dlkang
 * @date 2020/5/19 16:44
 * @description
 */
@Configuration
public class ApplicationContextConfigure {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
