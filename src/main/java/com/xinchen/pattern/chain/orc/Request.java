package com.xinchen.pattern.chain.orc;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/8/4 22:58
 */
class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public void markHandled() { this.handled = true; }

    //----------------------------
    // Getter
    //----------------------------


    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public boolean isHandled() { return this.handled; }

    @Override
    public String toString() {
        return "Request{" +
                "requestType=" + requestType +
                ", requestDescription='" + requestDescription + '\'' +
                ", handled=" + handled +
                '}';
    }
}
