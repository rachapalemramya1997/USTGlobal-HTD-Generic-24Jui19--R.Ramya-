package com.dev.threads;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main thread started ");

		for(int i=1;i<=1000000;i++) {	//it takes lot of time to terminate
			System.out.println("i ="+i);
		}//it is not good for our application.
		//this necessity inspired people to create threads.
		
		for(int i=0;i<=10;i++) {
			System.out.println("i ="+i);
		}
		System.out.println("Main thread ended");

	}

}
