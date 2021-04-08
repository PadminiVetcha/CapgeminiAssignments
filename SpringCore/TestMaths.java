package org.padmini.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMaths {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.padmini.springcore");
		context.refresh();
		Maths ms=(Maths)context.getBean("ms");
		int a=ms.add(5, 10);
		System.out.println("Addition of 5 and 10 is: "+a);
		int b=ms.sub(11, 6);
		System.out.println("Subtraction of 11 and 6 is: "+b);
	}

}
