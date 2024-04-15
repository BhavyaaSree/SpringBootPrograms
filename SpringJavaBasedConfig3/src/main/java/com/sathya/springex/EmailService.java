package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	@Override
	public void message() {
		
	
		System.out.println("your email is ready");
		System.out.println("check once your email");
		
	}

}
