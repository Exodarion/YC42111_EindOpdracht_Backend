package com.Eindopdracht.opdracht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.repository.CandidateRepository;

@Service
public class CandidateService {
	private final CandidateRepository candidateRepository;
	
	@Autowired
	public CandidateService(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}
	
	public List<Candidate> getCandidates(){
		return candidateRepository.findAll();
	}

	public void addNewCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
		
	}
	
	
}
