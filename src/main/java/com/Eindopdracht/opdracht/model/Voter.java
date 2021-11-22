package com.Eindopdracht.opdracht.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Voter extends Human{
	
	@Column(name = "email", nullable = false)
	private String email;
	private String residence;
	
	public Voter() {
		
	}
	
	public Voter(String firstName, String lastName, LocalDate dob, String email, String residence) {
		super(firstName, lastName, dob);
		this.email = email;
		this.residence = residence;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	@Override
	public String toString() {
		return "Voter " + super.toString() + "[email=" + email + ", residence=" + residence + "]";
	}
	
	

}
