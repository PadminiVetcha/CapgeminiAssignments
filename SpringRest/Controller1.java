package org.padmini.springrest.SpringRestAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@GetMapping("/greet")
	public String Greetings()
	{
		return "Hello World!!! This is padmini........";
	}
}
