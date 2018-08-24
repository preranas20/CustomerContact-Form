package com.preranasingh.contactform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preranasingh.contactform.bean.Customer;
import com.preranasingh.contactform.dao.CustomerDao;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;

	public List<Customer> listCustomers() {
		List<Customer> customers= customerDao.listCustomers();
		return customers;
	}

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

}
