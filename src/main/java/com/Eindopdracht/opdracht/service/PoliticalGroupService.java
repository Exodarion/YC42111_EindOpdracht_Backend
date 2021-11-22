package com.Eindopdracht.opdracht.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.repository.PoliticalGroupRepository;

@Service
public class PoliticalGroupService 
{
	private final PoliticalGroupRepository politicalGroupRepository;
	
	@Autowired
	public PoliticalGroupService (PoliticalGroupRepository politicalGroupRepository) {
		this.politicalGroupRepository = politicalGroupRepository;
	}
	
	public List<PoliticalGroup> getPoliticalGroups(){
		return politicalGroupRepository.findAll();
	}
	
	public void addNewPoliticalGroup(PoliticalGroup politicalGroup) {
		politicalGroupRepository.save(politicalGroup);
	}
}
