package com.Eindopdracht.opdracht.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
	//Return a list of candidates by giving the political group of the Candidate
	List<Candidate> findByPoliticalGroup (PoliticalGroup politicalGroup);
	
	//Return a candidate by giving the first name of the Candidate
	Optional<Candidate> findByFirstName (String firstName);
}
