package com.dev.collections;
import java.util.HashSet;
import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class Collection1 {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();
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
		
		d.setAge(1);
		d1.setAge(2);
		d2.setAge(5);
		
		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b3 = hs.add(d2);
		System.out.println("Output of add() : "+b+" "+b1+" "+b3 );
		
		for (Dog dog : hs) {		//foreach loop we use for hashmaps not for maps
			System.out.println(dog);
		}
		
//		System.out.println(hs);	//It prints output in one line
		
//		System.out.println("Size of Hashset before remove is : "+hs.size());
//		
//		boolean b2 = hs.remove(d);
//		System.out.println("Output of remove() : "+b2);
//		System.out.println(hs);		
//		
//		//boolean b4 = hs.contains(d);
//		System.out.println("Output of contains() : "+hs.contains(d));
//		//System.out.println(hs);	
//		
//		System.out.println("Size of HashSet after remove is : "+hs.size());
//		
//		hs.clear();
//		System.out.println("Size of Hashset after clear method  is : "+hs.size());
//		
	}

}
