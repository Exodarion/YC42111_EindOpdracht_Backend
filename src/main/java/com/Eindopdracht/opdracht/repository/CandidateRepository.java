package com.Eindopdracht.opdracht.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eindopdracht.opdracht.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

}
