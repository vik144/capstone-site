package com.example.capstone.eventbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.capstone.eventbooking.dao.EventsDaoService;
import com.example.capstone.eventbooking.entity.Event;
import com.example.capstone.eventbooking.jpa.EventJpa;

@Service
public class EventBookingService implements EventsDaoService{

	@Autowired
	private EventJpa repository;
	
	@Override
	public List<Event> retriveAllEvents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		repository.save(event);
	}
	
}
