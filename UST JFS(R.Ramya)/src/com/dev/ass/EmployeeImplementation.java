

package com.dev.ass;

import java.util.HashMap;

public class EmployeeImplementation implements EmployeeInterface {

	HashMap<String, Employee> hm = new HashMap<String, Employee>();

	@Override
	public boolean addEmployee(Employee emp) {
		if (emp != null) {
			hm.put("1", emp);
		}
		return true;
	}

	@Override
	public boolean updateEmployee() {
		return true;
	}

	@Override
	public void getEmployee() {
		System.out.println("Successfull");
	}

	@Override
	public boolean removeEmployee(Employee emp) {
		return false;
	}

	@Override
	public boolean containsKey() {
		return true;
	}

	@Override
	public boolean containsValue() {
		return true;
	}

	@Override
	public String put(String string, Employee e) {
		return null;
	}
}