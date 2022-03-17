package com.git.test.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应实体
 * @param <T>
 */
@Data
public class RestBean<T> implements Serializable {

    /**
     * 状态 0:失败, 1:成功
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;

    public RestBean(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> RestBean<T> success(T t){
        return new RestBean<T>(1, "成功", t);
    }

    public static <T> RestBean<T> fail(String message){
        return new RestBean<T>(0, message, null);
}   }
