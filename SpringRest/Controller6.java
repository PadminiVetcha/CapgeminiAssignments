package org.padmini.springrest.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/calculate")
public class Controller6 
{	

	@GetMapping(path="/add/{a}/{b}")
	public int add(@PathVariable("a") Integer x,@PathVariable("b") Integer y)
	{
		return x+y;
	}
	
	@GetMapping(path="/sub/{a}/{b}")
	public int sub(@PathVariable("a") Integer x,@PathVariable("b") Integer y)
	{
		return y-x;
	}
	
	@GetMapping(path="/mul/{a}/{b}")
	public int mul(@PathVariable("a") Integer x,@PathVariable("b") Integer y)
	{
		return x*y;
	}
	
	@GetMapping(path="/div/{a}/{b}")
	public int div(@PathVariable("a") Integer x,@PathVariable("b") Integer y)
	{
		return y/x;
	}
	
}
