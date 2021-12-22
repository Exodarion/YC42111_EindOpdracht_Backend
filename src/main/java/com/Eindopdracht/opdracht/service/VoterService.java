package com.Eindopdracht.opdracht.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Answer;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.VoterRepository;

@Service
public class VoterService {
	private final VoterRepository voterRepository;
	
	@Autowired
	public VoterService (VoterRepository voterRepository) {
		this.voterRepository = voterRepository;
	}
	
	public List<Voter> getVoters(){
		return voterRepository.findAll();
	}
	
	public void addNewVoter(Voter voter) {
		voterRepository.save(voter);
	}

	public Voter showAnswers(long voterId) {
		Optional<Voter> optionalVoter = voterRepository.findById(voterId);
		Voter voter = null;
		if (optionalVoter.isPresent()) {
			voter = optionalVoter.get();
		}
		return voter;
	}

	public Voter getOne(long voterid) {
		return voterRepository.getById((long) voterid);
	}

	
}
