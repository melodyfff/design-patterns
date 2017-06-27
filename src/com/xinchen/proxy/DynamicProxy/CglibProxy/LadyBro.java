package com.xinchen.proxy.DynamicProxy.CglibProxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer; 
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 使用cglib动态代理 
 * @author xinchen
 *
 */
public class LadyBro implements MethodInterceptor{

	private Object target;
	
	public Object getInstance(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		//回调方法
		enhancer.setCallback(this);
		//创建代理对象
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("闺蜜介绍");
		proxy.invokeSuper(obj, args);
		return null;
	}

}
