package com.Eindopdracht.opdracht.rest;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.service.VoterService;

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
	
	@PostMapping ("/add")
	public void registerNewVoter(@RequestBody Voter voter) {
		voterService.addNewVoter(voter);
	}

}
