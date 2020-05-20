package com.cxb.bg.controller;

import com.cxb.bg.model.CommonResult;
import com.cxb.bg.model.Payment;
import com.cxb.bg.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author dlkang
 * @date 2020/5/19 16:59
 * @description
 */
@RestController
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id) {

        Payment payment = paymentService.get(id);
        if (!Objects.isNull(payment)) {
            return new CommonResult(200, "查询成功"+serverPort, payment);
        } else {
            return new CommonResult(444, "不存在对应记录"+serverPort);
        }
    }


    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> createPayment(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "保存成功"+serverPort, result);
        } else {
            return new CommonResult(444, "保存失败");
        }
    }
}
