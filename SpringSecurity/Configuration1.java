package org.padmini.springsecurity.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class Configuration1 extends WebSecurityConfigurerAdapter 
{
	@Autowired
	DataSource dataSource;
	
	@Autowired
	private PasswordEncoder encoder; 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		
		  auth.inMemoryAuthentication()
		  .withUser("padmini").password(encoder.encode("padminiuser")).roles("USER") .and()
		  .withUser("padminivetcha").password(encoder.encode("padminiadmin")).roles("ADMIN");
		 
		/* auth.jdbcAuthentication().dataSource(dataSource); */
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin().loginPage("/login")
		.and().rememberMe().key("rem-me-key")
		.rememberMeParameter("remember")
		.rememberMeCookieName("rememberlogin")
		.tokenValiditySeconds(100)
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	/*
	 * @Bean public PasswordEncoder getPasswordEncoder() { return
	 * NoOpPasswordEncoder.getInstance(); }
	 */
	
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	  public void encode(String password) 
	  { 
		  for(int i=0;i<10;i++) 
		  {
			  BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder(); String
			  encodedPwd=passwordEncoder.encode(password); 
			  System.out.println(encodedPwd);
		  }
	  }
}
