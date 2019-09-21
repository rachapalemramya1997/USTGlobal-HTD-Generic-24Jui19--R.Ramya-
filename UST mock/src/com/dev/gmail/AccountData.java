package com.dev.gmail;

import java.util.HashMap;


public class AccountData {

	public static void main(String[] args) {
		HashMap<String, Account> hm = new HashMap<String, Account>();
		Account a = new Account();
		a.setUser_id(1);
		a.setUser_Name("ramya");
		a.setPassword("ram");
		a.setEmail("ramya@gmail.com");

		Account a1 = new Account();
		a1.setUser_id(2);
		a1.setUser_Name("reddy");
		a1.setPassword("reddy");
		a1.setEmail("reddy@gmail.com");

		Account a2 = new Account();
		a2.setUser_id(3);
		a2.setUser_Name("mahi");
		a2.setPassword("mahi");
		a2.setEmail("mahi@gmail.com");

		System.out.println(".....Accounts.....");

		hm.put("1", a);
		hm.put("2", a1);
		hm.put("3", a2);
		System.out.println(hm);

		//		Account f = hm.remove("2");
		//		System.out.println(f);
		//		System.out.println(hm);

		System.out.println("Output of containsKey : "+hm.containsKey("1"));
		System.out.println("Output of containsValue(): "+hm.containsValue(a2));

	}
}
