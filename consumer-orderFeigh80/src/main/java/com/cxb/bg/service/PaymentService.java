package com.cxb.bg.service;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.impl.PaymentServiceImpl;
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
@FeignClient(value = "CLOUD-PROVIDER-SERVICE", fallback = PaymentServiceImpl.class)
public interface PaymentService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id);
}
