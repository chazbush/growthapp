package com.cb3.growthapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class baby {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	private String FirstName;
	private String LastName;
	private String MiddleInitial;
	private String Growth;
	
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMiddleInitial() {
		return MiddleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		MiddleInitial = middleInitial;
	}
	public String getWeight() {
		return Growth;
	}
	public void setWeight(String growth) {
		Growth = growth;
	}
	
	
	
	
	
	
	
	
	
}
