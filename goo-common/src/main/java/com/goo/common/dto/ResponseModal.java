package com.goo.common.dto;

/**
 * Created by DongPT1 on 6/16/2017.
 */
public class ResponseModal {
    private int code;
    private String msg;
    private Object data;

    public ResponseModal(String msg) {
        this.code = 200;
        this.msg = msg;
    }

    public ResponseModal(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
