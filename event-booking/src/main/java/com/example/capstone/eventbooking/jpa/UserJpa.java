package com.example.capstone.eventbooking.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.capstone.eventbooking.entity.Users;

public interface UserJpa extends JpaRepository<Users, Long>{

	Users findByCustomerName(String user_name);
}
