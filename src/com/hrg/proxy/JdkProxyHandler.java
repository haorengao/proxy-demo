package com.hrg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyHandler {
	
	private Object obj;

	public JdkProxyHandler(Object realStar) {
		super();
		this.obj = realStar;
	}
	
	public Object getProxyInstance() {		
		
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {	
				System.out.println("before¡­¡­");
				method.invoke(obj, args);	
				System.out.println("after¡­¡­");
				return null;
			}
		});
		
		
	}
	

}
