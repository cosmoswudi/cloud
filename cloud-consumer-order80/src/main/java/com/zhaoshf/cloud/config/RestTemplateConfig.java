package com.zhaoshf.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud.config
 * @name：RestTemplateConfig
 * @Date：2023/3/5 22:36
 * @Description: this class is ....
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
