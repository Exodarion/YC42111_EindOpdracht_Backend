package com.Eindopdracht.opdracht.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eindopdracht.opdracht.model.PoliticalGroup;

@Repository
public interface PoliticalGroupRepository extends JpaRepository<PoliticalGroup, Long> {

}
