package com.cb3.growthapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Growth {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long Id;
	
	private Date date;
	
	private long weight;
	
	private long headsize;
	
	private long note;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getHeadSize() {
		return headsize;
	}

	public void setHead(long head) {
		this.headsize = head;
	}

	public long getNote() {
		return note;
	}

	public void setNote(long note) {
		this.note = note;
	}
	
	
}
