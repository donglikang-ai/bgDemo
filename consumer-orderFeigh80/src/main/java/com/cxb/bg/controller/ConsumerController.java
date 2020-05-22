package com.cxb.bg.controller;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
@DefaultProperties(defaultFallback = "hystrixFallBackGlobal")
public class ConsumerController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "consumer/order/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixFallBack")
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id) {

        return paymentService.getPayment(id);
    }

    @GetMapping(value = "consumer/order1/get/{id}")
    @HystrixCommand
    public CommonResult<Payment> getPayment1(@PathVariable(value = "id") Long id) {

        return paymentService.getPayment(id);
    }

    @GetMapping(value = "consumer/order2/get/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable(value = "id") Long id) {

        return paymentService.getPayment(id);
    }

    public CommonResult<Payment> hystrixFallBack(@PathVariable(value = "id") Long id) {
        return new CommonResult<>(444, "服务器繁忙");
    }

    /**
     * 通用降级处理
     * @return
     */
    public CommonResult<Payment> hystrixFallBackGlobal() {
        return new CommonResult<>(444, "服务器繁忙！！！");
    }
}
