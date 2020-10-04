package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Executor {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
//			ApplicationContext ctx = new ClassPathXmlApplicationContext(
//					"ApplicationResourses.xml");
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
			IHello hello = (IHello)ctx.getBean("hello");
			hello.sayHello();
	}
	
}
