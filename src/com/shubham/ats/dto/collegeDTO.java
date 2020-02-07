package com.shubham.ats.dto;

public class collegeDTO {

	private int collegeid;
	private String collegename;
	private String description;
	private String email;
	private String contact;
	private String address;
	
	public collegeDTO() {	}

	public int getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public collegeDTO(int collegeid, String collegename, String description, String email, String contact,
			String address) {
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
		this.description = description;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}

	@Override
	public String toString() {
		return "collegeDTO [collegeid=" + collegeid + ", collegename=" + collegename + ", description=" + description
				+ ", email=" + email + ", contact=" + contact + ", address=" + address + "]";
	}
	
	
}
