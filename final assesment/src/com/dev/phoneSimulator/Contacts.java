package com.dev.phoneSimulator;

public class Contacts {
	private String Name;
	private long Number;
	private String Group;
	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", Number=" + Number + ", Group=" + Group + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long number) {
		Number = number;
	}
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}



}
