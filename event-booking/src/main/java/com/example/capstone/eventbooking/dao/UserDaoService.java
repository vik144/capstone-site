package com.example.capstone.eventbooking.dao;

import com.example.capstone.eventbooking.entity.Users;

public interface UserDaoService {

	public void createUser(Users user);

	public boolean verifyUser(String user_name, String password);
	
}
