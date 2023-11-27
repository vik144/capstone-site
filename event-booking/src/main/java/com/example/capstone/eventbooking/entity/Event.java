package com.example.capstone.eventbooking.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long event_id;
	
	private Date event_date;
	
	private String event_name;
	
	private String event_location;
	
	private String event_description;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Users user;
	

	public Event() {
	}

	public Event(Integer event_id, Date date, String event_name, String event_location, String event_description) {
		super();
		this.event_id = event_id;
		this.event_date = date;
		this.event_name = event_name;
		this.event_location = event_location;
		this.event_description = event_description;
	}
	
	public long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}
	public Date getEvent_date() {
		return event_date;
	}
	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_Location() {
		return event_location;
	}
	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}
	public String getEvent_description() {
		return event_description;
	}
	
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}	

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_date=" + event_date + ", event_name=" + event_name + ", event_location ="+event_location+"]";
	}

	
}
