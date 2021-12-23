package com.Eindopdracht.opdracht.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.CandidateRepository;
import com.Eindopdracht.opdracht.repository.PoliticalGroupRepository;

@Service
public class PoliticalGroupService 
{
	private final PoliticalGroupRepository politicalGroupRepository;
	private final CandidateRepository candidateRepository;
	
	public PoliticalGroupService(PoliticalGroupRepository politicalGroupRepository,
			CandidateRepository candidateRepository) {
		super();
		this.politicalGroupRepository = politicalGroupRepository;
		this.candidateRepository = candidateRepository;
	}
	
	public PoliticalGroup getOne(long politicalgroupid) {
		return politicalGroupRepository.getById((long) politicalgroupid);
	}

	public List<PoliticalGroup> getPoliticalGroups(){
		return politicalGroupRepository.findAll();
	}
	
	public void addNewPoliticalGroup (PoliticalGroup politicalGroup) throws Exception{
		if (politicalGroupRepository.existsByNameIgnoreCase(politicalGroup.getName())) {
			throw new Exception("Partij bestaat al");
		} else
		politicalGroupRepository.save(politicalGroup);
	}
	
	public List<Candidate> showMembersFromPoliticalGroup(PoliticalGroup politicalGroup){
		return candidateRepository.findByPoliticalGroup(politicalGroup);
	}
	
	public Optional<Candidate> findCandidateByFirstName(String firstname){
		return candidateRepository.findByFirstName(firstname);
	}
	
	public Optional<PoliticalGroup> findPoliticalGroupById(long id) {
		return politicalGroupRepository.findById(id);
	}

}
