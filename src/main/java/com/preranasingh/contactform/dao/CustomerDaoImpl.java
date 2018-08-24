package com.preranasingh.contactform.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.preranasingh.contactform.bean.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	 public void setDataSource(DataSource dataSource) {
	  this.jdbcTemplate = new JdbcTemplate(dataSource);
	 }


	public List<Customer> listCustomers() {
		List<Customer> customers=null;
		try{
			String sqlGetQuery = "SELECT * FROM Customer";
			customers=jdbcTemplate.query(sqlGetQuery, new BeanPropertyRowMapper<Customer>(Customer.class));
		}catch (DataAccessException e) {
			   e.printStackTrace();
	    }
				  
		return customers;
	}
	

	public void addCustomer(Customer customer) {
		String sqlAddQuery = "INSERT INTO Customer(firstname, lastname, phone, address, email, message) VALUES(?,?,?,?,?,?)";
	    jdbcTemplate.update(sqlAddQuery,new Object[]{customer.getFirstname(),customer.getLastname(),customer.getPhone(),customer.getAddress(),customer.getEmail(),customer.getMessage()});
		
	}

}
