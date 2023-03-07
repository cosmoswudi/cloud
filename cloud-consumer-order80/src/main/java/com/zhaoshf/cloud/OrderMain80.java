package com.zhaoshf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud
 * @name：OrderMain80
 * @Date：2023/3/4 1:04
 * @Description: this class is ....
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
