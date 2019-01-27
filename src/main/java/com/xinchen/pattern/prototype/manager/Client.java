package com.xinchen.pattern.prototype.manager;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 22:14
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototypeA = new ConcretePrototypeA("ConcretePrototypeA");
        Prototype prototypeB = new ConcretePrototypeB("ConcretePrototypeB");

        PrototypeManager.addPrototype(prototypeA);
        PrototypeManager.addPrototype(prototypeB);

        System.out.println(prototypeA);
        System.out.println(PrototypeManager.getPrototype("ConcretePrototypeA"));
        System.out.println(PrototypeManager.getPrototypeClone("ConcretePrototypeA"));
        //  ConcretePrototypeA@60e53b93
        //  ConcretePrototypeA@60e53b93
        //  ConcretePrototypeA@5e2de80c
    }
}
