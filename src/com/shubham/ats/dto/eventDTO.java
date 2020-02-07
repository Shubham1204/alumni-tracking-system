package com.shubham.ats.dto;

public class eventDTO {

	private int eventid;
	private String eventname;
	private String description;
	private String date;
	private String time;
	private String contact;
	private String email;
	private String venue;
	
	public eventDTO() {	}

	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		return "eventDTO [eventid=" + eventid + ", eventname=" + eventname + ", description=" + description + ", date="
				+ date + ", time=" + time + ", contact=" + contact + ", email=" + email + ", venue=" + venue + "]";
	}

	public eventDTO(int eventid, String eventname, String description, String date, String time, String contact,
			String email, String venue) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.description = description;
		this.date = date;
		this.time = time;
		this.contact = contact;
		this.email = email;
		this.venue = venue;
	}

	
}
