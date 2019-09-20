package com.dev.threads;

public class Thread4 extends Thread {
	
	Printer p;
	
	public Thread4(Printer pref) {
		p = pref;
	}
	
	@Override
	public void run() {
//		for(int j=0;j<=10;j++) {
//			System.out.println("j = "+j);
//		}
		
//or		//p.printVal(10, "Thread 4");
		
		try {
			Thread.currentThread().sleep(500);
		}catch(Exception e) {
			System.out.println("Exception cought...");
		}
		p.printVal(10, "Thread 4");
	}

}
