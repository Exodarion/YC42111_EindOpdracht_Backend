package com.Eindopdracht.opdracht.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.model.Thesis;
import com.Eindopdracht.opdracht.service.ThesisService;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(path = "/thesis")
public class ThesisController {
	private final ThesisService thesisService;
	
	@Autowired
	public ThesisController(ThesisService thesisService) {
		super ();
		this.thesisService = thesisService;
	}
	
	@PostMapping(path = "/add")
	public void registerThesis(@RequestBody Thesis thesis) {
		thesisService.registerThesis(thesis);
	}
	
	@GetMapping(path = "/list")
	public List<Thesis> showThesises(){
		return thesisService.showThesises();
	}
	

}
