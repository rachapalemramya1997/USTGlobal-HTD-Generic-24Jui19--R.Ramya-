package com.dev.inheritance;

public class Parent {
	static Parent p=new Parent();
	String s="watsapp";
	String d="app";
	public static void main(String[] args) {

		p.app1();
		p.app2();
		
	}
	public void app1() {
		System.out.println(s);
	}
	private void app2() {
		System.out.println(s+" "+p.d);
	}
	void app3() {
		System.out.println(s);
	}
	protected void app4() {
		System.out.println(s);
	}
	final void app5() {
		System.out.println(s);
	}
	public static void app6() {
		System.out.println(p.d);
	}
	


}
