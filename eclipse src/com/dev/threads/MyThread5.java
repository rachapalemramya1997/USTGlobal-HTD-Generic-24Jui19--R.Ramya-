package com.dev.threads;

public class MyThread5 extends Thread {
	
	MyPrinter p;
	
	public MyThread5(MyPrinter p2) {
		p = p2;
	}
	
	@Override
	public void run() {
		p.printVal(10, "Thread 5");
	}

}
