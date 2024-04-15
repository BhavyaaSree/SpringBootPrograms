package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.sathya.springex")
public class JavaConfig {
	
	
	
	//1.@component annotations in the email service class and we can delete the bean
	/*@Bean
	public EmailService emailService()
	{
		EmailService emailService = new EmailService();
		return emailService;
		
	}*/
	
	
	//@component annotations in the java course service class and we can delete the bean
	/*@Bean
	public JavaCourseService javaCourseService()
	{
		JavaCourseService javaCourseService = new JavaCourseService();
		return javaCourseService;
		
	}*/
	
	//@component annotations in the Student service class and we can delete the bean
	/*@Bean
	public Student student()
	{
		Student student = new Student();
		
		//we are setting email,java course to student
		student.setEmailService(emailService());
		student.setJavaCourseService(javaCourseService());
		return student;
	}*/
	
	//2. By Using constructor-directly objects are injected
	
	/*@Bean
	public Student student()
	{
		Student student = new Student(emailService(),javaCourseService());
		return student;
	}*/
	
	
}
