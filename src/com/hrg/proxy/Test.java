package com.hrg.proxy;

public class Test {
	
	public static void main(String[] args) {
		
		//������һ�ο����ڴ��������� ������
		 //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

		//1.��̬����ʽ
//		Star proxy = new ProxyStar(new RealStar());
//		proxy.sing();
		
		//2.��̬����ʽ
//		Star dynamicProxy = (Star) new JdkProxyHandler(new RealStar()).getProxyInstance();
//		dynamicProxy.sing();
		
		//2.1���Զ�̬�����಻�ýӿڷ�ʽ����������ܽ᣺JDK ʵ�ֶ�̬������Ҫʵ����ͨ���ӿڶ���ҵ�񷽷���
//		RealStar2 dynamicProxy2 = (RealStar2) new JdkProxyHandler(new RealStar2()).getProxyInstance();
//		dynamicProxy2.sing();
		
		//3.cglib ��̬����
		RealStar2 dynamicProxy2 = (RealStar2) new CglibProxyHandler().getProxyInstance(new RealStar2());
		dynamicProxy2.sing();
		
		dynamicProxy2.talk();
		
	}

}
