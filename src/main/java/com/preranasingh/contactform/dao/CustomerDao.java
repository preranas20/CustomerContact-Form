package com.preranasingh.contactform.dao;

import java.util.List;

import com.preranasingh.contactform.bean.Customer;;

public interface CustomerDao {
	public List<Customer> listCustomers();
	 
	 public void addCustomer(Customer customer);
}
