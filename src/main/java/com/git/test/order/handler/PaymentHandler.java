package com.git.test.order.handler;

import com.git.test.order.dto.PaymentDTO;
import com.git.test.order.result.PaymentResult;

/**
 * 支付接口
 */
public interface PaymentHandler {

    /**
     * 支付
     * @param paymentDTO    支付参数封装
     * @return
     */
    PaymentResult pay(PaymentDTO paymentDTO);
}
