package com.Eindopdracht.opdracht.model;

import java.time.LocalDate;

import javax.persistence.Column;

public class Candidate extends Human {

	public Candidate(String firstName, String lastName, LocalDate dob) {
		super(firstName, lastName, dob);
	}
}
