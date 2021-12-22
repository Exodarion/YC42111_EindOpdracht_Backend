package com.Eindopdracht.opdracht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Answer;
import com.Eindopdracht.opdracht.model.Thesis;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.AnswerRepository;
import com.Eindopdracht.opdracht.repository.ThesisRepository;
import com.Eindopdracht.opdracht.repository.VoterRepository;

@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	private final ThesisRepository thesisRepository;
	private final VoterRepository voterRepository;
	
	@Autowired
	public AnswerService(AnswerRepository answerRepository, ThesisRepository thesisRepository, VoterRepository voterRepository) {
		this.answerRepository = answerRepository;
		this.thesisRepository = thesisRepository;
		this.voterRepository = voterRepository;
		
	}

	public void registerAnswer(Answer answer, long id) {
		answerRepository.save(answer);
		Voter voter = voterRepository.getById(id);
		voter.addAnswer(answer);
		voterRepository.save(voter);
	}
	
	public void registerAnswer(Answer answer) {
		answerRepository.save(answer);
	}

	public List<Answer> showAnswers() {
		return answerRepository.findAll();
	}



}
