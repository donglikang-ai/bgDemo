package com.cxb.bg.service.impl;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.PaymentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author dlkang
 * @date 2020/5/22 10:08
 * @description
 */
@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> getPayment(Long id) {
        return new CommonResult<>(444, "服务器打小差了");

    }
}
