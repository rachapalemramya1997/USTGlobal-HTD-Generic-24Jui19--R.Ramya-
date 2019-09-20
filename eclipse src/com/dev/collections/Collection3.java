package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class Collection3 {

	public static void main(String[] args) {
		TreeSet<Dog> ts = new TreeSet<Dog>();
		Dog d = new Dog();
		d.setAge(10);
		d.setBreed("D M");
		d.setName("shiro");
		d.setColor("Black");
		
		Dog d1 = new Dog();
		d1.setAge(5);
		d1.setBreed("Dalmation");
		d1.setName("puppy");
		d1.setColor("Black & white");
		
		Dog d2 = new Dog();
		d2.setAge(7);
		d2.setBreed("Dalmation");
		d2.setName("nikky");
		d2.setColor("white");
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		
		System.out.println(ts);

	}

}
