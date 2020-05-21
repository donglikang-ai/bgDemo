package com.cxb.bg.controller;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author dlkang
 * @date 2020/5/19 16:42
 * @description
 */
@RestController
@EnableEurekaClient
@Slf4j
public class OrderController {

    private static String PAYMENT_URL="http://CLOUD-PROVIDER-SERVICE/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/order/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Integer id) {

        ResponseEntity<CommonResult> resultResponseEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if(resultResponseEntity.getStatusCode().is2xxSuccessful())
        {
            log.info("返回code 200");
            return resultResponseEntity.getBody();
        }

        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/" + id, CommonResult.class);

    }


    @PostMapping(value = "/order/create")
    public CommonResult<Payment> createPayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);
    }
}
