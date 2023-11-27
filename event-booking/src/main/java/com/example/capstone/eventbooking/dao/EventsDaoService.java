package com.example.capstone.eventbooking.dao;

import java.util.List;

import com.example.capstone.eventbooking.entity.Event;

public interface EventsDaoService {
	public List<Event> retriveAllEvents();

	public void addEvent(Event event);

	public void updateEvent(Event event);

	public void deleteEvent(int event_id);

	public List<Event> getUserEvents(long user_id);

	public Event getEvent(long event_id);

	public void bookEvent(long user_id, long event_id);

}
