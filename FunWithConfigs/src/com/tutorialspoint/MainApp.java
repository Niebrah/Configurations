package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld helloWorld = (HelloWorld) ctx.getBean(HelloWorld.class);
		
		
		helloWorld.setMessage("Good Morning!");
		helloWorld.getMessage();
	}

}
