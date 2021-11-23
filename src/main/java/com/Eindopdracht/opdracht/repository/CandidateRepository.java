package com.Eindopdracht.opdracht.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;



public interface CandidateRepository extends JpaRepository<Candidate, Long> {
	List<Candidate> findByPoliticalGroup (PoliticalGroup politicalGroup);
	Optional<Candidate> findByFirstName (String firstName);
}
