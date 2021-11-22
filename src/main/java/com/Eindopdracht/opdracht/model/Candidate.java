package com.Eindopdracht.opdracht.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Candidate extends Human {

	public Candidate() {}
	public Candidate(String firstName, String lastName, LocalDate dob) {
		super(firstName, lastName, dob);
	}
}
