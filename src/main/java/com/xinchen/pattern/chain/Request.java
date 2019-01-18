package com.xinchen.pattern.chain;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 16:38
 */
public class Request{

    private int type;

    private String request;

    private Request() {}

    public Request(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public int getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", request='" + request + '\'' +
                '}';
    }
}
