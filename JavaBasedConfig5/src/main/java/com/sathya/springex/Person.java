package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private HomeloanService homeloanService;
	@Autowired
	private RealstateService realstateService;
	
	
	/*public Person(HomeloanService homeloanService, RealstateService realstateService) {
	 	super();
		this.homeloanService = homeloanService;
		this.realstateService = realstateService;
	}*/
	
	public void details() {
		homeloanService.loanInfo();
		realstateService.realstateInfo();
		
	}
	
	

}
