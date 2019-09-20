package com.dev.threads;

public class MySyncClass {
	

		public static void main(String[] args) throws InterruptedException {
			
			System.out.println("Sync main thread started....");
			
			MyPrinter p = new MyPrinter();
			
			MyThread4 t4 = new MyThread4(p);
			t4.start();
			t4.join();
			//new Thread4(p).start();
			new MyThread5(p).start();

			System.out.println("Sync main threaed terminated....");
		}
	}


