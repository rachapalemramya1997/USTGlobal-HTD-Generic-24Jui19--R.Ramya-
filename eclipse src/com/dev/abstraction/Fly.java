package com.dev.abstraction;

public class Fly extends Animal{

	public static void main(String[] args) {
		Fly f = new Fly();
		f.eat();
		f.hunt();

	}
	@Override
	void eat() {
		System.out.println("bird eats nuts ");
	}
	@Override
	void hunt() {
		System.out.println("bird hunts small insects");
	}
	public Fly() {
	System.out.println("constructor of fly class");	
	}
	

}
