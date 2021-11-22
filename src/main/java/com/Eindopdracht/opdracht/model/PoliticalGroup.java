package com.Eindopdracht.opdracht.model;

import java.util.ArrayList;
import java.util.List;

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
	
	private ArrayList<Voter> members = new ArrayList<Voter>();
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
	
	public ArrayList<Voter> getMembers() {
		return members;
	}
	public void addMember(Voter voter) {
		this.members.add(voter);
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
