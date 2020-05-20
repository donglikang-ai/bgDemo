package com.cxb.bg.service.impl;

import com.cxb.bg.dao.PaymentDao;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dlkang
 * @date 2020/5/19 17:01
 * @description
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentDao paymentDao;


    @Override
    public Payment get(Long id) {
        return paymentDao.get(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
}
