package com.xinchen.pattern.chain.orc;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/8/4 23:13
 */
public class OrcOfficer extends AbstractRequestHandler{
    OrcOfficer(AbstractRequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request request) {
        if (RequestType.TORTURE_PRISONER.equals(request.getRequestType())){
            request.markHandled();
            printHanding(request);
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
