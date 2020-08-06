package com.rymcu.peanut.core.result;

/**
 * @author ronger
 */
public class GlobalResult<T> {

    private String message;

    private T data;

    private int code;

    public GlobalResult() {
    }

    public static  <T> GlobalResult<T> newInstance() {
        return new GlobalResult();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
