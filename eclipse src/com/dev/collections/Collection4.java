package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class Collection4 {

	public static void main(String[] args) {
		ArrayList<Dog> arl = new ArrayList<Dog>(2);
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setName("shiro");
		d.setColor("Black");
		
		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setName("puppy");
		d1.setColor("Black & white");
		
		Dog d2 = new Dog();
		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setName("nikky");
		d2.setColor("white");
		
		arl.add(d);
		arl.add(d1);
		arl.add(d2);
		
		System.out.println(arl);
		
		arl.trimToSize();
		
		System.out.println("Size of arraylist after trimToSize() :"+arl.size());

	}

}
