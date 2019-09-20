package com.dev.abstraction;

public class AbstractionC extends AbstractExample{
	//AbstractExample ae = new AbstractExample();		//not giving Object to abstract class it shows error

	public static void main(String[] args) {
		AbstractionC a= new AbstractionC();
		a.display();
		a.show();

	}
	
	@Override
	void display() {
		System.out.println("This is implemented abstract class");
	}
	public AbstractionC() {
		System.out.println("Const of abstraction class");	
	}

}
