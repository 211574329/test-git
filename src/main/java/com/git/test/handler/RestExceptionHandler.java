package com.git.test.handler;

import com.git.test.common.R;
import com.git.test.em.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 异常解析器
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    // 参数校验异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R<List<Map<String, String>>> handler(MethodArgumentNotValidException e){
        // 提取验证失败的所有的信息
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        // 格式化
        List<Map<String, String>> mapList = toValidatorMsg(fieldErrors);
        return R.fail(ResultCodeEnum.VALID_ERROR, mapList);
    }


    private List<Map<String, String>> toValidatorMsg(List<FieldError> fieldErrorList) {
        List<Map<String, String>> mapList = new ArrayList<>();
        // 循环提取
        for (FieldError fieldError : fieldErrorList) {
            Map<String, String> map = new HashMap<>();
            // 获取验证失败的属性
            map.put("field", fieldError.getField());
            // 获取验证失败的的提示信息
            map.put("msg", fieldError.getDefaultMessage());
            mapList.add(map);
        }
        return mapList;
    }
}
