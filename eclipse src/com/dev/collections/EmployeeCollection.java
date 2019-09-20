package com.dev.collections;
import java.util.HashSet;

import com.dev.encapsulation.Student;

public class EmployeeCollection {

	public static void main(String[] args) {
		HashSet<Student> h = new HashSet<Student>();
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
		
		boolean b = h.add(s);
		boolean b1 = h.add(s1);
		boolean b3 = h.add(s2);
		System.out.println("Output of add() : "+b+" "+b1+" "+b3 );
		System.out.println(h);
		System.out.println("Size of Hashset before remove is : "+h.size());
		
		boolean b2 = h.remove(s);
		System.out.println("Output of remove() : "+b2);
		System.out.println(h);		
		
		//boolean b4 = hs.contains(s);
		System.out.println("Output of contains() : "+h.contains(s));
		//System.out.println(h);	
		
		System.out.println("Size of HashSet after remove is : "+h.size());
		
		h.clear();		//it delete/drop 
		System.out.println("Size of Hashset after clear method  is : "+h.size());
		
	}

}
