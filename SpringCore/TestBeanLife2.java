package org.padmini.springcore;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLife2 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring8-2.xml");
		context.registerShutdownHook();
		BeanLife2 b1=(BeanLife2)context.getBean("beanLife2");
		b1.life();

	}

}
