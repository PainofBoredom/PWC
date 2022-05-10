package com.example.pwcspring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		GreetingsImpl gi = (GreetingsImpl)ctx.getBean("gi");
		
		gi.sayGreetings("amar");
		gi.sayHello("Manish", "Patna");
	}

}
