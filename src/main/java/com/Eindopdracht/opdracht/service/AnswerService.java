package com.Eindopdracht.opdracht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Answer;
import com.Eindopdracht.opdracht.model.Thesis;
import com.Eindopdracht.opdracht.repository.AnswerRepository;
import com.Eindopdracht.opdracht.repository.ThesisRepository;

@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	private final ThesisRepository thesisRepository;
	
	@Autowired
	public AnswerService(AnswerRepository answerRepository, ThesisRepository thesisRepository) {
		this.answerRepository = answerRepository;
		this.thesisRepository = thesisRepository;
	}

	public void registerAnswer(Answer answer, long id) {
		answer.setThesis(thesisRepository.getById(id));
		answerRepository.save(answer);
	}

	public List<Answer> showAnswers() {
		return answerRepository.findAll();
	}



}
