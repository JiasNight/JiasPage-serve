package com.jias.page.tools.resultbody;


import java.util.Map;

public class Result {

    private Boolean success;

    private Integer code;

    private String message;

    private Object data;

    // 构造器私有
    private Result(){}

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result victory(Object data) {
        return result(CodeEnum.SUCCESS.getSuccess(), CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), data);
    }

    public static Result victory(String message, Object data) {
        return result(CodeEnum.SUCCESS.getSuccess(), CodeEnum.SUCCESS.getCode(), message, data);
    }

    public static Result defeat(Object data) {
        return result(CodeEnum.FAIL.getSuccess(), CodeEnum.FAIL.getCode(), CodeEnum.FAIL.getMessage(), data);
    }

    public static Result defeat(Integer code,String message, Object data) {
        return result(CodeEnum.FAIL.getSuccess(), code, message, data);
    }

    public static Result result(Boolean success, Integer code,String message, Object data){
        Result result = new Result();
        result.setSuccess(success);
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
