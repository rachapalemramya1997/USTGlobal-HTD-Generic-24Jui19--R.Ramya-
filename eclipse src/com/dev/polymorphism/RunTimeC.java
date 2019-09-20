package com.dev.polymorphism;

public class RunTimeC extends RunTime{
static RunTimeC c = new RunTimeC();

	public static void main(String[] args) {
		c.brand();

	}
	@Override
	public void brand() {
		String name = "Tata";
		System.out.println(name+" "+super.name+" "+r.lastName);
		super.brand();
	}

}
