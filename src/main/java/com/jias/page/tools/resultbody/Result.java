package com.jias.page.tools.resultbody;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Result {

    // 是否成功
    private Boolean success;

    // 响应码
    private Integer code;

    // 响应信息
    private String message;

    // 响应时间
    private String timestamp = this.timeFormat();

    // 响应数据
    private Object data;

    // 构造器私有
    private Result(){}

    // 返回成功
    public static Result success() {
        Result result = new Result();
        result.setResultEnum(ResultEnum.SUCCESS);
        return result;
    }

    // 返回成功
    public static Result success(Object data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setResultEnum(ResultEnum.SUCCESS);
        result.setResultData(data);
        return result;
    }

    // 返回失败
    public static Result failure() {
        Result result = new Result();
        result.setSuccess(false);
        result.setResultEnum(ResultEnum.FAILURE);
        return result;
    }

    // 返回失败
    public static Result failure(ResultEnum resultEnum) {
        Result result = new Result();
        result.setResultEnum(resultEnum);
        return result;
    }

    // 返回失败
    public static Result failure(ResultEnum resultEnum, Object data) {
        Result result = new Result();
        result.setResultEnum(resultEnum);
        result.setResultData(data);
        return result;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.setCode(resultEnum.getCode());
        this.setMessage(resultEnum.getMessage());
    }

    public void setResultData(Object data) {
        this.setData(data);
    }

    // 时间格式化
    public String timeFormat() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
