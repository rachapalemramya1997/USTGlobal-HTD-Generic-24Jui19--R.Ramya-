package com.dev.abstraction;

import java.io.Serializable;
import java.rmi.Remote;

@FunctionalInterface		//should not create any other abstract methods//Only one abstract method it allows
public interface Abs extends Serializable, Cloneable, Remote{	//marker interface we add Cloneable , serializable,remote
	void display();		//Abstract method has no body
	//void show();	it creates error
	
	static void print() {   //it should be declared with either static or default
		System.out.println("A");
	}
	static void print1() {   //it should be declared with either static or default
		System.out.println("A");
	}

}
