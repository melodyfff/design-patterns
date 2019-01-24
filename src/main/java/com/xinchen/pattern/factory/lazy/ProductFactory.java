package com.xinchen.pattern.factory.lazy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinchen
 * @version 1.0
 * @date 24/01/2019 14:10
 */
public class ProductFactory {
    private static final Map<Class, Product> productMap = new HashMap<>(16);

    public static synchronized <T extends Product> T createProduct(Class<T> cls){
        Product product = null;
        if (null != productMap.get(cls)){
            product = productMap.get(cls);
        } else {
            try {
                product = (Product) Class.forName(cls.getName()).newInstance();
                productMap.put(cls, product);
            } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        // noinspection unchecked
        return (T) product;
    }
}
