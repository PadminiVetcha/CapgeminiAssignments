package org.padmini.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignmentApplication.class, args);
	
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password1 = "padminiuser";
		String encodedPassword1 = passwordEncoder.encode(password1);
		System.out.println();
		System.out.println("Password is         : " + password1);
		System.out.println("Encoded Password is : " + encodedPassword1);
		
		String password2 = "padminiadmin";
		String encodedPassword2 = passwordEncoder.encode(password1);
		System.out.println();
		System.out.println("Password is         : " + password2);
		System.out.println("Encoded Password is : " + encodedPassword2);
	}

}
