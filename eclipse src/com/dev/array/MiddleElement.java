package com.dev.array;

public class MiddleElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		if(a.length%2==0) {		//for even places
			System.out.println(a[a.length/2]);
			System.out.println(a[(a.length/2)-1]);
	
		}else {				//for odd places
			System.out.println(a[(a.length/2)]);
		}
		System.out.println("last before character is: "+a[a.length-2]);
			//for any position we want
	}

}
