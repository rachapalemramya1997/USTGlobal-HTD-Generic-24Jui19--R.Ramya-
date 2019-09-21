package com.dev.gmail;

public class Account {

	private int User_id;
	private String User_Name;
	private String Password;
	private String Email;

	@Override
	public String toString() {
		return "Account [User_id=" + User_id + ", User_Name=" + User_Name + ", Password=" + Password + ", Email="
				+ Email + "]";
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}



}
