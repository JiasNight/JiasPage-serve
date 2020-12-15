package com.jias.page.tools.resultbody;

public class CustomException extends RuntimeException{

    protected Integer errorCode;

    public CustomException(Integer errorCode, String errorMsg){
        super(errorMsg);
        this.errorCode = errorCode;
    }
    public CustomException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.errorCode = resultEnum.getCode();
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + this.getMessage() + '\'' +
                '}';
    }
}
