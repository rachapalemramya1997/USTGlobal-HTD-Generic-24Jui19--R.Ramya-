package com.dev.strings;

public class ReverseString {
	public void reverse(String s) {
		System.out.println("Original String : "+s);
		String revS = "";		//we use empty string for storing reversed string
		for(int i =s.length()-1;i>=0;i--) {
			revS = revS + s.charAt(i);
		}
		System.out.println("reverse of string : "+revS);
	}

	public static void main(String[] args) {
		ReverseString s = new ReverseString();
		s.reverse("Rachapalem");
	}

}
