package com.dev.abstraction;

public abstract class Walk extends Animal{

	public static void main(String[] args) {
		

	}
	
	public Walk() {				//for displaying output we take constructors
		System.out.println("constructor of walk class");
	}
	@Override
	void eat() {
		System.out.println("bird eats nuts ");
	}
	@Override
	void hunt() {
		System.out.println("bird hunts small insects");
	}

}
