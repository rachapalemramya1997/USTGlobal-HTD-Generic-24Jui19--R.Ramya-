package com.dev.array;

public class ArrayExample {

	public static void main(String[] args) {
	//declaration
		int []intArr;
		char[] charr;
		byte byteArr[];
	//creation	
		intArr = new int[5];
		charr = new char[5];
		byteArr = new byte[5];
	//Initialization	
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		int res=intArr[0]+3;
		System.out.println("addition: "+res);
		 res=intArr[1]-3;
		System.out.println("subtraction: "+res);
		 res=intArr[2]*3;
		System.out.println("multiplication: "+res);
		 res=intArr[3]/3;
		System.out.println("division: "+res);
		 res=intArr[4]%3;
		System.out.println("modulo: "+res);
		
		charr[0] = 'a';
		charr[1] = 'b';
		charr[2] = 'c';
		charr[3] = 'd';
		charr[4] = 'e';
		
		byteArr[0] = 10;
		byteArr[1] = 20;
		byteArr[2] = 30;
		byteArr[3] = 40;
		byteArr[4] = 50;

	}

}
