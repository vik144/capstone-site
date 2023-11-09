package com.example.capstone.eventbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	private long customer_id;

	private String first_name;
	
	private String last_name;
	
	private String password;
	
	private String email;
	
	private String address;
	
	

	public Users() {
	}

	public Users(long customer_id, String first_name, String last_name, String password, String email, String address) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
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
	
	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "Users [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", password=" + password + ", email=" + email + ", address=" + address + "]";
	}

	
	
}
