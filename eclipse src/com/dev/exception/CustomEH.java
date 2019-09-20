package com.dev.exception;

public class CustomEH extends CustomException   {

	public static int divide(int i,int j){
		int res=i/j;
		return res;
	}
	public static void display()  {
		StringBuffer s1 = new StringBuffer(-1);
	}
	
	public static void main(String[] args) throws CustomException {
		try {
			display();
			System.out.println("No Exception for display()");
			int res=divide(10,0);
			//System.exit(0);
			System.out.println("No Exception for divide() with 2-args");
			System.out.println(res);
		}
		
		/*
		 * 1. If we have multiple catch block we can't write
		 * 	  Exception class as 1st parameter
		 * 2. We can have that Exception class in last catch block.
		 */
		
		catch(NegativeArraySizeException e) {
			System.err.println("Exception caught for NegativeArraySizeException");
			System.err.println("getMessage():"+e.getMessage()); 
			//e.printStackTrace();	
		}
		catch(ArithmeticException e) {
			System.err.println("Exception caught for ArithmeticException ");
			System.err.println("getMessage():"+e.getMessage()); 
			//e.printStackTrace();	
		}
		finally {
			System.out.println("Finally Block");
		}
		
	}
}
