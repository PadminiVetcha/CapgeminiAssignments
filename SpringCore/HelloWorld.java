package org.padmini.springcore;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld  implements ApplicationContextAware
{

	private ApplicationContext context=null;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}
	
	public void wish()
	{
		System.out.println("Hello World!!!!!!");
	}
	
}
