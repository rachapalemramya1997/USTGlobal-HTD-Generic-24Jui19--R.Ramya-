package com.dev.inheritance;

public class Child extends Parent {
	static Child s=new Child();
	public static void main(String[] args) {

		s.app1();
	}
	@Override
	public void app1() {

	}
//	@Override
//	private void app2() {    //private methods cannot be overriden
//
//	}
	@Override
	void app3() {

	}
	@Override
	protected void app4() {

	}
//	@Override
//	final void app5() {		//final methods cannot be override
//
//	}
//	@Override
//	public static void app6() {		//Static methods cannot override
//
//	}
//	


}
