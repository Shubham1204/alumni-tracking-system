package com.shubham.ats.dto;

public class noticeDTO {

	private int noticeid;
	private String noticesubject;
	private String description;
	private String date;
	private String contact;
	private String email;
	
	public noticeDTO() {	}

	public noticeDTO(int noticeid, String noticesubject, String description, String date, String contact,
			String email) {
		super();
		this.noticeid = noticeid;
		this.noticesubject = noticesubject;
		this.description = description;
		this.date = date;
		this.contact = contact;
		this.email = email;
	}

	public int getNoticeid() {
		return noticeid;
	}

	public void setNoticeid(int noticeid) {
		this.noticeid = noticeid;
	}

	public String getNoticesubject() {
		return noticesubject;
	}

	public void setNoticesubject(String noticesubject) {
		this.noticesubject = noticesubject;
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

	@Override
	public String toString() {
		return "noticeDTO [noticeid=" + noticeid + ", noticesubject=" + noticesubject + ", description=" + description
				+ ", date=" + date + ", contact=" + contact + ", email=" + email + "]";
	}

	
}
