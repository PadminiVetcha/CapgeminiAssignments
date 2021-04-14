package org.padmini.springrest.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int empId;
	private String empName;
	private String empDept;
	private String empDesig;
	private int empSal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
}
