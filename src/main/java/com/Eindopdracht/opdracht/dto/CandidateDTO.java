package com.Eindopdracht.opdracht.dto;

import java.time.LocalDate;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;

public class CandidateDTO {
	private long id;
	private String firstName;
	private String lastName;
	private long partyID;
	private String politicalGroupName;
	private LocalDate dob;
	private String expertise;
	
	CandidateDTO() {}
	public CandidateDTO(Candidate candidate) 
	{
		PoliticalGroup pg = candidate.getPoliticalGroup(); //cache reference to political group first
		
		// assign data from the given Candidate inside the DTO constructor
		this.id = candidate.getId();
		this.firstName = candidate.getFirstName();
		this.lastName = candidate.getLastName();
		this.partyID = pg.getId();
		this.politicalGroupName = pg.getName();
		this.dob = candidate.getDob(); 
		this.expertise = candidate.getExpertise();
	};
	
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
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
