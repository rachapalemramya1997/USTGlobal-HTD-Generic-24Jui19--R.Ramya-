package com.dev.ass;

public interface EmployeeInterface {
	
	    public boolean addEmployee(Employee emp);	
		public boolean updateEmployee();
	    public void getEmployee();
	    public boolean removeEmployee(Employee emp);
		public boolean containsKey();
		public boolean containsValue();
		public String put(String string, Employee e);
		
}
