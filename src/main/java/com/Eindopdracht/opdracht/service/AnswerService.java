package com.Eindopdracht.opdracht.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Answer;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.model.Thesis;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.AnswerRepository;
import com.Eindopdracht.opdracht.repository.PoliticalGroupRepository;
import com.Eindopdracht.opdracht.repository.ThesisRepository;
import com.Eindopdracht.opdracht.repository.VoterRepository;

@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	private final ThesisRepository thesisRepository;
	private final VoterRepository voterRepository;
	private final PoliticalGroupRepository politicalGroupRepository;
	
	@Autowired
	public AnswerService(AnswerRepository answerRepository, ThesisRepository thesisRepository, VoterRepository voterRepository, PoliticalGroupRepository politicalGroupRepository) {
		this.answerRepository = answerRepository;
		this.thesisRepository = thesisRepository;
		this.voterRepository = voterRepository;
		this.politicalGroupRepository = politicalGroupRepository;
		
	}

//	public void registerAnswer(Answer answer, long id) {
//		answerRepository.save(answer);
//		Voter voter = voterRepository.getById(id);
//		voter.addAnswer(answer);
//		voterRepository.save(voter);
//	}
	
	public void registerAnswer(Answer answer, long id) {
		Voter voter = voterRepository.getById(id);
		
		
		List<Answer> voterAnswers = voter.getAnswers();
				
//		System.out.println("Wat staat hier: " + );
//		System.out.println("Vergelijking " +  );
//		
		for (int i = 0; i < voterAnswers.size(); i++) {
			if(voterAnswers.get(i).getThesis().getId() == answer.getThesis().getId()) {
				
				// verwijder oude antwoord
				answerRepository.deleteById(voterAnswers.get(i).getId());
				voterAnswers.remove(i);	
				voter.setAnswers(voterAnswers);
			}	
		}
		
		answerRepository.save(answer);
		voter.addAnswer(answer);
		voterRepository.save(voter);
	}
	
	
	public void registerAnswerPoliticalGroup(Answer answer, long politicalGroupId) {
		PoliticalGroup politicalGroup = politicalGroupRepository.getById(politicalGroupId);
		
		List<Answer> politicalGroupAnswers = politicalGroup.getAnswers();
		
		for (int i = 0; i < politicalGroupAnswers.size(); i++) {
			if(politicalGroupAnswers.get(i).getThesis().getId() == answer.getThesis().getId()) {
				
				
				// verwijder oude antwoord bij antwoorden
				answerRepository.deleteById(politicalGroupAnswers.get(i).getId());
				//verwijder antwoord uit de lijst met antwoorden van de partij
				politicalGroupAnswers.remove(i);	
				politicalGroup.setAnswers(politicalGroupAnswers);
			}	
		}
		
		answerRepository.save(answer);
		politicalGroup.addAnswer(answer);
		politicalGroupRepository.save(politicalGroup);
		
	}
	
	public void registerAnswer(Answer answer) {
		answerRepository.save(answer);
	}

	public List<Answer> showAnswers() {
		return answerRepository.findAll();
	}


}
