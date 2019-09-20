package com.dev.exception;

public class CustomException extends Exception{
	
	public CustomException() {
		System.out.println("No-arg exception");
	}
	public CustomException(int i) {
		System.out.println("int-arg exception");
	}
	
	public CustomException(String s) {
		System.out.println("string-arg exception");
	}
}
