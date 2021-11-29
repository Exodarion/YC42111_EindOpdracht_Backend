package com.Eindopdracht.opdracht.dto;

import java.time.LocalDate;

import com.Eindopdracht.opdracht.model.Candidate;

public class CandidateDTO {
	private long id;
	private String firstName;
	private String lastName;
	private long partyID;
	private String politicalGroupName;
	private LocalDate dob;
	
	public CandidateDTO() {}
	public CandidateDTO(Candidate candidate) 
	{
		this.firstName = candidate.getFirstName();
		this.lastName = candidate.getLastName();
	};
	public CandidateDTO(long id, String firstName, String lastName, long partyID, String politicalGroupName, LocalDate dob) 
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.partyID = partyID;
		this.politicalGroupName = politicalGroupName;
		this.dob = dob; 
	} 
	
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
	public String getPoliticalGroupName() {
		return politicalGroupName;
	}
	public void setPoliticalGroupName(String politicalGroupName) {
		this.politicalGroupName = politicalGroupName;
	}
	
	
}
