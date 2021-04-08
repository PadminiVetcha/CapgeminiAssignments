package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
		Customer c1=(Customer)context.getBean("customer");
		c1.printDetails();
	}

}
