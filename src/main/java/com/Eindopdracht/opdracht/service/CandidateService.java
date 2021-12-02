package com.Eindopdracht.opdracht.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.repository.CandidateRepository;

@Service
public class CandidateService {
	private final CandidateRepository candidateRepository;
	
	@Autowired
	public CandidateService(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}
	
	public List<Candidate> getCandidatesFindAll(){
		return candidateRepository.findAll();
	}
	

	public List<Candidate> getCandidatesByParty (PoliticalGroup politicalGroup){
		return candidateRepository.findByPoliticalGroup(politicalGroup);
	}

	public void addNewCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
		
	}
	
	
}
