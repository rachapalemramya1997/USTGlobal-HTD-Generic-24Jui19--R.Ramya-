package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thread started ");
		
		Thread2 t2 = new Thread2();
		t2.setName("Thread Thread2");	//we add thread name
		t2.setPriority(1);
		t2.start();
		
//		new Thread2().start();	//in 1 line create object and initialize
//		create an object of thread2 because start method is non static
		
		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		t.start();
		
		Thread.currentThread().setName("Main Thread");
		
//		new Thread(new Thread3()).start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("i ="+i);
		}
		
		System.out.println("Thread Name2: "+t2.getName());	//for getting threadName
		System.out.println("Thread Name1 :"+Thread.currentThread().getName());
		
		System.out.println("Thread id 2: "+t2.getId());	//for getting threadName
		System.out.println("Main Thread id  :"+Thread.currentThread().getId());
		System.out.println("Thread id 3 : "+t.getId());
		
		System.out.println("Thread priority 2 : "+t2.getPriority());
		System.out.println("Thread priority 3 : "+t3.getPriority());
		System.out.println("Main thread ended");

	}

}
