package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Student;

public class CrudOperations {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		Student s= new Student();
		s.setRegno(1591120274);
		s.setName("Ramya");
		s.setEmail("ramya@gmail.com");
		s.setPassword("1234");

		Student s1= new Student();
		s1.setRegno(1591120275);
		s1.setName("varshini");
		s1.setEmail("varshini@gmail.com");
		s1.setPassword("9876");
		
		Student s2= new Student();
		s2.setRegno(1591120276);
		s2.setName("mahi");
		s2.setEmail("mahi@gmail.com");
		s2.setPassword("5674");
		
		hm.put("1", s);
		hm.put("2", s1);
		hm.put("3", s2);
		System.out.println(hm);
		
		Student f = hm.remove("2");
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("Output of containsKey : "+hm.containsKey("1"));
		
		//System.out.println("Output of containsValue : "+hm.containsValue("2"));

	}

}
