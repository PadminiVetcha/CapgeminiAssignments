package org.padmini.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.padmini.springjdbc.model.EmployeeDetails;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDetailsRowMapper  implements RowMapper<EmployeeDetails>
{

	public EmployeeDetails mapRow(ResultSet rs,int rowNum) throws SQLException
	{
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setEmp_id(rs.getInt("Emp_id"));
		empDetails.setName(rs.getString("Name"));
		empDetails.setAge(rs.getInt("Age"));
		empDetails.setDesignation(rs.getString("Designation"));
		empDetails.setDept_Code(rs.getInt("Dept_Code"));
		empDetails.setManager(rs.getString("Manager"));
		
		return empDetails;
	}
}
