package com.Eindopdracht.opdracht.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Candidate extends Human{
	private String group;
	private String expertise;
	
	public Candidate() {
	}

	public Candidate(String firstName, String lastName, LocalDate dob, String group, String expertise) {
		super(firstName, lastName, dob);
		this.group = group;
		this.expertise = expertise;
	}
	
	public Candidate(String firstName, String lastName, LocalDate dob, String group) {
		super(firstName, lastName, dob);
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	@Override
	public String toString() {
		return "Candidate " + super.toString() + "[group=" + group + ", expertise=" + expertise + "]";
	}
	
	

}
