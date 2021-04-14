package org.padmini.springrest.Collector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate")
public class CreditCardController
{
	@GetMapping(path="/{no}")
	public String validate(@PathVariable("no") String num)
	{
		if(num.length()==16)
		{
			String number=num.substring(0, 6);
			int n=Integer.parseInt(number);
			//System.out.println(n);
			if((n>601100 && n<601109) || (n>601120 && n<601149) ||(n==601174) ||  (n>601177 && n<601179) || (n>601186 && n<601199) || (n>644000 && n<659999))
			{
				return "Valid Card Number";
			}
			else if((n>510000 && n<559999) || (n>222100 || n<272099))
			{
				return "Valid MasterCard Card Number";
			}
		}
		else if(num.length()==15)
		{
			String number=num.substring(0, 4);
			int n=Integer.parseInt(number);
			if(n==2014 || n==2019)
			{
				return "Valid enRoute Card Number";
			}
		}
		else if(num.length()>16 && num.length()<19)
		{
			String number=num.substring(0, 4);
			int n=Integer.parseInt(number);
			if(n>3528 && n<3589)
			{
				return "Valid JCB Card Number";
			}
		}
		else if(num.length()<20)
		{
			char x=num.charAt(0);
			int nu=Character.getNumericValue(x);
			System.out.println(nu);
			if(nu==4)
			{
				return "Valid Visa Card Number";
			}
		}
		return "Invalid";
	}
}
