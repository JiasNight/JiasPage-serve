package com.jias.page.common.resultbody;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理自定义异常
     *
     */
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public Result bizExceptionHandler(CustomException e) {
//        return Result.error().message(e.getMessage()).code(e.errorCode);
        return null;
    }

    /**
     * 处理其他异常
     *
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionHandler( Exception e) {
//        return Result.error();
        return null;
    }
}
