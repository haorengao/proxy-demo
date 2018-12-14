package com.hrg.proxy;

public class Test {
	
	public static void main(String[] args) {
		
		//加入这一段可以在磁盘中生成 代理类
		 //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

		//1.静态代理方式
//		Star proxy = new ProxyStar(new RealStar());
//		proxy.sing();
		
		//2.动态代理方式
//		Star dynamicProxy = (Star) new JdkProxyHandler(new RealStar()).getProxyInstance();
//		dynamicProxy.sing();
		
		//2.1测试动态代理类不用接口方式，结果报错（总结：JDK 实现动态代理需要实现类通过接口定义业务方法）
//		RealStar2 dynamicProxy2 = (RealStar2) new JdkProxyHandler(new RealStar2()).getProxyInstance();
//		dynamicProxy2.sing();
		
		//3.cglib 动态代理
		RealStar2 dynamicProxy2 = (RealStar2) new CglibProxyHandler().getProxyInstance(new RealStar2());
		dynamicProxy2.sing();
		
		dynamicProxy2.talk();
		
	}

}
