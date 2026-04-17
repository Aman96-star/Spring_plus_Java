package com.nit;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	// here spring container is created
    	// it reads a appConfig.class file 
    	Address a = context.getBean(Address.class);
    	System.out.println(a);
    	
    	test te =context.getBean(test.class);
    	System.out.println(te);

    	
    }
}
