package org.padmini.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLife3 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring8-3.xml");
		context.registerShutdownHook();
		BeanLife3 b1=(BeanLife3)context.getBean("beanLife3");
		b1.life();

	}

}
