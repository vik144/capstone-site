package com.example.capstone.eventbooking.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {

	@Id
	private Integer event_id;
	
	private Date event_date;
	
	private String event_name;
	
	public Event() {
	}

	public Event(Integer event_id, Date date, String event_name) {
		super();
		this.event_id = event_id;
		this.event_date = date;
		this.event_name = event_name;
	}
	
	public Integer getEvent_id() {
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

	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_date=" + event_date + ", event_name=" + event_name + "]";
	}
	
	
}
