package com.xinchen.pattern.chain;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 17:40
 */
public class ConcreteHandlerA extends AbstractHandler {

    @Override
    protected Response handleDetail(Request request) {
        System.out.println(">>> ConcreteHandlerA Accept Request : "+ request.toString());
        return new Response(true,"return from ConcreteHandlerA...");
    }

    @Override
    protected boolean isSupport(Object object) {
        // 只处理 request 类型type为 1 的
        return super.isSupport(object) && 1 ==((Request) object).getType();
    }
}
