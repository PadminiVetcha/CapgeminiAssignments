package org.padmini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring3.xml");
		BankAccountController b1=(BankAccountController)context.getBean("bankAccountController");
		double bal=b1.getBalance(987654321);
		System.out.println("Initial balance: "+bal);
		double value=b1.deposit(987654321, 500);
		System.out.println("After depositing 500 :"+value);
		double bala=b1.getBalance(987654321);
		System.out.println("Balance: "+bala);
		double value1=b1.deposit(987654321, 1500);
		System.out.println("After depositing 1500: "+value1);
		double value2=b1.withdraw(987654321, 250);
		System.out.println("After withdraw 250: "+value2);
		
	}

}
