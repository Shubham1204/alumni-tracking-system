package com.shubham.ats.dto;

public class rightsDTO {

	private String rightname;
	private String screenname;
	
	public rightsDTO(){	}

	public rightsDTO(String rightname, String screenname) {
		super();
		this.rightname = rightname;
		this.screenname = screenname;
	}

	public String getRightname() {
		return rightname;
	}

	public void setRightname(String rightname) {
		this.rightname = rightname;
	}

	public String getScreenname() {
		return screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	@Override
	public String toString() {
		return "rightsDTO [rightname=" + rightname + ", screenname=" + screenname + "]";
	}
	
	
	
}
