package com.zhaoshf.cloud.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoshf.cloud.domain.entity.Payment;
import com.zhaoshf.cloud.domain.repository.PaymentMapper;
import com.zhaoshf.cloud.domain.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud.domain.service.impl
 * @name：PaymentServiceImpl
 * @Date：2023/3/4 0:33
 * @Description: this class is ....
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
