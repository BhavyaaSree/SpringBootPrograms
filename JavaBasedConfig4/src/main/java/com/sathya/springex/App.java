package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the container
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        // getting the object
         Patient patient= context.getBean("patient",Patient.class);
         patient.details();
}
}
