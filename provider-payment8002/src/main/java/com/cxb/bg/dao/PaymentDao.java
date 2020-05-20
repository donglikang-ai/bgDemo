package com.cxb.bg.dao;

import com.cxb.bg.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dlkang
 * @date 2020/5/19 17:00
 * @description
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment get(@Param("id") Long id);
}
