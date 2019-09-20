package com.dev.constructor;

public class ConstructorExample {


			public ConstructorExample() {			//default constructor
				System.out.println("This const is with no-arg");
			}
			public ConstructorExample(int j,char c) {				//parameterised constructor
				System.out.println("This const is withint and char arg");
			}
			
			public ConstructorExample(String s,char d) {				//parameterised constructor
				System.out.println("This const is with string and char arg");
			}
			public ConstructorExample(boolean s,int i) {			//parameterised constructor with 2 input args
				System.out.println("This const is with boolean and int arg");
			}
			public ConstructorExample(int i,String s,long l) {			//parameterised constructor with 2 input args
				System.out.println("This const is with string ,int and long arg");
			}
			
			public static void main(String[] args) {
				ConstructorExample ce = new ConstructorExample();
				ConstructorExample ce1 = new ConstructorExample(3,'C');
				ConstructorExample ce2 = new ConstructorExample("Apple",'D');
				ConstructorExample ce3 = new ConstructorExample(true,1);
				ConstructorExample ce4 = new ConstructorExample(1,"A",560);
			}

}
