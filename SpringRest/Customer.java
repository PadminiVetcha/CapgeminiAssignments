package org.padmini.springrest.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	private int custId;
	private String custName;
	
	public int getEmpId() {
		return custId;
	}
	public void setEmpId(int custId) {
		this.custId = custId;
	}
	public String getEmpName() {
		return custName;
	}
	public void setEmpName(String custName) {
		this.custName = custName;
	}
}
