package com.xinchen.pattern.prototype.manager;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 21:58
 */
public class ConcretePrototypeA implements Prototype{
    private String name;

    public ConcretePrototypeA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        // 自定义克隆，此处可新建或者使用第三方序列化
        return new ConcretePrototypeA(this.getName());
    }

    @Override
    public String id() {
        return this.name;
    }
}
