package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring5.xml");
		Circle c1=(Circle)context.getBean("circle");
		c1.getInfo();

	}

}
