package com.cxb.bg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dlkang
 * @date 2020/5/28 15:52
 * @description
 */
@RestController
public class SentinelPayment8401Controller {

    @GetMapping("test/a")
    public String testA(){
        return "testA...";
    }

    @GetMapping("test/b")
    public String testB(){
        return "testA...";
    }
}
