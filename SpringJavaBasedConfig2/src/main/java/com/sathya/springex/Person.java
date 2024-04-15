package com.sathya.springex;

public class Person {
	private String name;
	private String email;
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

	public void personInfo() {
		System.out.println("Hey"+" " +name+" " +"Welcome to Sathya tech");
		System.out.println("Your email "+email);
	}

}
