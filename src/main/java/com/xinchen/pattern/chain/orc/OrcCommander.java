package com.xinchen.pattern.chain.orc;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/8/4 23:04
 */
public class OrcCommander extends AbstractRequestHandler {
    OrcCommander(AbstractRequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request request) {
        if (RequestType.DEFEND_CASTLE.equals(request.getRequestType())){
            // in real ,do logic
            request.markHandled();
            printHanding(request);
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc Commander";
    }
}
