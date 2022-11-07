package com.mediscreen.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Note {
	
	@Id
	private String id;
	private Date date;
	private String content;
	private int patient;
	
	public Note() {
	}
	
	public Note(String id, Date date, String content, int patient) {
		this.id = id;
		this.date = date;
		this.content = content;
		this.patient = patient;
	}
	
	public Note(Date date, String content, int patient) {
		this.date = date;
		this.content = content;
		this.patient = patient;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPatient() {
		return patient;
	}
	public void setPatient(int patient) {
		this.patient = patient;
	}
	
	
	

}
