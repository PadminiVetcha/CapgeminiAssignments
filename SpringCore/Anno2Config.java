package org.padmini.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class Anno2Config {
	
	@Autowired
	private Anno2 anno2;
	
	public void TextEditor() {
		System.out.println("Inside text editor");
	}
	
	public Anno2 getAnno2() {
		return anno2;
	}
	
	public void checking()
	{
		anno2.check();
	}
	
	
	
}
