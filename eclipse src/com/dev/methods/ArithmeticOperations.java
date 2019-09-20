package com.dev.methods;

public class ArithmeticOperations {

	static ArithmeticOperations ao = new ArithmeticOperations();
	public static void main(String[] args) {

		ao.print(10,20,30);

	}

	public int print(int a,int b,int c,int d) {
		int p=a+b+c+d;
		System.out.println("Addition of two numbers: "+p);
		return p;
	}
	private int print(int a,short z) {			//private  methods are overloaded
		int q=a-z;
		System.out.println("subtraction of two numbers: "+q);
		return q;
	}
	public int print(int a,int b,int c) {		//final methods are overloaded
		int m=a*b;
		System.out.println("multiplition of two numbers: "+m);
		return m;
	}
	final float print(float a,float b) {
		float c=a/b;
		System.out.println("division of two numbers: "+c);
		return c;
	}
	public int print(int a,int b) {
		int l=a%b;
		System.out.println("modulodivision of two numbers: "+l);
		return l;
	}


}
