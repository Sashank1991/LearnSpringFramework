package org.Sashank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Greeting greet=(Greeting) context.getBean("greeter");
		System.out.println( greet.getGreeting());
		

	}

}
