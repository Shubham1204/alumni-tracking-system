package com.shubham.ats.dto;

public class messageDTO {

	private int messageid;
	private String messagesubject;
	private String description;
	private String scontact;
	private String rcontact;
	
	public messageDTO() {	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public String getMessagesubject() {
		return messagesubject;
	}

	public void setMessagesubject(String messagesubject) {
		this.messagesubject = messagesubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScontact() {
		return scontact;
	}

	public void setScontact(String scontact) {
		this.scontact = scontact;
	}

	public String getRcontact() {
		return rcontact;
	}

	public void setRcontact(String rcontact) {
		this.rcontact = rcontact;
	}

	@Override
	public String toString() {
		return "messageDTO [messageid=" + messageid + ", messagesubject=" + messagesubject + ", description="
				+ description + ", scontact=" + scontact + ", rcontact=" + rcontact + "]";
	}

	public messageDTO(int messageid, String messagesubject, String description, String scontact, String rcontact) {
		super();
		this.messageid = messageid;
		this.messagesubject = messagesubject;
		this.description = description;
		this.scontact = scontact;
		this.rcontact = rcontact;
	}

	
}
