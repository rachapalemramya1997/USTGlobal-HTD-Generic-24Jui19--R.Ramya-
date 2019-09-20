package com.dev.encapsulation;

public class PetData {

	public static void main(String[] args) {
		Pets d1 = new Pets();
		Pets d2 = new Pets();
		Pets d3 = new Pets();
		Pets d4 = new Pets();
		
		
		d1.setAge(2);
		d1.setBreed("Rabbit");
		d1.setColor("white");
		d1.setName("ruby");
		
		d2.setAge(4);
		d2.setBreed("German shepard");
		d2.setColor("Brown");
		d2.setName("spike");
		
		d3.setAge(3);
		d3.setBreed("cat");
		d3.setColor("Black & white");
		d3.setName("sweety");
		
		d4.setAge(7);
		d4.setBreed("jersy");
		d4.setColor("cream and white");
		d4.setName("lakshmi");
		
		Pets [] petAnimals = {d1,d2,d3,d4};
		
		for(int i=0;i<petAnimals.length;i++) {
			System.out.println("age: "+petAnimals[i].getAge());
			System.out.println("breed: "+petAnimals[i].getBreed());
			System.out.println("color: "+petAnimals[i].getColor());
			System.out.println("name: "+petAnimals[i].getName());
			System.out.println("*************************************");
		}
		

	}

}
