package com.Eindopdracht.opdracht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.Eindopdracht.opdracht.repository.ThesisRepository;
import com.Eindopdracht.opdracht.service.ThesisService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Voter {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate dob;

    @Column(nullable = false)
    private String email;

    private String residence;
    
    
    @OneToMany
    private List <Answer> answers;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
}
