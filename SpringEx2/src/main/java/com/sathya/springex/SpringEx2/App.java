package com.sathya.springex.SpringEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        Traveller traveller=context.getBean("Traveller",Traveller.class);
        traveller.startJourney();
        
    }
}
