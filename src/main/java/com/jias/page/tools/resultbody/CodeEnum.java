package com.jias.page.tools.resultbody;

public enum CodeEnum {
    // 数据操作错误定义
    SUCCESS(true, 200, "成功"),
    FAIL(false, 201, "失败"),
    NO_PERMISSION(false, 403, "你没得权限"),
    NO_AUTH(false, 401,"你能不能先登录一下"),
    NOT_FOUND(false, 404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(false, 500, "服务器跑路了"),
    UNKNOWN_ERROR(false, 600, "未知错误");

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    CodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
