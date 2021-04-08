package org.padmini.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Anno1Config {
	
	@Bean
	public Anno1 anno1()
	{
		return new Anno1();
	}
}
