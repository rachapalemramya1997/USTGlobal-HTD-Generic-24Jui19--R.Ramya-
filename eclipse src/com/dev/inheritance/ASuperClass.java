package com.dev.inheritance;

public class ASuperClass {

	public ASuperClass() {

		System.out.println("Const with no-arg of SuperClass");
	}
	public ASuperClass(int i,char c) {
		System.out.println("Const with int and char arg of SuperClass");
	}
	public ASuperClass(String str,long l) {
		System.out.println("Const with string and long arg of SuperClass");
	}
	public ASuperClass(String str,int i) {
		System.out.println("Const with string and int arg of SuperClass");
	}
	public ASuperClass(int i,String str) {
		System.out.println("Const with int and string arg of SuperClass");
	}

public static void main(String[] args) {


}}


