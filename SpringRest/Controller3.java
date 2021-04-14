package org.padmini.springrest.SpringRestAssignment;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
	
	@GetMapping("/address/{zipcode}")
	public Address getAddress(@RequestBody @PathVariable("zipcode") String zip)
	{
		Address add1=new Address("Andhra pradesh","Vizianagaram","India",12345);
		Address add2=new Address("Telangana", "Hyderabad", "India", 98765);
		List<Address> l=new ArrayList<>();
		l.add(add1);
		l.add(add2);
		for (Address address : l) 
		{
			if(address.getZipcode()==Long.parseLong(zip))
			{
				return address;
			}
		}
		return null;
	}
}
