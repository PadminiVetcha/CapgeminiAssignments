package org.padmini.springrest.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> li=new ArrayList<Employee>();
		empRepo.findAll().forEach(li::add);
		return li;
	}
	
	public Employee getEmployee(int id)
	{
		return empRepo.findById(id).get();
	}
	
	public void addEmployee(Employee emp)
	{
		empRepo.save(emp);
	}
	
	public void updateEmployee(int id,Employee emp)
	{
		empRepo.save(emp);
	}
	public void deleteEmployee(int id)
	{
		empRepo.deleteById(id);
	}
}
