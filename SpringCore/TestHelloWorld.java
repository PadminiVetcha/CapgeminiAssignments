package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring10.xml");
		HelloWorld h1=(HelloWorld)context.getBean("helloWorld");
		h1.wish();

	}

}
