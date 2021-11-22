package com.Eindopdracht.opdracht.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eindopdracht.opdracht.model.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Long>{

}
