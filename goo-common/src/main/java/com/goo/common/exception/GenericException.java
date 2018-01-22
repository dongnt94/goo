package com.goo.common.exception;

/**
 * Created by DongPT1 on 6/16/2017.
 */
public class GenericException extends RuntimeException {
    protected int status = 500;
    protected String code;

    public GenericException() {
        super("Internal Server Error");
    }

    public GenericException(String message) {
        super(message);
    }

    public GenericException(String message, int status) {
        super(message);
        this.status = status;
    }

    public GenericException(String code, String message, int status) {
        super(message);
        this.status = status;
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
