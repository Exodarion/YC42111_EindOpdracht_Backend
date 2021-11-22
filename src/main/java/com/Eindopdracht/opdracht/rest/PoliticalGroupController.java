package com.Eindopdracht.opdracht.rest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.model.PoliticalGroupAlignment;
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
	
	@PostMapping ("/add")
	public void registerNewPoliticalGroup(@RequestBody PoliticalGroup politicalGroup) {
		politicalGroupService.addNewPoliticalGroup(politicalGroup);
	}
}
