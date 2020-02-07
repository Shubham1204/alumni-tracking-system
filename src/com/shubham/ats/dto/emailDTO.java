package com.shubham.ats.dto;

public class emailDTO {

	private int emailid;
	private String emailsubject;
	private String description;
	private String semail;
	private String remail;
	
	public emailDTO() {	}

	public int getEmailid() {
		return emailid;
	}

	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}

	public String getEmailsubject() {
		return emailsubject;
	}

	public void setEmailsubject(String emailsubject) {
		this.emailsubject = emailsubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getRemail() {
		return remail;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}

	@Override
	public String toString() {
		return "emailDTO [emailid=" + emailid + ", emailsubject=" + emailsubject + ", description=" + description
				+ ", semail=" + semail + ", remail=" + remail + "]";
	}

	public emailDTO(int emailid, String emailsubject, String description, String semail, String remail) {
		super();
		this.emailid = emailid;
		this.emailsubject = emailsubject;
		this.description = description;
		this.semail = semail;
		this.remail = remail;
	}

	
	
}
