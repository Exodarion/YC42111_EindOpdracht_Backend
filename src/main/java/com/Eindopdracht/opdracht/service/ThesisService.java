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


	public List<Thesis> showThesises() {
		return thesisRepository.findAll();
	}
	
	public Optional<Thesis> findById(long id){
		return thesisRepository.findById(id);
	}
	
	public void removeThesis(long id) {
		thesisRepository.deleteById(id);
		
	}
	
		
	public void changeThesis(long id, String question) {
		thesisRepository.getById(id).setQuestion(question);
		thesisRepository.save(thesisRepository.getById(id));
	}

	
	/* mooier zou zijn via id evt via onderstaand? **Eva**
	 * public void changeThesis(Long id){
	 * thesisToChange = thesisRepository.getOne(id);
	 * thesisToChange.setQuestion(thesisDto.getName); ??? waarom hier dan een get vanuit dto moet komen
	 * thesisRepository.save(thesisToChange);
	 * */
	 
}
