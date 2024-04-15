package com.sathya.springex;

public class Doctor {
   
	int id;
	String name;
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 public void doctorInfo() {
		  System.out.println("Doctor id:"+id);
		  System.out.println("Doctor name:"+name);
	 }
	
}
