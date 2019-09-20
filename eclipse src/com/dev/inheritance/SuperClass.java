package com.dev.inheritance;

public class SuperClass {

	public static void main(String[] args) {
		
			
	}
	public SuperClass() {
		System.out.println("Const with no-arg of SuperClass");
	}
	public SuperClass(int i) {
		System.out.println("Const with int arg of SuperClass");
	}
	public SuperClass(String str) {
		System.out.println("Const with string arg of SuperClass");
	}
	public SuperClass(String str,int i) {
		System.out.println("Const with string and int arg of SuperClass");
	}
	public SuperClass(int i,String str) {
		System.out.println("Const with int and string arg of SuperClass");
	}

}
