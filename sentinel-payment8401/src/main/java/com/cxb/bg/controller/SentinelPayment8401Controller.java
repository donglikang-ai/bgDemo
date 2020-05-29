package com.cxb.bg.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author dlkang
 * @date 2020/5/28 15:52
 * @description
 */
@RestController
public class SentinelPayment8401Controller {

    @GetMapping("testA")
    public String testA() {
        return "testA...";
    }

    @GetMapping("testB")
    public String testB() {
        return "testB...";
    }


    @GetMapping("testC")
    public String testC() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "testC...";
    }



    @GetMapping("testD")
    @SentinelResource(value = "testD",blockHandler = "deal_testD")
    public String testD() {

        int a=10/0;

        return "testD...";
    }


    public String deal_testD(BlockException exception){
        return "(┬＿┬)   老哥，服务器出现故障";
    }
}
