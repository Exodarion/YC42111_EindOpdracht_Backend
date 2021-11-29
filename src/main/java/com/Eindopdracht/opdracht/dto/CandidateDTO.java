package com.Eindopdracht.opdracht.dto;

import java.time.LocalDate;

public class CandidateDTO {
	private long id;
	private String firstName;
	private String lastName;
	private long partyID;
	private LocalDate dob;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPartyID() {
		return partyID;
	}
	public void setPartyID(long partyID) {
		this.partyID = partyID;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}