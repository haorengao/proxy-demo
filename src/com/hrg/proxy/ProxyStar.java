package com.hrg.proxy;

public class ProxyStar implements Star {
	
	private RealStar realStar;
	

	public ProxyStar(RealStar realStar) {
		super();
		this.realStar = realStar;
	}



	@Override
	public void sing() {
		
		System.out.println("before star singing....");
		
		realStar.sing();		
		
		System.out.println("after star singing....");

	}

}
