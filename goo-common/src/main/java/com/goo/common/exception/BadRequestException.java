package com.goo.common.exception;

/**
 * Created by DongPT1 on 6/16/2017.
 */
public class BadRequestException extends GenericException {

    public BadRequestException(String message) {
        super(message);
        this.status = 400;
    }

    public BadRequestException(String code, String message) {
        super(code, message, 400);
    }
}
