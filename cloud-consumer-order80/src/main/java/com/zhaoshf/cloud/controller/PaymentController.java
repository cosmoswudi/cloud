package com.zhaoshf.cloud.controller;

import com.zhaoshf.cloud.common.CommonResult;
import com.zhaoshf.cloud.domain.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud.controller
 * @name：PaymentController
 * @Date：2023/3/5 22:35
 * @Description: this class is ....
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private RestTemplate restTemplate;

    public String url = "http://CLOUD-PROVIDER-PAYMENT";

    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable Integer id) {
        CommonResult forObject = restTemplate.getForObject(url + "/payment/get/" + id, CommonResult.class);
        return CommonResult.success(forObject.getData());
    }
}
