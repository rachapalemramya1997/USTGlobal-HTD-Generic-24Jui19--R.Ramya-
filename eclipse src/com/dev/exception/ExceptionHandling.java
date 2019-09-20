package com.dev.exception;

public class ExceptionHandling {

	

	public static void display() {
		StringBuffer s1 = new StringBuffer(-1);
	}

	public static void main(String[] args) {
		System.out.println("program starts...............");
		try {
			display();
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}

		finally {
			System.out.println("this is finally block...");
		}

		System.out.println("program ends"); // exception has been handled
	}

}
