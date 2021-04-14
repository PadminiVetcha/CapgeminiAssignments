package org.padmini.springrest.user;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User 
{
	@Id
	private int userId;
	
	private String userName;
	
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public int getEmpId() {
		return userId;
	}
	public void setEmpId(int userId) {
		this.userId = userId;
	}
	public String getEmpName() {
		return userName;
	}
	public void setEmpName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
}
