package com.dev.practice;

import java.util.HashSet;

public class DogInitImp implements DogInit{

	HashSet<Dog> hs = new HashSet<Dog>();

	@Override
	public boolean addData(Dog dog) {
		System.out.println("Adding Data");
		if(dog!=null) {
			hs.add(dog);
			return true;
		}
		return false;
	}
	@Override
	public void getData() {
		System.out.println("getting data: "+hs);
	}
	@Override
	public boolean removeData(Dog dog) {
		System.out.println("remove Data");
		hs.remove(dog);
		return true;
	}
}
