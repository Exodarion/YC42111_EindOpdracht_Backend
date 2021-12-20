package com.Eindopdracht.opdracht.dto;

import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.model.PoliticalGroupAlignment;

public class PoliticalGroupDTO 
{
	private Long id;
	private String name;
	PoliticalGroupAlignment pga;
	 
	PoliticalGroupDTO(){}
	public PoliticalGroupDTO(PoliticalGroup pg)
	{
		this.id = pg.getId();
		this.name = pg.getName();
		this.pga = pg.getPga();
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
	public PoliticalGroupAlignment getPga() {
		return pga;
	}
	public void setPga(PoliticalGroupAlignment pga) {
		this.pga = pga;
	}
}
