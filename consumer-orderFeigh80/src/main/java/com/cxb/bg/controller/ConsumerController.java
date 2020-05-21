package com.cxb.bg.controller;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dlkang
 * @date 2020/5/21 16:36
 * @description
 */
@RestController
@EnableEurekaClient
public class ConsumerController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "consumer/order/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id){

        return paymentService.getPayment(id);
    }
}
