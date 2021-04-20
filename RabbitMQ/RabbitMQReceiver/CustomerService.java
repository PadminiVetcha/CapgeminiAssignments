package org.padmini.rabbitmq.customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository custRepo;
	
	public List<CustomerMgmt> getAllCustomer()
	{
		List<CustomerMgmt> li=new ArrayList<CustomerMgmt>();
		custRepo.findAll().forEach(li::add);
		return li;
	}
	
	public void addCustomer(CustomerMgmt cus)
	{
		custRepo.save(cus);
	}
}
