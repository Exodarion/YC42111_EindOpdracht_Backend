package com.Eindopdracht.opdracht.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	@DeleteMapping(path = "/remove/{id}")
	public void removeThesis(@RequestBody long id) {
		if (thesisService.findById(id).isPresent()) {
			thesisService.removeThesis(id);
		} 
			
	}
	
	@PutMapping(path = "/change/{id}/{question}")
	public void changeThesis(@RequestBody long id, String question) {
		if (thesisService.findById(id).isPresent()) {
			thesisService.changeThesis(id, question);
		}
	}
	
//	@PostMapping(path = "/remove/{id}")
//	public void removeThesis(@RequestBody long id) {
//		Optional<Thesis> thesis = thesisService.findById(id);
//		if (thesis.isPresent())
//			thesisService.removeThesis(id);
//		
//	}
//	
//	@PostMapping (path = /change/{id}{question})
//	
////	
//	@PostMapping(path = "/change")
//		public void changeThesis(@RequestBody Thesis thesis) {
//		thesisService.changeThesis(thesis);
//	}
//	
	

}
