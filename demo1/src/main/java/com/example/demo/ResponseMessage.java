//统一包装api返回的响应样式
package com.example.demo;

public class ResponseMessage {

    private String message;
    private int code;

    public ResponseMessage(String message, int code){
        this.message = message;
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
