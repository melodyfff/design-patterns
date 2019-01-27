package com.xinchen.pattern.prototype;

import java.util.ArrayList;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 20:03
 */
public class ConcretePrototype2 extends Prototype {
    private ArrayList list = new ArrayList();

    /**
     * 由于Clone不会调用构造函数，可用来查看差别
     */
    public ConcretePrototype2() {
        System.out.println("ConcretePrototype2 init...");
        this.list.add("Hello World!");
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ConcretePrototype2 clone = (ConcretePrototype2)super.clone();
        // 深度拷贝
        clone.setList((ArrayList) this.getList().clone());
        return clone;
    }
}
