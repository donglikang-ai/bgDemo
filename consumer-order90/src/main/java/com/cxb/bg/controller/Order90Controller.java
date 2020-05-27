package com.cxb.bg.controller;

import com.cxb.bg.config.RestTempleteConf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dlkang
 * @date 2020/5/27 11:56
 * @description
 */
@RestController
@Slf4j
public class Order90Controller {


    @Value("${service-url.nacos-payment-url}")
    private String paymentUrl;

    @Autowired
    private RestTempleteConf restTempleteConf;


    @GetMapping("consumer/order/get/{id}")
    public String get(@PathVariable("id") long id) {

        return restTempleteConf.getRestTemplate().getForObject(paymentUrl + "/payment/get", String.class);

    }
}
