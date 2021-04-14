package org.padmini.springrest.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService empSer;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return empSer.getAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Integer id)
	{
		return empSer.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee emp)
	{
		empSer.addEmployee(emp);
	}
	
	@PutMapping("/employee/{id}")
	public void updateEmployee(@PathVariable Integer id,@RequestBody Employee emp)
	{
		empSer.updateEmployee(id,emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		empSer.deleteEmployee(id);
	}
}
