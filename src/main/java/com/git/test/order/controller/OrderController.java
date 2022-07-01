package com.git.test.order.controller;

import com.git.test.common.R;
import com.git.test.order.dto.PaymentDTO;
import com.git.test.order.service.OrderService;
import com.git.test.order.vo.OrderPaymentVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单控制器
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 支付
     * @param paymentDTO    支付信息封装
     * @return
     */
    @PostMapping("orderPay")
    public R<OrderPaymentVO> pay(@RequestBody @Validated PaymentDTO paymentDTO){
        return R.success(orderService.pay(paymentDTO));
    }

}
