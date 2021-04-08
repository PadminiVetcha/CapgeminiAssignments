package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLife1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring8-1.xml");
		context.registerShutdownHook();
		BeanLife1 b1=(BeanLife1)context.getBean("beanLife1");
		b1.life();

	}

}
