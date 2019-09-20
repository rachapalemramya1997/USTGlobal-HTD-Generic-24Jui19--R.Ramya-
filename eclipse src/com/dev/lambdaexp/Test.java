package com.dev.lambdaexp;

public class Test {
	
	public static void main(String[] args) {
		FuncInt f = () -> {		//body part of lambda expression
//			for ( int i=1; i<=10;i++) {
//				System.out.println("i = "+i);
//			}
			
//			int c=10/0;		//it throws exception inside lambda expression also
//			System.out.println(c);
			
			try {		//use try and catch blocks inside lambda expression also
				int i=10/0;
				System.out.println(i);
			}catch(Exception e) {
				System.out.println("Exception");
			}
		};		//closes body part
		
		FunctInt2 f2 = (i) -> {		//body part of lambda expression
			for ( int j=1; j<=10;j++) {
				System.out.println(j);
			}
		};
		
		f.printVal();
		f2.printVal2(0);
	}

}
