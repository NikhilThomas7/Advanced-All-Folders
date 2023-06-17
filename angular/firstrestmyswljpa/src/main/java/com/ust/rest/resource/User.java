package com.ust.rest.resource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_User")
public class User {
	
	@Id
	
	
	private long uderId;
	
	private String dateTime;
	
	
	public long getUderId() {
		return uderId;
	}
	public void setUderId(long uderId) {
		this.uderId = uderId;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	
	

}
