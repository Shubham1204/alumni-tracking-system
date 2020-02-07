package com.shubham.ats.dto;

import java.util.ArrayList;

public class userDTO {

	private String userid;
	private String email;
	private String contact;
	private String rolename;
	private ArrayList<rightsDTO> rights = new ArrayList<>();
	
	public userDTO(){	}

	public userDTO(String userid, String email, String contact, String rolename, ArrayList<rightsDTO> rights) {
		super();
		this.userid = userid;
		this.email = email;
		this.contact = contact;
		this.rolename = rolename;
		this.rights = rights;
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

	public String getUserid() {
		return userid.toUpperCase();
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRolename() {
		return rolename.toUpperCase();
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public ArrayList<rightsDTO> getRights() {
		return rights;
	}

	public void setRights(ArrayList<rightsDTO> rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "userDTO [userid=" + userid + ", email=" + email + ", contact=" + contact + ", rolename=" + rolename
				+ ", rights=" + rights + "]";
	}
	
	
}
