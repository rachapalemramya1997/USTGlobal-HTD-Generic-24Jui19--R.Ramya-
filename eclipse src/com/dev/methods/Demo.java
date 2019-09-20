package com.dev.methods;

import com.dev.encapsulation.Dog;

public class Demo {
	Dog d = new Dog();			//two classes with the same name (Dog) in different packages
//Dog first class we import one package and another we use fully qualified class
	com.dev.constructor.Dog d1 = new com.dev.constructor.Dog();		//fully qualified class

	final static int INT=10;
	
	final static void print() {
		System.out.println("Methods");
	}
	public static void main(String[] args) {
		System.out.println(INT);
		// INT = 13;	reinitialisation is not possible for final.
	}
}
