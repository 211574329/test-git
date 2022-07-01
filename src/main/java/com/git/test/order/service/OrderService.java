package com.git.test.order.service;

import com.git.test.order.dto.PaymentDTO;
import com.git.test.order.vo.OrderPaymentVO;

/**
 * 订单接口
 */
public interface OrderService {

    /**
     * 支付
     * @param paymentDTO    订单信息封装
     * @return
     */
    OrderPaymentVO pay(PaymentDTO paymentDTO);

}
