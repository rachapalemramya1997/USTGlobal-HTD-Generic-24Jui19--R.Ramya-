package com.dev.polymorphism;

public class CompileTime {
	static CompileTime ct = new CompileTime();
	public static void main(String[] args) {



		ct.operation(10,20,30);

	}

	public int operation(int a,int b,int c,int d) {
		int p=a+b+c+d;
		System.out.println("Addition of two numbers: "+p);
		return p;
	}
//	private int operation(int a) {			//private  methods are overloaded
//		int q=0-a;
//		System.out.println("subtraction of two numbers: "+q);
//		return q;
//	}
	final int operation(int a,int b,int c) {		//final methods are overloaded
		int m=a*b;
		System.out.println("multiplition of two numbers: "+m);
		return m;
	}
	final float operation(float a,float b) {
		float c=a/b;
		System.out.println("division of two numbers: "+c);
		return c;
	}
	public int operation(int a,int b) {
		int l=a%b;
		System.out.println("modulodivision of two numbers: "+l);
		return l;
	}

}
