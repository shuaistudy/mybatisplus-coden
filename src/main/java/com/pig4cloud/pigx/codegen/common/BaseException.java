package com.pig4cloud.pigx.codegen.common;


/**
 */
public class BaseException extends RuntimeException{

    private Integer code ;
    private String message;
    private String devMessage;


    /**
     * 根据异常枚举 通用赋值
     * @param exceptions 异常枚举类
     */
    public BaseException(Exceptions exceptions) {
        super("error");
        this.code = exceptions.getCode();
        this.message = exceptions.getLabel();

    }

    /**
     * catch类构造
     * @param exceptions
     * @param cause
     */
    public BaseException(Exceptions exceptions, Throwable cause) {
        super(cause);
        this.code = exceptions.getCode();
        this.message = exceptions.getLabel();
    }

    /**
     * 根据异常枚举 通用赋值
     */
    public BaseException(String msg) {
        super("error");
        this.code = Exceptions.APIError.getCode();
        this.message = msg;

    }



    public static BaseException wrap(Throwable throwable) {
        if (throwable instanceof BaseException) {
            return (BaseException) throwable;
        }
        return new BaseException(Exceptions.APIError, throwable);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDevMessage() {
        return devMessage;
    }

    public void setDevMessage(String devMessage) {
        this.devMessage = devMessage;
    }
}
