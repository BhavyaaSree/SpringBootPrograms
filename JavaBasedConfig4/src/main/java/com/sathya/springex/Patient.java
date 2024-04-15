package com.sathya.springex;

public class Patient {
	
	String name;
	int age;
	
	private Doctor doctor;
	private Phamarcy phamarcy;
	public Patient(String name, int age, Doctor doctor, Phamarcy phamarcy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.phamarcy = phamarcy;
	}
	
	public void details() {
		
		doctor.doctorInfo();
		phamarcy.pharInfo();
	}
	

}
