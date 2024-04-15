package com.sathya.springex;

public class GreetingImpl implements Greeting {
	

	@Override
	public void greet() {
		System.out.println("This is Spring Java Based Configuration ");
		
	}
	public GreetingImpl() {
		System.out.println("GreetingImpl Constructor :: Object created");
	}

}
