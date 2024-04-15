package com.sathya.springex;


import  org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //Start the Container
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
    	
    	System.out.println("**************");	
    
    
    //get the object from container call your method
   GreetingImpl greetingImpl = context.getBean("greet", GreetingImpl.class);    
   greetingImpl.greet();
   
    }
}
