package com.preranasingh.contactform.service;

import java.util.List;

import com.preranasingh.contactform.bean.Customer;


public interface CustomerService {
	public List<Customer> listCustomers();
	 
	public void addCustomer(Customer customer);
}
