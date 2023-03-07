package com.zhaoshf.cloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author：zhaoshf
 * @Package：com.zhaoshf.cloud.common
 * @name：CommonResult
 * @Date：2023/3/4 0:34
 * @Description: this class is ....
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;

    private String message;

    private T data;

    public static <T> CommonResult<T> success() {
        return new CommonResult<T>(200, "success", null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(200, "success", data);
    }

    public static <T> CommonResult<T> fail() {
        return new CommonResult<>(500, "fail", null);
    }

    public static <T> CommonResult<T> fail(String msg) {
        return new CommonResult<>(500, msg, null);
    }
}
