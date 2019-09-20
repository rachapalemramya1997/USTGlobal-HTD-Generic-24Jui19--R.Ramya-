package com.dev.polymorphism;

public class RunTime {
	static RunTime r= new RunTime();
	String name = "Benz";
	String lastName = "car";

	public static void main(String[] args) {
		r.brand();
	}
	public void brand() {
		System.out.println(name+" "+r.lastName);
	}

}
