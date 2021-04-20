package org.padmini.springsecurity.controller; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
  
  @Controller 
public class Controller2 
{
   @GetMapping("/login") 
   public String login() 
   { 
	   return "Login"; 
   }
}
 