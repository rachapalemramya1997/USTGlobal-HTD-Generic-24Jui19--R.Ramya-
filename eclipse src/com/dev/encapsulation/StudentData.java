package com.dev.encapsulation;

public class StudentData {
	public static void main (String []args) {
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
		
//		int regno = s.getRegno();
//		System.out.println("Regno: "+regno);
		System.out.println("Regno: "+s.getRegno());
		System.out.println("name: "+s.getName());
		System.out.println("email: "+s.getEmail());
		System.out.println("********************************");
		
		
	}
	

}
