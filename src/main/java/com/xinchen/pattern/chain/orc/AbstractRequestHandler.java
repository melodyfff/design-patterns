package com.xinchen.pattern.chain.orc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/8/4 23:00
 */
abstract class AbstractRequestHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractRequestHandler.class);
    /** hold  */
    private final AbstractRequestHandler next;

    AbstractRequestHandler(AbstractRequestHandler next) {
        this.next = next;
    }

    void handleRequest(Request request) {
        if (null != next) {
            next.handleRequest(request);
        }
    }

    void printHanding(Request req) {
        LOGGER.info("{} handing request [{}]", this, req);
    }

    @Override
    public abstract String toString();
}
