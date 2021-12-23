package com.Eindopdracht.opdracht.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.model.Answer;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.service.VoterService;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "/voter")
public class VoterController {
	private final VoterService voterService;
	
	
	@Autowired
	 public VoterController(VoterService voterService) {
		this.voterService = voterService;
	}
	
	@GetMapping (path = "/list")
	public List<Voter> getVoters(){
		return voterService.getVoters();
		
	}
	
	@PostMapping (path = "/add")
	public Voter registerNewVoter(@RequestBody Voter voter) {
		voterService.addNewVoter(voter);
		return voter;
	}
	
	
	@GetMapping (path = "showAnswers/{voterid}")
	public List<Answer> showAnswers(@PathVariable long voterid){
		Voter voter = voterService.getOne(voterid);
		return voter.getAnswers();
		
	}
	
		
}
