package com.cxb.bg.service;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dlkang
 * @date 2020/5/21 16:35
 * @description
 */
@Component
@FeignClient("CLOUD-PROVIDER-SERVICE")
public interface PaymentService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id);
}
