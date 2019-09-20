package com.dev.threads;

public class MyThread4 extends Thread {
	
	MyPrinter p;
	
	public MyThread4(MyPrinter p2) {
		p = p2;
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		}catch(Exception e) {
			System.out.println("Exception cought...");
		}
		p.printVal(10, "Thread 4");
	}

}
