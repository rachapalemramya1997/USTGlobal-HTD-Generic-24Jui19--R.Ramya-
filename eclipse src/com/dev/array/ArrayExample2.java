package com.dev.array;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intArr = new int[5]; //declaration and creation
		
		intArr[0] = 1;  //Initialization
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		int res = intArr[1] *3;
		System.out.println(res);
		
		int[] intArr2 = {11,22,33,44,55};
		System.out.println(intArr2[2]); 
		System.out.println("Length of the 2nd array: "+intArr2.length);

	}

}
