package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {

	public static void main(String[] args) {
		
		 ApplicationContext ctx =  new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor obj = (TextEditor) ctx.getBean(TextEditor.class);
		obj.spellCheck();
	}

}
