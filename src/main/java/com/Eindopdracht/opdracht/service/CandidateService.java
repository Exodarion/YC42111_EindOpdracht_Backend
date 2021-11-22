package com.Eindopdracht.opdracht.service;

import java.util.ArrayList;
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
	
//	public ArrayList<Candidate> getCandidatesByParty (String party){
//		List<Candidate> allCandidates = getCandidates();
//		ArrayList<Candidate> partyCandidates = new ArrayList<Candidate>();
//		for (Candidate candidate: allCandidates) {
//			if (candidate.getPoliticalParty().equalsIgnoreCase(party)) {
//				partyCandidates.add(candidate);
//			}
//		}
//		return partyCandidates;
//	}

	public void addNewCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
		
	}
	
	
}
