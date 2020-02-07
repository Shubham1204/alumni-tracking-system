package com.shubham.ats.dto;

import java.util.ArrayList;

public class rolerightDTO {

	private int roleid;
	private String rolename;
	private String description;
	private String rights;
	
	public rolerightDTO(){	}

	public rolerightDTO(int roleid, String rolename, String description, String rights) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.description = description;
		this.rights = rights;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}
	
	
}
