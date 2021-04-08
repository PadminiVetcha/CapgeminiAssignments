package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring4.xml");
		Anno2Config a1=(Anno2Config)context.getBean("anno2Config");
		a1.TextEditor();
		a1.checking();

	}

}
