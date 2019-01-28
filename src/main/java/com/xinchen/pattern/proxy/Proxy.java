package com.xinchen.pattern.proxy;

/**
 * @author xinchen
 * @version 1.0
 * @date 16/01/2019 14:29
 */
public class Proxy implements Subject {
    /** 要代理的对象 */
    private Subject subject;


    /** 初始化被代理对象 */
    public Proxy(String args){
        this.subject = new RealSubject(args);
    }

    /** 具体做的事情,可以拓展为算法骨架(模板方法) */
    @Override
    public void method(String args) {
        this.before();
        this.subject.method(args);
        this.after();
    }

    /** 代理之前做的事情 */
    public void before(){
        System.out.println(">>> Proxy Call Before...");
    }

    /** 代理结束做的事情 */
    public void after(){
        System.out.println(">>> Proxy Call After...");
    }
}
