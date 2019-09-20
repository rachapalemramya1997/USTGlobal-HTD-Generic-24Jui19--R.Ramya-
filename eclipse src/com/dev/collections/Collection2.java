package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class Collection2 {
	public static void main(String[] args) {
		HashMap<String, Dog> hm = new HashMap<String, Dog>();
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("DoberMam");
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
		
		hm.put("1", d);
		hm.put("1", d1);
		hm.put("1", d2);
		System.out.println(hm);
//		Dog b = hm.put("1", d);
//		Dog b1 = hm.put("1", d1);
//		Dog b2 = hm.put("1", d2);
//		System.out.println(b);
//		
		Dog f = hm.remove("2");
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("Output of containsKey : "+hm.containsKey("1"));
		
		System.out.println("Output of containsValue : "+hm.containsValue("2"));
		
	}
}
