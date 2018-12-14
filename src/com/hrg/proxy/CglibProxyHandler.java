package com.hrg.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyHandler implements MethodInterceptor {
	
	
	
	private Object obj;
	
	public Object getProxyInstance(final Object obj) {
		
		this.obj = obj;		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	
	
	

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println("before...");
		
//		method.invoke(obj, args);
		proxy.invokeSuper(obj, args);
		
		System.out.println("after...");
		
		return null;
	}

}
