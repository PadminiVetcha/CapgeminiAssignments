package org.padmini.springjdbc.dao;

import java.util.Collection;
import java.util.List;
import org.padmini.springjdbc.model.EmployeeDetails;

public interface EmployeeDetailsDao
{
	//public void insert(EmployeeDetails empDetails);
	//public List<EmployeeDetails> getAllEmployees();
	//public int findTotalEmployees();
	//public EmployeeDetails getEmployeeDetails(int empid);
	//public EmployeeDetails findEmployeeDetailsById(int empid);
	//public int updateEmployeeDetailsOnEmpId(int age,String descr,String manager,int empid);
	//public int updateEmployeeDetailsOnEmpId(String descr,int deptcode,String manager,int empid);
	//public boolean ifEmployeeExists(String name);
	public List<EmployeeDetails> getEmployeeDetailsRowMapper();
}
