package com.xinchen.pattern.ddd.demo;

import com.xinchen.pattern.ddd.demo.event.spring.SpringEventHandlerConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 14:47
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringEventHandlerConfiguration.class);
        System.out.println(app.getDisplayName());
    }
}
