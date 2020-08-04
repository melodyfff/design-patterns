package com.xinchen.pattern.chain.example;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 17:41
 */
public class ConcreteHandlerC extends AbstractHandler {
    @Override
    protected Response handleDetail(Request request) {
        System.out.println(">>> ConcreteHandlerC Accept Request : "+ request.toString());
        return new Response(true, "return from ConcreteHandlerC...");
    }
}
