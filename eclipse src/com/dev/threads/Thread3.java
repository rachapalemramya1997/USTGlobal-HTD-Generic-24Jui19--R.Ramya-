package com.dev.threads;

public class Thread3 extends Thread {
	
	@Override
	public void run() {
		System.out.println("T3 thread started...");
		for(int k=0;k<=10;k++) {
			System.out.println("k ="+k);
		}
		System.out.println("T3 thread ended...");
	}
	

}
