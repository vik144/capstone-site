package com.example.capstone.eventbooking.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.capstone.eventbooking.entity.Event;

public interface EventJpa extends JpaRepository<Event, Long>{

}
