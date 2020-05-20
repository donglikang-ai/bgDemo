package com.cxb.bg.controller;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author dlkang
 * @date 2020/5/19 16:42
 * @description
 */
@RestController
public class OrderController {

    private static String PAYMENT_URL="http://127.0.0.1:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/order/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Integer id) {

        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/" + id, CommonResult.class);

    }


    @PostMapping(value = "/order/create")
    public CommonResult<Payment> createPayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);
    }
}
