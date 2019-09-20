package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo = new MethodOverloading();
	public void print() {
		System.out.println("This is print method with no-arg");
	}
	public int print(int i) {		//give the input argument otherwise it shows an error.
		System.out.println("This is print method with int arg");
		return 1;
	}
	static String print(String str) {		//give the input argument otherwise it shows an error.
		System.out.println("This is print method with string arg");
		return "A";					//we declare variable
	}								//Overload this method we change input arg


	public static void main(String[] args) {

		mo.print(1);
	}

}
