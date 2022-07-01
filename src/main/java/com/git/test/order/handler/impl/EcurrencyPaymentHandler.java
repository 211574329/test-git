package com.git.test.order.handler.impl;

import com.git.test.order.dto.PaymentDTO;
import com.git.test.order.handler.PaymentHandler;
import com.git.test.order.result.PaymentResult;
import org.springframework.stereotype.Service;

/**
 * 网银支付
 */
@Service
public class EcurrencyPaymentHandler implements PaymentHandler {

    @Override
    public PaymentResult pay(PaymentDTO paymentDTO) {
        System.out.println("网银支付方式");
        // 假数据
        PaymentResult result = new PaymentResult();
        result.setStatus(true);
        return result;
    }
}
