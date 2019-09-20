
package com.dev.ass;

import java.util.HashMap;

public class EmployeeData {

	public static void main(String[] args) {
		HashMap<String, Employee> hm = new HashMap<String, Employee>();
		
		Employee e = new Employee();
		e.setEmpid(1);
		e.setEname("Ramya");
		e.setEmail("ramya@gmail.com");
		e.setPassword("ram123");
		e.setSalary(98700.56);
		
		Employee e1 = new Employee();
		e1.setEmpid(2);
		e1.setEname("Jayanthi");
		e1.setEmail("jayanthi@gmail.com");
		e1.setPassword("ram2345");
		e1.setSalary(98763.23);
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setEname("varshini");
		e2.setEmail("varshini@gmail.com");
		e2.setPassword("jutrvaser");
		e2.setSalary(345627.89);
		
		hm.put("1", e);
		Employee b = hm.put("1", e1);
		System.out.println(b);
		
		hm.put("2", e1);
		System.out.println(hm);
		
		hm.put("3", e2);
		System.out.println(hm);
		
		hm.getClass();
		System.out.println(hm);
		
		System.out.println("Output of containsKey(): "
				+hm.containsKey(2));
		
		Employee p = hm.remove("1");
		System.out.println(p);
		
		System.out.println("Output of containsValue(): "
				+hm.containsValue(e2));
	}

}
