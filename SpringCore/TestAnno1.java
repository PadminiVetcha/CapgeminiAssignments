package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Anno1Config.class);
		Anno1 a1=context.getBean(Anno1.class);
		a1.setMsg("Hello ! How r u?");
		a1.getMsg();

	}

}
