package com.Eindopdracht.opdracht.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eindopdracht.opdracht.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
