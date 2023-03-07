package com.zhaoshf.cloud.domain.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoshf.cloud.domain.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud.domain.repository
 * @name：PaymentMapper
 * @Date：2023/3/4 0:31
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
