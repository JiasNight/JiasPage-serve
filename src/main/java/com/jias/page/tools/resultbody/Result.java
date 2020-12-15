package com.jias.page.tools.resultbody;


public class Result {

    private Boolean success;

    private Integer code;

    private String message;

    private Object data;

    // 构造器私有
    private Result(){}

    public static Result success() {
        Result result = new Result();
        result.setSuccess(ResultEnum.SUCCESS.getSuccess());
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setSuccess(ResultEnum.SUCCESS.getSuccess());
        result.setData(data);
        return result;
    }

    public static Result failure() {
        Result result = new Result();
        result.setSuccess(ResultEnum.FAILURE.getSuccess());
        result.setCode(ResultEnum.FAILURE.getCode());
        result.setMessage(ResultEnum.FAILURE.getMessage());
        return result;
    }

    public static Result failure(ResultEnum resultEnum, Object data) {
        Result result = new Result();
        result.setSuccess(resultEnum.getSuccess());
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        result.setData(data);
        return result;
    }

//    public static Result setResult(CodeEnum codeEnum) {
//        Result result = new Result();
//        result.setSuccess(codeEnum.getSuccess());
//        result.setCode(codeEnum.getCode());
//        result.setMessage(codeEnum.getMessage());
//        return result;
//    }

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
}
