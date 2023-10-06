package com.example.capstone.eventbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	private long customer_id;

	private String customerName;
	
	private String password;
	
	private String email;
	
	private String address;
	
	public Users() {
		
	}

	public Users(long customer_id, String customerName, String password, String email, String address) {
		super();
		this.customer_id = customer_id;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [customer_id=" + customer_id + ", customerName=" + customerName + ", password=" + password
				+ ", email=" + email + ", address=" + address + "]";
	}
	
}
