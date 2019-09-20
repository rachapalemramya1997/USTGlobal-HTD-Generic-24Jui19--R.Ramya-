package com.dev.strings;

public class StringMethod2 {

	public static void main(String[] args) {
		String str = "Hai_Jspiders"; //11characters include space
		String str1 = "Hai_Qspiders";
	
		
		int length = str.length();
		System.out.println("Total length of string: "+length);
		
		char[] ch = str.toCharArray();
		System.out.println("letter of index no 10: "+ch[10]);
		//converts whole string into new character array
		
		char c = str.charAt(8);			//we pass index values in charAt
		System.out.println("Output for charAt()"+c);
		
		boolean b = str.equals(str1);		//it compares str and str1 with equal operator,it displays boolean values.
		System.out.println("Output for equals()"+b);
		
		boolean b1 = str.equalsIgnoreCase(str1); //both strings must equal length.it is case insensitive.it gives boolean values.
		System.out.println("Output for equal ignore case: "+b1);



	}

}
