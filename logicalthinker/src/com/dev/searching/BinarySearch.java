package com.dev.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,4,6,9,15,23,35};
		System.out.println(binarySearch(arr,0,arr.length-1,23));

	}
	
	//Recursive solution
	public static int binarySearch(int[] arr,int low,int high,int data) {
		
		int mid = (low+high)/2;
		if(low<=high) {
			if(arr[mid] == data) {
				return mid;
			}
			else if(arr[mid]< data ) {
				return binarySearch(arr,mid+1,high,data);
			}
			else {
				return binarySearch(arr,low,mid-1,data);
			}
		}
		return -1;
		
	}

}
