package org.padmini.springrest.customer;

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
public class CustomerController 
{
	@Autowired
	private CustomerService custSer;
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomer()
	{
		return custSer.getAllCustomer();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Integer id)
	{
		return custSer.getCustomer(id);
	}
	
	@PostMapping("/customer")
	public void addCustomer(@RequestBody Customer cus)
	{
		custSer.addCustomer(cus);
	}
	
	@PutMapping("/customer/{id}")
	public void updateCustomer(@PathVariable Integer id,@RequestBody Customer cus)
	{
		custSer.updateCustomer(id,cus);
	}
	
	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable int id)
	{
		custSer.deleteCustomer(id);
	}
}
