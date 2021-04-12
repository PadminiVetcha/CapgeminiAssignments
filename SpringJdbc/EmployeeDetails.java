package org.padmini.springjdbc.model;

public class EmployeeDetails {

	private int Emp_id;
	private String Name;
	private int Age;
	private String Designation;
	private int Dept_Code;
	private String Manager;
	
	
	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(int emp_id, String name, int age, String designation, int dept_Code, String manager) {
		super();
		Emp_id = emp_id;
		Name = name;
		Age = age;
		Designation = designation;
		Dept_Code = dept_Code;
		Manager = manager;
	}
	
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name ) {
		Name =name ;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getDept_Code() {
		return Dept_Code;
	}
	public void setDept_Code(int dept_Code) {
		Dept_Code = dept_Code;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [Emp_id=" + Emp_id + ", Name=" + Name + ", Age=" + Age + ", Designation=" + Designation
				+ ", Dept_Code=" + Dept_Code + ", Manager=" + Manager + "]";
	}
	
	
}
