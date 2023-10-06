package com.example.capstone.eventbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.capstone.eventbooking.dao.UserDaoService;
import com.example.capstone.eventbooking.entity.Users;
import com.example.capstone.eventbooking.jpa.UserJpa;

@Service
public class UserService implements UserDaoService{

	@Autowired
	private UserJpa userRepository; 
	
	@Override
	public void createUser(Users user) {
		// TODO Auto-generated method stub
		if(!(user.getCustomerName().isEmpty() || user.getAddress().isEmpty() || 
			user.getEmail().isEmpty() || user.getPassword().isEmpty())) {
			userRepository.save(user);
		}
		
	}

	@Override
	public boolean verifyUser(String user_name, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByCustomerName(user_name).getPassword().equals(password);
	}

}
