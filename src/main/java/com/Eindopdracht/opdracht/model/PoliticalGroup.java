package com.Eindopdracht.opdracht.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = false)
    private Long id;
	
	private String name = "placeholder";
	
	@OneToMany(mappedBy = "politicalParty")
	private List<Candidate> members;
	
	PoliticalGroupAlignment pga = PoliticalGroupAlignment.MIDDEN;
	
	public PoliticalGroup(){}
	public PoliticalGroup(String name, PoliticalGroupAlignment pga){
		this.name = name;
		this.pga = pga;
	}
	
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
	
	public PoliticalGroupAlignment getpga() {
		return pga;
	}
	public void setpga(PoliticalGroupAlignment alignment) {
		pga = alignment;
	}
	
	
   @Override
    public String toString() 
   {
        return "PoliticalGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pga='" + pga + '\'' +
                '}';
    }

}
