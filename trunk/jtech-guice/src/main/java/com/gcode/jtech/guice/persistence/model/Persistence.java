package com.gcode.jtech.guice.persistence.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
public abstract class Persistence implements Serializable {
	
	private String createdUser="jittakal";
	
	private String modifiedUser="jittakal";
	
	private Date createdDate=Calendar.getInstance().getTime();
	
	private Date modifiedDate=Calendar.getInstance().getTime();

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}
