package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Student;

public class EmployeeCollection3 {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		
		Student s = new Student();
		s.setRegno(1591120274);
		s.setName("Ramya");
		s.setEmail("ramya@gmail.com");
		s.setPassword("1234");

		Student s1 = new Student();
		s1.setRegno(1591120275);
		s1.setName("varshini");
		s1.setEmail("varshini@gmail.com");
		s1.setPassword("9876");
		
		Student s2 = new Student();
		s2.setRegno(1591120276);
		s2.setName("mahi");
		s2.setEmail("mahi@gmail.com");
		s2.setPassword("5674");
		
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		
		System.out.println(ts);

	}

}
