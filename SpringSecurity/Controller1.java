package org.padmini.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 
{
	@GetMapping("/")
	public String greetEveryone()
	{
		return "Hello EveryOne .....!!!";
	}
	
	@GetMapping("/user")
	public String greetUser()
	{
		return "Hello User....!!!!";
	}
	
	@GetMapping("/admin")
	public String greetAdmin()
	{
		return "Hello Admin.....!!!!";
	}
}
