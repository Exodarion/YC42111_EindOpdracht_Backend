package com.Eindopdracht.opdracht.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class PoliticalGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "politicalGroup")
    private List<Candidate> members;

    @Enumerated(EnumType.STRING)
    PoliticalGroupAlignment pga;

    @OneToMany
    private List<Answer> answers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Candidate> getMembers() {
        return members;
    }

    public void setMembers(List<Candidate> members) {
        this.members = members;
    }

    public PoliticalGroupAlignment getPga() {
        return pga;
    }

    public void setPga(PoliticalGroupAlignment pga) {
        this.pga = pga;
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
