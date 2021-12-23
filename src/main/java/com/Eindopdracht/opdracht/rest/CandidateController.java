package com.Eindopdracht.opdracht.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.dto.CandidateDTO;
import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.repository.PoliticalGroupRepository;
import com.Eindopdracht.opdracht.service.CandidateService;
import com.Eindopdracht.opdracht.service.PoliticalGroupService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping (path = "/candidate")
public class CandidateController {
	private final CandidateService candidateService;
	private final PoliticalGroupService politicalGroupService;
	
	@Autowired
	public CandidateController(CandidateService candidateService, PoliticalGroupService politicalGroupService) {
		super();
		this.candidateService = candidateService;
		this.politicalGroupService = politicalGroupService;
	}
	
	
	@PostMapping(path = "/add")
	public void addCandidate(@RequestBody CandidateDTO candidateDTO) 
	{
		//Set data manually
		Candidate candidate = new Candidate();
		candidate.setFirstName(candidateDTO.getFirstName());
		candidate.setLastName(candidateDTO.getLastName());
		candidate.setDob(candidateDTO.getDob());
		candidate.setExpertise(candidateDTO.getExpertise());
		
		//use partyID to set the proper PoliticalGroup
		Optional<PoliticalGroup> pg = politicalGroupService.findPoliticalGroupById(candidateDTO.getPartyID());
		candidate.setPoliticalGroup(pg.get());
		candidateService.addNewCandidate(candidate);
	}
	
	@GetMapping("/list")
	public List<CandidateDTO> getCandidates()
	{
		List<CandidateDTO> tempList = new ArrayList<CandidateDTO>();
		for(Candidate candidate : candidateService.getCandidatesFindAll()) {
			tempList.add(new CandidateDTO(candidate));
		}					
		return tempList;
	}
	
	@DeleteMapping(path = "/remove/{id}")
	public void removeThesis(@PathVariable long id) {
		candidateService.removeCandidate(id);		
	}
}
