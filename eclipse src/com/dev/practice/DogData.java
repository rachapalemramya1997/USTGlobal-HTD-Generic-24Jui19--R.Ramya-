package com.dev.practice;


public class DogData {

	public static void main(String[] args) {
		DogInitImp dii = new DogInitImp();
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		
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
		
		boolean b = dii.addData(d1);
		boolean b1 = dii.addData(d2);
		System.out.println("d1(add) : "+ b +" "+"d2(add) : " +b1);
		
		dii.getData();
		
		boolean f = dii.removeData(d1);
		System.out.println(f);
		
		

	}

}
