package com.cxb.bg.service;

import com.cxb.bg.model.Payment;

/**
 * @author dlkang
 * @date 2020/5/19 17:01
 * @description
 */
public interface PaymentService {

    Payment get(Long id);

    int create(Payment payment);
}
