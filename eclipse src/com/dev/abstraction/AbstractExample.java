package com.dev.abstraction;

public abstract class AbstractExample {
	abstract void display();			//abstract method of abstract class");
	

	public static void main(String[] args) {
		

	}
	public void show() {				//Concrete method of abstract class
		System.out.println("Concrete method of abstract class");
	}
	public AbstractExample() {				//Concrete method of abstract class
		System.out.println("Constructor of abstract class");
	}

}
