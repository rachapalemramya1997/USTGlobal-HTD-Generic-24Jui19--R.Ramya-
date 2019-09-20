package com.dev.encapsulation;

public class Student implements Comparable<Student> {
	private int regno;
	private String name;
	private String email;
	private String password;
	//go to source generate getter and setters.it shows dialog box in that select all except password getter.
	public int getRegno() {
		return regno;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	public void setRegno(int regno) {
		this.regno = regno;
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
	public int compareTo(Student o) {
		
		return (this.regno - o.regno);
	}
}
