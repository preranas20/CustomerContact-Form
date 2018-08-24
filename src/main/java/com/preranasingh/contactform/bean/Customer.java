package com.preranasingh.contactform.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	
	private int id;
	private String firstname;
	private String lastname;
	private String phone;
	private String address;
	private String email;
	private String message;
	
	public Customer() {
    }
	
	@JsonCreator
    public Customer(@JsonProperty("id") int id, @JsonProperty("firstname") String firstname,
    		   @JsonProperty("lastname") String lastname, @JsonProperty("phone") String phone,
    		   @JsonProperty("address") String address, @JsonProperty("email") String email,
    		   @JsonProperty("message") String message) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.phone=phone;
    this.address=address;
    this.email=email;
    this.message=message;
    }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	@Override
	public String toString() {
	  StringBuilder str = new StringBuilder();
	  str.append("Customer Id:- " + getId());
	  str.append(" First Name:- " + getFirstname());
	  str.append(" Last Name:- " + getLastname());
	  str.append(" Phone:-" + getPhone());
	  str.append("Address:-" + getAddress());
	  str.append(" Email:- " + getEmail());
	  str.append(" Message:- "+ getMessage());
	  return str.toString();
	 }
	
	
}
