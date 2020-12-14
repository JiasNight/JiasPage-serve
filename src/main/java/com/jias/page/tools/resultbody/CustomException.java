package com.jias.page.tools.resultbody;

public class CustomException extends RuntimeException{

    protected Integer errorCode;

    public CustomException(Integer errorCode, String errorMsg){
        super(errorMsg);
        this.errorCode = errorCode;
    }
    public CustomException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.errorCode = codeEnum.getCode();
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + this.getMessage() + '\'' +
                '}';
    }
}
