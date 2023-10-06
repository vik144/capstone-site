package com.example.capstone.eventbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.capstone.eventbooking.dao.UserDaoService;
import com.example.capstone.eventbooking.entity.Users;

@RestController
public class UserController {

	@Autowired
	private UserDaoService userService;
	
	@PostMapping("/users")
	public void createUser(@RequestBody Users user) {
		userService.createUser(user);
	}
	
	@GetMapping("/verify-user")
	public boolean verifyUser(@RequestParam String user_name, @RequestParam String password) {
		return userService.verifyUser(user_name,password);
	}
}
