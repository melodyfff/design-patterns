package com.xinchen.pattern.chain;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 17:45
 */
public class Client {

    public static void main(String[] args) {

        // 声明处理节点
        AbstractHandler handlerA = new ConcreteHandlerA();
        AbstractHandler handlerB = new ConcreteHandlerB();
        AbstractHandler handlerC = new ConcreteHandlerC();

        // 设置处理顺序 A->B->C
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);


        Request request = new Request(3, "hello");
        final Response handle = handlerA.handle(request);
        System.out.println(">>> Response: "+handle);
    }

}
