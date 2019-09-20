package com.dev.strings;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Some_String"; //11characters include space
		String str1 = "some_String";
		
		int length = str.length();
		System.out.println("Total length of string: "+length);
		
		char[] ch = str.toCharArray();
		System.out.println("letter of index no 10: "+ch[10]);
		//converts whole string into new character array
		
		char c = str.charAt(5);			//we pass index values in charAt
		System.out.println("Output for charAt()"+c);
		
		boolean b = str.equals(str1);		//it compares str and str1 with equal operator,it displays boolean values.
		System.out.println("Output for equals()"+b);
		
		boolean b1 = str.equalsIgnoreCase(str1); //both strings must equal length.it is case insensitive.it gives boolean values.
		System.out.println("Output for equal ignore case: "+b1);
		
		boolean v = str.contains("Som");			//it checks this content (som) is present in str or not
		System.out.println("Output for contains()"+v);
		
		String g = str.replace('S','A');		//it replaces old character to new char.
		System.out.println("Output for replace()"+g);
		
		int f = str.indexOf('z'); //z is not present in that str it displays -1
		System.out.println("Output for indexOf()"+f);
		
		int z = str.indexOf('o');	//it displays index of that particular character
		System.out.println("Output for indexOf()"+z);
		
		String s = str.toUpperCase();	//it converts all string to upper case.
		System.out.println("Output for toUpperCase()"+s);
		
		String h = str.toLowerCase();	//it converts all string to lower case.
		System.out.println("Output for toLowerCase()"+h);
		
		String a = str.substring(3);	//it starts at that point and written upto end.
		System.out.println("Output for substring(begin index): "+a);
		
		String q = str.substring(3, 9 );	//it starts printing at that starting point to ending point.
		System.out.println("Output for substring(int,int): "+q);
		
		
		
	}

}
