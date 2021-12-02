package com.Eindopdracht.opdracht.service;

import java.util.List;

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


	public List<Thesis> showThesises() {
		return thesisRepository.findAll();
	}
}
