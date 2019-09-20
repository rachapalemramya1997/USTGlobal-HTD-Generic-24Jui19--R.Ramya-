package com.dev.inheritance;

public class ASubClass extends ASuperClass {

	public ASubClass() {
//		super();	//java implicitly adds this line
//	}
//	public ASubClass() {
		super(10,'c');
//	}
//	public ASubClass() {
//		super("Apple",100);
//	}
//	public ASubClass() {
//		super("Ball",20);
//	}
//	public ASubClass() {
//		super(20,"Cat");
	}

	public static void main(String[] args) {
		ASubClass su = new ASubClass();

	}

}
