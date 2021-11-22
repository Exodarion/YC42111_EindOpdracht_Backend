package com.Eindopdracht.opdracht.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.service.CandidateService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping (path = "/candidate")
public class CandidateController {
	private final CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	
	@PostMapping(path = "/add")
	public void addCandidate(@RequestBody Candidate candidate) {
		candidateService.addNewCandidate(candidate);
	}
	
	@GetMapping("/list")
	public List<Candidate> getCandidates(){
		return candidateService.getCandidates();
	}
}
