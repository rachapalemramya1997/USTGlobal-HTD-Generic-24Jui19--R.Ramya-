package com.dev.constructor;

public class Constructor {

	public Constructor(int i) {			//parameterised constructor
		System.out.println("This const is with int arg");
	}
	public Constructor() {				//default constructor
		System.out.println("This const is with no-arg");
	}
	public Constructor(String s) {				//parameterised constructor
		System.out.println("This const is with string arg");
	}
	public Constructor(String s,int i) {			//parameterised constructor with 2 input args
		System.out.println("This const is with string and int arg");
	}
	public Constructor(int i,String s) {			//parameterised constructor with 2 input args
		System.out.println("This const is with string and int arg");
	}
	//constructor cannot be a static.
	public static void main(String[] args) {
		Constructor ce = new Constructor();
		Constructor ce1 = new Constructor(1);
		Constructor ce2 = new Constructor("A");
		Constructor ce3 = new Constructor("A",1);
		Constructor ce4 = new Constructor(1,"A");
	}

}
