package com.dev.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {5,10,15,20,25};
		System.out.println(contains(arr,20));

	}
	public static boolean contains(int[] arr,int value) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value) {
				return true;
			}
		}
		return false;
	}

}
