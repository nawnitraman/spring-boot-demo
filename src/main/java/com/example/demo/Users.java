package com.example.demo;

public class Users {
	
	private String FirstName;
	private String LastName;
	private int Age;
	
	public Users(String firstName, String lastName, int age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Age = age;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	

}
