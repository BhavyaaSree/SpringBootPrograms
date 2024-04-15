package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	//Start the IOC container
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	//get the bean 
    	Student student = context.getBean("student",Student.class);
    	student.details();
    }
}
