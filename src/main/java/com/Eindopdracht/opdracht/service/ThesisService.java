package com.Eindopdracht.opdracht.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Eindopdracht.opdracht.model.Thesis;
import com.Eindopdracht.opdracht.repository.ThesisRepository;

@Service
public class ThesisService {
	
	private final ThesisRepository thesisRepository;

	@Autowired
	public ThesisService(ThesisRepository thesisRepository) {
		super();
		this.thesisRepository = thesisRepository;
	}
	
	public void registerThesis(Thesis thesis) {
		thesisRepository.save(thesis);
	}


	public List<Thesis> getThesises() {
		return thesisRepository.findAll();
	}
	
	public Optional<Thesis> findById(long id){
		return thesisRepository.findById(id);
	}
	
	public void removeThesis(long id) {
		if (thesisRepository.existsById(id)) {
			thesisRepository.deleteById(id);
		} else
			System.out.println("User not found by id:" + id);		
	}
	
	public void updateThesis(long id, String question) {
		// zoek het object
		Optional<Thesis> optionalThesis = thesisRepository.findById(id);
		if (optionalThesis.isPresent()) {
			// pas velden aan
			Thesis thesis = optionalThesis.get();
			thesis.setQuestion(question);
			
			// sla thesis op
			thesisRepository.save(thesis);
			
			System.out.println("Thesis updated");
		} else {
			System.out.println("Thesis not found with id: " + id);
		}
	}



//	public Thesis showOneThesis(long id) {
//		
//		Optional<Thesis> optionalThesis = thesisRepository.findById(id);
//		if (optionalThesis.isPresent()) {
//			Thesis thesis = optionalThesis.get();
//			return thesis;
//		} else {
//			if (id == -1) {
//				
//			}
//		}
	}
	

