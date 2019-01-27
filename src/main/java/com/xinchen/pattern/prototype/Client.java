package com.xinchen.pattern.prototype;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 20:08
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 测试克隆
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        System.out.println(concretePrototype1);
        System.out.println(concretePrototype1.clone());

        System.out.println();

        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        System.out.println(concretePrototype2);
        final ConcretePrototype2 clone = (ConcretePrototype2)concretePrototype2.clone();
        System.out.println(clone);
        System.out.println(concretePrototype2.getList());
        System.out.println(clone.getList());



        // 测试性能
        System.out.println();
        int count = 10000;
        long startTmie = System.currentTimeMillis();
        for (int i = 0;i<count;i++){
            new ConcretePrototype2();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("new cost :"+(endTime-startTmie)+"ms");
        // new cost :48ms


        startTmie = System.currentTimeMillis();
        for (int i = 0;i<count;i++){
           concretePrototype2.clone();
        }
        endTime = System.currentTimeMillis();
        System.out.println("prototype cost :"+(endTime-startTmie)+"ms");
        // prototype cost :2ms
    }
}
