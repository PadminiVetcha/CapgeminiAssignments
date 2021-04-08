package org.padmini.springcore;

import java.util.List;

public class Customer {

	private int customerId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	
	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	/*
	 * public void setCustomerId(int customerId) { this.customerId = customerId; }
	 */
	public String getCustomerName() {
		return customerName;
	}

	/*
	 * public void setCustomerName(String customerName) { this.customerName =
	 * customerName; }
	 */
	public int getCustomerContact() {
		return customerContact;
	}

	/*
	 * public void setCustomerContact(int customerContact) { this.customerContact =
	 * customerContact; }
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}

	/*
	 * public void setCustomerAddress(Address customerAddress) {
	 * this.customerAddress = customerAddress; }
	 */
	public void printDetails() {
		System.out.println("Customer Details are:--------------------");
		System.out.println("Customer Id: "+customerId+", Customer Name: "+customerName+", Customer Contact: "+customerContact);
		System.out.println("Customer Address:");
		System.out.println("Street: "+customerAddress.getStreet()+", City: "+customerAddress.getCity()+", State: "+customerAddress.getState()+", Zip: "+customerAddress.getZip()+", Country: "+customerAddress.getCountry());
	}
	
}
