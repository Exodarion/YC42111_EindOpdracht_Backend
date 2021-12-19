package com.Eindopdracht.opdracht.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated
	private AnswersThesis answerThesis;
	
	@ManyToOne
	private Thesis thesis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AnswersThesis getAnswerThesis() {
		return answerThesis;
	}

	public void setAnswerThesis(AnswersThesis answerThesis) {
		this.answerThesis = answerThesis;
	}

	public Thesis getThesis() {
		return thesis;
	}

	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}
	
}
