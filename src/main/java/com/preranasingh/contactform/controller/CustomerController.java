package com.preranasingh.contactform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.preranasingh.contactform.bean.Customer;
import com.preranasingh.contactform.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/customersList", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Customer>> customers(){
		HttpHeaders headers = new HttpHeaders();
		  List<Customer> customers = customerService.listCustomers();

		  if (customers == null) {
		   return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
		  }
		  headers.add("Number Of Records Found", String.valueOf(customers.size()));
		  return new ResponseEntity<List<Customer>>(customers, headers, HttpStatus.OK);
	}
	
	@RequestMapping(value="/customer",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<Customer> addUser(@RequestBody Customer customer) {
		  HttpHeaders headers = new HttpHeaders();
		  if (customer == null) {
		   return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		  }
		  customerService.addCustomer(customer);
		  headers.add("Customer added  - ", String.valueOf(customer.getId()));
		  return new ResponseEntity<Customer>(customer, headers, HttpStatus.CREATED);
		 }


}
