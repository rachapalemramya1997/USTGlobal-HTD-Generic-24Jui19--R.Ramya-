//single inheritance
package com.dev.inheritance;

public class GrandFather {
	static GrandFather g = new GrandFather();
	String lastName = "Stark";
	String name = "Torrhen";	//declared globally outside the method

	public static void main(String[] args) {
		g.printName();	
	}
	public void printName() {
		//		String name = "Torrhen";	//we declared locally inside the method //it call in father it shows an error
		System.out.println(name +" "+g.lastName);
	}

}
