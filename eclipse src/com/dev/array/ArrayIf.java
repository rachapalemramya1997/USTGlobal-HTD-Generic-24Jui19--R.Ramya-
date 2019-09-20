package com.dev.array;

public class ArrayIf {

	public static void main(String[] args) {
		int index=2;

		int[] a= {11,22,33,44,55};
		

		if(index>0 && index<a.length) {		//display given index is present or not
			System.out.println("valid index");   
			for(int i=0;i<=index;i++) {
				System.out.println(a[i]);	//to display thAT INDEX ELEMENT
	
			}

		}else {
			System.out.println("invalid index");
		}
	}


}
