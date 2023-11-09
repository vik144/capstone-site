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
		if(!(user.getFirst_name().isEmpty()|| user.getLast_name().isEmpty() || user.getAddress().isEmpty() || 
			user.getEmail().isEmpty() || user.getPassword().isEmpty())) {
			userRepository.save(user);
		}
		
	}

	@Override
	public boolean verifyUser(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email).getPassword().equals(password);
	}

	@Override
	public Users getUserDetails(String email, String password) {
		// TODO Auto-generated method stub
		Users userDetails = verifyUser(email, password)? userRepository.findByEmail(email): new Users();
		return userDetails;
	}

	
}
