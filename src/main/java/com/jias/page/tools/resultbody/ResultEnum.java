package com.jias.page.tools.resultbody;

public enum ResultEnum {
    // 数据操作错误定义
    SUCCESS(200, "成功"),
    FAILURE(201, "失败"),
    NO_AUTH(401,"你能不能先登录一下"),
    NO_PERMISSION(403, "你没得权限"),
    NOT_FOUND(404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器跑路了"),
    UNKNOWN_ERROR(600, "未知错误");

    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
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
}
