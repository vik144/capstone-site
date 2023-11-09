package com.example.capstone.eventbooking.service;

import java.util.List;
import java.util.Optional;

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

	public void updateEvent(Event event) {
		// TODO Auto-generated method stub
		Optional<Event> updateEvent = repository.findById((long)event.getEvent_id());
		System.out.println(updateEvent.get());
		
		updateEvent.get().setEvent_location(event.getEvent_Location());
		updateEvent.get().setEvent_name(event.getEvent_name());
		updateEvent.get().setEvent_date(event.getEvent_date());
		repository.save(event);
	}

	public void deleteEvent(int event_id) {
		// TODO Auto-generated method stub
//		Optional<Event> event = repository.findById((long)event_id);
		repository.deleteById((long)event_id);
	}
	
	
}
