package com.xinchen.pattern.ddd.demo.event.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 16:24
 */
@Configuration
@ComponentScan(basePackageClasses = SpringEventHandlerConfiguration.class)
public class SpringEventHandlerConfiguration {
}
