package com.Eindopdracht.opdracht.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Candidate extends Human{
	
	@Column(name = "politicalParty")
	private String politicalParty;
	private String expertise;

	public Candidate() {
	}

	public Candidate(String firstName, String lastName, LocalDate dob, String politicalParty, String expertise) {
		super(firstName, lastName, dob);
		this.politicalParty = politicalParty;
		this.expertise = expertise;	
	}
	
	public Candidate(String firstName, String lastName, LocalDate dob, String politicalParty) {
		super(firstName, lastName, dob);
		this.politicalParty = politicalParty;		
	}

	public String getPoliticalParty() {
		return politicalParty;
	}

	public void setPoliticalParty(String politicalParty) {
		this.politicalParty = politicalParty;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	@Override
	public String toString() {
		return "Candidate "+ super.toString() + " "  + "politicalParty=" + politicalParty + ", expertise=" + expertise + "]";
	}
	
	
	
}
