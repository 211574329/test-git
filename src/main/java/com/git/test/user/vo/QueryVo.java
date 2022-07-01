package com.git.test.user.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 查询参数
 */
@Data
public class QueryVo {

    /**
     * 用户id
     * @mock @natural(0, 100000)    // 自然数范围对象
     */
    @NotNull
    private Integer id;

    /**
     * 用户名
     * @mock (中文, 非中文)
     */
    private String userName;

}
