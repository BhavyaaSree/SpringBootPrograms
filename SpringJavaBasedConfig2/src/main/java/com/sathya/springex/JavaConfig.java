package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean(name="T")
	public Person person()
	{
		Person person1 = new Person();
		person1.setName("Bhavya");
		person1.setEmail("bhavya@gmail.com");
		return person1;
		
	}
	
	@Bean
	public Person person2()
	{
		Person person2 = new Person();
		person2.setName("Tinku");
		person2.setEmail("Tinku@gmail.com");
		return person2;
	}
	
	@Bean
	public Person person3()
	{
		Person person3 = new Person();
		person3.setName("Satya");
		person3.setEmail("satya@gmail.com");
		return person3;
	}
	
}
