package com.xinchen.pattern.chain;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 17:19
 */
public class Response {

    private boolean status = false;

    private String message = "请求失败";


    public Response(){}


    public Response(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
