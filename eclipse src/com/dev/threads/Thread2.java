package com.dev.threads;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("T2 thread started...");
		for(int j=0;j<=10;j++) {
			System.out.println("j ="+j);
		}
		System.out.println("T2 thread ended...");
	}
	


}
