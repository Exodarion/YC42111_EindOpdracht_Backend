package com.Eindopdracht.opdracht.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		this.thesisService = thesisService;
	}
	
	@PostMapping(path = "/add")
	public void registerThesis(@RequestBody Thesis thesis) {
		thesisService.registerThesis(thesis);
		}
	
	@GetMapping(path = "/list")
	public List<Thesis> showThesises(){
		return thesisService.getThesises();
	}
	
	@GetMapping(path = "/showByOne/{count}")
	public Thesis showFirstThesis(@PathVariable int count) {
		List<Thesis> vragen= thesisService.getThesises();
		if (count == -1) {
			return vragen.get(0);
		} else if (count > 0 && count < vragen.size()) {
			return vragen.get(count);
		} else
			return vragen.get(vragen.size()-1);
		
	}
//	public Thesis showOneThesis(@PathVariable long id) {
//		return thesisService.showOneThesis(id);
//	}
	
	
	
	@DeleteMapping(path = "/remove/{id}")
	public void removeThesis(@PathVariable long id) {
			thesisService.removeThesis(id);		
	}
	
	@PutMapping(path = "/change/{id}")
	public void changeThesis(@RequestBody Thesis thesis, @PathVariable long id) {
		thesisService.updateThesis(id, thesis.getQuestion());
	}
	

}
