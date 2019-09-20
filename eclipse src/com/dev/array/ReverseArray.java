package com.dev.array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,60};
		int[] rev = new int[5];
		int k=0;
		System.out.println("Original array elements : ");
		for(int i=0;i<=a.length-1;i++) {		//for displaying original array
			System.out.print(a[i]+" ");
		}
		for(int i=a.length-1;i>=0;i--) {		//for reversing array
			rev[k] = a[i];
			k++;
		}
		System.out.println();
		System.out.println("Reversed array elements: ");
		for(int i=0;i<=a.length-1;i++) {		//for displaying reversed array
			System.out.print(rev[i]+" ");
		}

	}

}
