package com.Eindopdracht.opdracht.rest;

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
@CrossOrigin (maxAge = 3600)
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
	
	@GetMapping (path = "/memberByID/{id}")
	public List<Candidate> showMembers(@PathVariable long id){
		// checken of id bestaat
		Optional <PoliticalGroup> group = politicalGroupService.findById(id);
		if (group.isPresent())
			return politicalGroupService.showMembers(group.get());
		else
			return null;
	}
	
	@GetMapping (path = "/memberByName/{firstname}")
	public CandidateDTO showCandidateFirstName(@PathVariable String firstname)
	{	
		//instantiate new DTO from the Candidate
		CandidateDTO candidateDTO = new CandidateDTO();
		
		//Get this candidate by its firstname
		Optional<Candidate> candidate = politicalGroupService.findCandidateByFirstName(firstname);
		
		//set data to be carried over
		candidateDTO.setFirstName(candidate.get().getFirstName());
		candidateDTO.setLastName(candidate.get().getLastName());
		candidateDTO.setId(candidate.get().getId());
		
		return candidateDTO;			
	}
	
	@PostMapping ("/add")
	public void registerNewPoliticalGroup(@RequestBody PoliticalGroup politicalGroup) {
		politicalGroupService.addNewPoliticalGroup(politicalGroup);
	}
}
