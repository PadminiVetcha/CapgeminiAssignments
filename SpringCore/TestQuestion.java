package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		Question q1=(Question)context.getBean("question");
		q1.printQuestion();

	}

}
