package com.dev.practice;

public class EmployeeData {
	
		public static void main (String []args) {
			Employee s= new Employee();
			s.setId(74);
			s.setName("Ramya");
			s.setEmail("ramya@gmail.com");
			s.setPassword("1234");
			
			Employee s1= new Employee();
			s1.setId(75);
			s1.setName("varshini");
			s1.setEmail("varshini@gmail.com");
			s1.setPassword("9876");
			
			Employee s2= new Employee();
			s2.setId(76);
			s2.setName("mahi");
			s2.setEmail("mahi@gmail.com");
			s2.setPassword("5674");
			
			System.out.println("id: "+s.getId());
			System.out.println("name: "+s.getName());
			System.out.println("email: "+s.getEmail());
			System.out.println("********************************");
			
			
		}
		

	}

