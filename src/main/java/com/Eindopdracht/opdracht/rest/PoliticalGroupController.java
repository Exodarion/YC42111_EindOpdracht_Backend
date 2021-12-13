package com.Eindopdracht.opdracht.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.dto.CandidateDTO;
import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.service.PoliticalGroupService;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(path = "/politicalGroup")
public class PoliticalGroupController {
	private final PoliticalGroupService politicalGroupService;
	
	@Autowired
	public PoliticalGroupController(PoliticalGroupService politicalGroupService) {
		this.politicalGroupService = politicalGroupService;
	}
	
	@GetMapping (path = "/list")
	public List<PoliticalGroup> getPoliticalGroups(){
		return politicalGroupService.getPoliticalGroups();
	}
	
	@GetMapping (path = "/membersByPartyID/{id}")
	public List<CandidateDTO> showMembers(@PathVariable long id)
	{	
		//Get this Optional<PoliticalGroup> by its id and save into a regular PoliticalGroup object by using '.get()'
		PoliticalGroup group = politicalGroupService.findPoliticalGroupById(id).get();
		
		//fill a tempList with candidateDTO's, by looping over the original Candidate objects
		List<CandidateDTO> tempList = new ArrayList<CandidateDTO>();
		for(Candidate candidate : politicalGroupService.showMembersFromPoliticalGroup(group))
			tempList.add(new CandidateDTO(candidate));
		
		return tempList;
	}
	
	@GetMapping (path = "/memberByFirstName/{firstname}")
	public CandidateDTO showCandidateFirstName(@PathVariable String firstname)
	{	
		//Get this Optional<Candidate> by its firstname and save into a regular Candidate object by using '.get()'
		Candidate candidate = politicalGroupService.findCandidateByFirstName(firstname).get();
		
		//return the DTO from the Candidate, rather than the original Candidate object itself
		return new CandidateDTO(candidate);		
	}
	
	@PostMapping ("/add")
	public int registerNewPoliticalGroup(@RequestBody PoliticalGroup politicalGroup) {
		try {
			politicalGroupService.addNewPoliticalGroup(politicalGroup);
			return 0;
		} catch (Exception e) {
			return 1;
		}
	}
}
