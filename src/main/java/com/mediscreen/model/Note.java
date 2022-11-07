package com.mediscreen.model;

import java.util.Date;

public class Note {
	
	private Integer id;
	private Date date;
	private String content;
	private Patient patient;
	
	public Note() {
	}
	
	public Note(Integer id, Date date, String content, Patient patient) {
		this.id = id;
		this.date = date;
		this.content = content;
		this.patient = patient;
	}
	
	public Note(Date date, String content, Patient patient) {
		this.date = date;
		this.content = content;
		this.patient = patient;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	

}
