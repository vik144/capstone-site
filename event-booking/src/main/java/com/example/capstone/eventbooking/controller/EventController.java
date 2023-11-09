package com.example.capstone.eventbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.capstone.eventbooking.entity.Event;
import com.example.capstone.eventbooking.service.EventBookingService;

@RestController
public class EventController {
	
	@Autowired
	private EventBookingService service;
	
	// User and admin visibility
	@GetMapping(path="/events")
	public List<Event> retriveEvents(){
		return service.retriveAllEvents();
	}
	
	
	//Admin side
	@PostMapping(path="/events")
	public void addEvent(@RequestBody Event event) {
		service.addEvent(event);
	}
	
	@PostMapping(path="/update-event")
	public void updateEvent(@RequestBody Event event) {
		service.updateEvent(event);
	}
	
	@DeleteMapping(path="/delete-event")
	public void deleteEvent(@RequestBody int event_id) {
		service.deleteEvent(event_id);
	}
}
