package com.git.test.order.service.impl;

import com.git.test.order.dto.PaymentDTO;
import com.git.test.order.handler.PaymentHandler;
import com.git.test.order.handler.PaymentHandlerStrategy;
import com.git.test.order.result.PaymentResult;
import com.git.test.order.service.OrderService;
import com.git.test.order.vo.OrderPaymentVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private PaymentHandlerStrategy paymentHandlerStrategy;

    @Override
    public OrderPaymentVO pay(PaymentDTO paymentDTO) {
        // 获取支付处理器
        PaymentHandler paymentHandler = paymentHandlerStrategy.strategy(paymentDTO.getType());
        // 支付
        PaymentResult paymentResult = paymentHandler.pay(paymentDTO);
        // 业务逻辑省略...
        // 假数据
        OrderPaymentVO orderPaymentVO = new OrderPaymentVO();
        orderPaymentVO.setMessage("支付成功");
        return orderPaymentVO;
    }
}
