package com.example.capstone.eventbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.capstone.eventbooking.dao.EventsDaoService;
import com.example.capstone.eventbooking.entity.Event;
import com.example.capstone.eventbooking.entity.Users;
import com.example.capstone.eventbooking.jpa.EventJpa;
import com.example.capstone.eventbooking.jpa.UserJpa;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EventBookingService implements EventsDaoService{

	@Autowired
	private EventJpa repository;
	
	@Autowired
	private UserJpa userRepo;
	
	@Override
	public List<Event> retriveAllEvents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		repository.save(event);
	}

	@Override
	public void updateEvent(Event event) {
		// TODO Auto-generated method stub
		Optional<Event> updateEvent = repository.findById((long)event.getEvent_id());
		System.out.println(updateEvent.get());
		
		updateEvent.get().setEvent_location(event.getEvent_Location());
		updateEvent.get().setEvent_name(event.getEvent_name());
		updateEvent.get().setEvent_date(event.getEvent_date());
		repository.save(event);
	}

	@Override
	public void deleteEvent(int event_id) {
		// TODO Auto-generated method stub
//		Optional<Event> event = repository.findById((long)event_id);
		repository.deleteById((long)event_id);
	}

	@Override
	public Event getEvent(long event_id) {
		// TODO Auto-generated method stub
		Optional<Event> ent = repository.findById(event_id);
		return ent.get();
	}

	@Override
	public List<Event> getUserEvents(long user_id) {
		Optional<Users> use = userRepo.findById(user_id);
		return use.get().getEvents();
	}

	@Override
	public void bookEvent(long user_id, long event_id) {
		// TODO Auto-generated method stub
		Optional<Event> optionalEvent = repository.findById(event_id);
		Optional<Users> optionalUser = userRepo.findById(user_id);
	    if (optionalEvent.isPresent() && optionalUser.isPresent()) {
	        Event event = optionalEvent.get();
	        Users user = optionalUser.get();

	        // Set the user for the event
	        event.setUser(user);
	        repository.save(event);
	    } else {
	        // Handle the case where either the user or the event is not found
	        throw new EntityNotFoundException("User or Event not found");
	    }
	}	
	
}
