package com.cxb.bg.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dlkang
 * @date 2020/5/27 11:29
 * @description
 */
@RestController
@Slf4j
public class Payment9001Controller {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("payment/get")
    public String getPort(){
        return serverPort;
    }
}
