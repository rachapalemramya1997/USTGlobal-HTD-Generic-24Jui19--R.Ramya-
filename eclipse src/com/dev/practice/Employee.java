package com.dev.practice;

public class Employee implements Comparable<Employee> {
		private int id;
		private String name;
		private String email;
		private String password;
		//go to source generate getter and setters.it shows dialog box in that select all except password getter.
		public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setPassword(String  password) {
			this. password = password;
		}
		@Override
		public int compareTo(Employee o) {
			
			return (this.id - o.id);
		}
}

