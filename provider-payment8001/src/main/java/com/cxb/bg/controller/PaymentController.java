package com.cxb.bg.controller;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author dlkang
 * @date 2020/5/19 16:59
 * @description
 */
@RestController
@Slf4j
public class PaymentController {


    @Autowired
    private PaymentService paymentService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/get/{id}")
    @HystrixCommand(fallbackMethod = "hyxtrixCircuit"
            ,commandProperties = {
            //断路器默认开启，时间窗口期默认50秒 请求次数20次 失败率50%
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "60"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率
    })
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id) {

        if(id<0){
            throw new RuntimeException("id非法，不允许为负数");
        }
        Payment payment = paymentService.get(id);
        if (!Objects.isNull(payment)) {
            return new CommonResult(200, "查询成功" + serverPort, payment);
        } else {
            return new CommonResult(444, "不存在对应记录");
        }
    }


    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> createPayment(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "保存成功" + serverPort, result);
        } else {
            return new CommonResult(444, "保存失败");
        }
    }

    @GetMapping("payment/discovery")
    public Object getDiscovery() {

        List<String> list = discoveryClient.getServices();
        list.forEach(i -> {
            log.info(i);
        });

        return discoveryClient.getServices();
    }


    public CommonResult<Payment> hyxtrixCircuit(@PathVariable(value = "id") Long id){
        return new CommonResult(555, "balabalabalabala...");
    }
}
