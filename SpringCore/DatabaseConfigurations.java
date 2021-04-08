package org.padmini.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class DatabaseConfigurations {
	private String driverclassname;
	private String dburl;
	private String username;
	private String password;
	@Value("padmini")
	 String name;
	
	
	public String getDriverclassname() {
		return driverclassname;
	}
	public void setDriverclassname(String driverclassname) {
		this.driverclassname = driverclassname;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void getInfo()
	{
		System.out.println("Driver class name is: "+driverclassname);
		System.out.println("Database url is: "+dburl);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Admin name is: "+name);
	}
	

}
