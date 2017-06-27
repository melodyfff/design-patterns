package com.xinchen.proxy.DynamicProxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * JDK的动态代理依靠接口实现
 * 只能代理实现了接口的类
 * @author xinchen
 *
 */
public class LadyBro implements InvocationHandler {
	
	private Object target;
	
	public LadyBro(Object target){
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("闺蜜开始牵线");
		Object result = method.invoke(target, args);
		return result;
	}
	
	//生成代理对象
	public Object getProxy(){
		//类加载
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		//得到全部接口
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}

}
