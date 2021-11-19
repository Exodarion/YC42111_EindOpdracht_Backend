package com.Eindopdracht.opdracht.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PoliticalGroup 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = false)
    private Long id;
	
	private String name = "placeholder";
	
	//make this candidate later
	//might want to use List<Candidate> members = new ArrayList<Candidate>();
	private ArrayList<Candidate> members = new ArrayList<Candidate>();
	PoliticalGroupAlignment pga = PoliticalGroupAlignment.MIDDEN;
	
	public PoliticalGroup(){}
	public PoliticalGroup(String name, ArrayList<Candidate> members, PoliticalGroupAlignment pga){
		this.name = name;
		this.members = members;
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
	public ArrayList<Candidate> getMembers() {
		return members;
	}
	public void setPoliticalGroupAlignment(PoliticalGroupAlignment alignment) {
		pga = alignment;
	}
	
   @Override
    public String toString() 
   {
        return "PoliticalGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", members='" + members.toString() + '\'' +
                ", pga='" + pga + '\'' +
                '}';
    }
}
