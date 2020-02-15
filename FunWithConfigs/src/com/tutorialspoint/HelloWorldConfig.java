package com.tutorialspoint;
import org.springframework.context.annotation.*;


//this @nnoation tells the computer that this class will serve as a source
//of bean defs
@Configuration
public class HelloWorldConfig {

	
	//private String message;
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
	
	
	
}
