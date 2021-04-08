package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testdb {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring6.xml");
		DatabaseConfigurations c1=(DatabaseConfigurations)context.getBean("databaseConfigurations");
		c1.getInfo();
	}
}
