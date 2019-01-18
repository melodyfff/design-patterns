package com.xinchen.pattern.chain;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 17:41
 */
public class ConcreteHandlerB extends AbstractHandler {
    @Override
    protected Response handleDetail(Request request) {
        System.out.println(">>> ConcreteHandlerB Accept Request : "+ request.toString());
        return new Response(true, "return from ConcreteHandlerB...");
    }
}
