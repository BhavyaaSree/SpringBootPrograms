package com.sathya.springex;

public class Phamarcy {
     
	String name;
	String location;
	
	public Phamarcy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void pharInfo() {
		System.out.println("pharmacy name"+name);
		System.out.println("phramacy location"+location);
	}
	
	
	
}
