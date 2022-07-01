package com.git.test.common;

import com.git.test.em.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 响应实体
 *
 * @param <T>
 */
@Data
public class R<T> implements Serializable {

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

    public R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> R<T> success(T t) {
        return new R<T>(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage(), t);
    }

    public static <T> R<T> fail(String message) {
        return new R<T>(ResultCodeEnum.ERROR.getCode(), message, null);
    }

    public static <T> R<T> fail(ResultCodeEnum resultCodeEnum, T t){
        return new R<T>(resultCodeEnum.getCode(), resultCodeEnum.getMessage(), t);
    }

}

