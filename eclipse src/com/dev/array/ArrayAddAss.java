package com.dev.array;

public class ArrayAddAss {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int sum = 0;
		int mid = a.length/2;			//Taking middle element
		int secondLast = a.length-2;	//Taking second last element
		sum = a[0]+a[mid]+a[secondLast];
		//System.out.println("printing sum of elements  ");
		System.out.println("sum : "+sum);
	}

}
