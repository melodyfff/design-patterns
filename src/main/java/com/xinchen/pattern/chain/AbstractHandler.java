package com.xinchen.pattern.chain;

/**
 * @author xinchen
 * @version 1.0
 * @date 15/01/2019 17:16
 */
public abstract class AbstractHandler {


    private AbstractHandler nextHandler;


    /** 定义处理骨架 */
    public final Response handle(Object o){
        if (isSupport(o)){
            return this.handleDetail((Request) o);
        } else {
            return null != this.nextHandler ? this.nextHandler.handle(o) : new Response();
        }
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /** 钩子,判断当前处理类是否支持处理 */
    protected boolean isSupport(Object object){
        return (object instanceof Request);
    }


    /** 处理细节,延到实现类处理 */
    protected abstract Response handleDetail(Request request);


}
