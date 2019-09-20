package com.dev.encapsulation;

public class DogData {
	

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		
		
		d1.setAge(1);
		d1.setBreed("dobourman");
		d1.setColor("cream");
		d1.setName("snoopy");
		
		d2.setAge(2);
		d2.setBreed("German shepard");
		d2.setColor("Brown");
		d2.setName("spike");
		
		d3.setAge(3);
		d3.setBreed("German shepard");
		d3.setColor("Black & Brown");
		d3.setName("puppy");
		
		d4.setAge(3);
		d4.setBreed("German shepard");
		d4.setColor("Black & Brown");
		d4.setName("puppy");
		
		
		Dog [] dogs = {d1,d2,d3,d4};
		
		for(int i=0;i<dogs.length;i++) {
//			System.out.println("age: "+dogs[i].getAge());
//			System.out.println("breed: "+dogs[i].getBreed());
//			System.out.println("color: "+dogs[i].getColor());
//			System.out.println("name: "+dogs[i].getName());
			//instead of writing these many lines we write Dog[i]
			System.out.println(dogs[i]);
			System.out.println("*************************************");
		}
		
		System.out.println(d4.equals(d3));
		System.out.println(d4.hashCode());
		System.out.println(d4.hashCode());
		
		
		
		
		
		

	}

}
