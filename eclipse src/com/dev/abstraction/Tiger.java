package com.dev.abstraction;

public class Tiger extends Walk{

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.walkable();
		t.eat();
		t.hunt();
		

	}
	 void walkable() {
		 System.out.println("walkable ");
	 }
	@Override
	void eat() {
		System.out.println("eat ");
		
	}
	@Override
	void hunt() {
		System.out.println("hunt");
			}

}
