package com.git.test.em;

import lombok.Getter;

/**
 * 返回结果枚举
 */
@Getter
public enum ResultCodeEnum {

    // 默认成功
    SUCCESS(200, "成功"),
    // 默认失败
    ERROR(300, "失败"),
    // 参数校验失败
    VALID_ERROR(201, "参数校验失败");


    /**
     * 响应编码
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
