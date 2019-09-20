//single inheritance
package com.dev.inheritance;

public class Father extends GrandFather{
	//static Father f = new Father(); 	//we change 13,18 lines
	static Son s = new Son();

	//	String name = "Edard"; 		//declared globally outside the method	//output like edard edard stark

	@Override
	public void printName() {
		String name = "Edard";    	//we declared locally inside the method	//output like edard Torrhen stark
		System.out.println(name+" "+super.name+" "+s.lastName);    //f.last name

		super.printName();		//add 13 s.lastname 19 6
	}
	public static void main(String[] args) {
		//f.printName();
		s.printName();
	}

}
