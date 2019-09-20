package com.dev.exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			s();
			System.out.println("No Exception for s() ") ;
			int res = divide(10,0);
			System.err.println("No Exception for divide() ");		//we write err inplace of out it displays red color error message in normal black colour.
			System.err.println(res);
			
//			we use multiple catch blocks we write catch(Exception e) exception only at last catch block otherwise it shows error.
		
		}catch (NegativeArraySizeException e) {			//we write exception in 1st catch block it shows error
			System.err.println("Exception Caught in catch block");
			System.err.println("getMessage(): "+e.getMessage());
			e.printStackTrace();
		}catch(ArithmeticException e) {		//we write exception in last catch block it doesn't shows error
			System.out.println("Exception Caught in catch block");
			System.out.println("getMessage(): "+e.getMessage());
		}finally {
			System.out.println("FInally Block");
		}

	}

	private static int divide(int i, int j) {
		int res = i/j;
		System.out.println(res);
		return 0;
	}

	private static void s() {
		StringBuffer sb = new StringBuffer(-1);
		
	}

}
