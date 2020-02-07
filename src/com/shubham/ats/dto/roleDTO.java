package com.shubham.ats.dto;

public class roleDTO {

	private int roleid;
	private String rolename;
	private String description;
	
	public roleDTO() {	}
	
	public roleDTO(int roleid, String rolename, String description) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.description = description;
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
	@Override
	public String toString() {
		return "roleDTO [roleid=" + roleid + ", rolename=" + rolename + ", description=" + description + "]";
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
}
