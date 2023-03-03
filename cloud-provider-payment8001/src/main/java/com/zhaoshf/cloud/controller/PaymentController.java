package com.zhaoshf.cloud.controller;

import com.zhaoshf.cloud.common.CommonResult;
import com.zhaoshf.cloud.domain.entity.Payment;
import com.zhaoshf.cloud.domain.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud.controller
 * @name：PaymentController
 * @Date：2023/3/4 0:33
 * @Description: this class is ....
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @PostMapping("/create")
    public CommonResult createPayment(Payment payment) {
        paymentService.save(payment);
        return CommonResult.success();
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        return CommonResult.success(paymentService.getById(id));
    }
}
