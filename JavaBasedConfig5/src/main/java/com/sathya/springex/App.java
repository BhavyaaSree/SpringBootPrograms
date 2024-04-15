package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the container
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        // getting the object"
         Person person = context.getBean("person",Person.class);
         person.details();
}
}