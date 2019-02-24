package com.xinchen.pattern.proxy;

/**
 * @author xinchen
 * @version 1.0
 * @date 16/01/2019 14:39
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy("Hello");
        proxy.method("World");
    }
}
