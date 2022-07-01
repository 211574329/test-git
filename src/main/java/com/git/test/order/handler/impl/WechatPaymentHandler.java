package com.git.test.order.handler.impl;

import com.git.test.order.dto.PaymentDTO;
import com.git.test.order.handler.PaymentHandler;
import com.git.test.order.result.PaymentResult;
import org.springframework.stereotype.Service;

/**
 * 微信
 */
@Service
public class WechatPaymentHandler implements PaymentHandler {

    @Override
    public PaymentResult pay(PaymentDTO paymentDTO) {
        System.out.println("微信支付方式");
        // 假数据
        PaymentResult result = new PaymentResult();
        result.setStatus(true);
        return result;
    }
}
