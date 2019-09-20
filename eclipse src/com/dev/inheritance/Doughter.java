package com.dev.inheritance;

public class Doughter extends Father {   //it wont allow to extend two classes at a time.
	static Doughter d = new Doughter();
	
	static GrandFather d1 = new Doughter();
	
//	static GrandFather d2 = new Doughter();	// upcasting
//	Doughter d3 = (Doughter) new GrandFather();	//downcasting	//it throws exception
	
	
	
	@Override
	public void printName() {
		String name = "sansa";
		System.out.println(name+" "+d.name+" "+d.lastName);
	}
	public static void main(String[] args) {
		d.printName();

	}

}
