package org.padmini.springcore;

public class BeanLife2 {
	
	public void myInit()
	{
		System.out.println("Initializing bean using init-method");
	}
	public void life(){
		System.out.println("Bean life cycle mtds using initializing and disposable bean ");
	}
	public void destroy()
	{
		System.out.println("Destroying bean using destroy-method");
	}
}
