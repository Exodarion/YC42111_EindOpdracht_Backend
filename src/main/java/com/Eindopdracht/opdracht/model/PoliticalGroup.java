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

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.Eindopdracht.opdracht.repository.CandidateRepository;

@Entity
@Table
public class PoliticalGroup 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "politicalGroup")
	private List<Candidate> members;
	
	@Enumerated(EnumType.STRING )
	PoliticalGroupAlignment pga;

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
	
	

}
