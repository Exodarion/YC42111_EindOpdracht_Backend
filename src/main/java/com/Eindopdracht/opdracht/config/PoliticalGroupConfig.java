package com.Eindopdracht.opdracht.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.model.PoliticalGroupAlignment;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.PoliticalGroupRepository;

@Configuration
public class PoliticalGroupConfig {
	@Bean
	CommandLineRunner commandLineRunner2(PoliticalGroupRepository politicalGroupRepository) 
	{
		return args -> 
		{
			PoliticalGroup pvda = new PoliticalGroup("pvda", PoliticalGroupAlignment.LINKS);		
			PoliticalGroup pvv = new PoliticalGroup("pvv", PoliticalGroupAlignment.RECHTS);
			
			politicalGroupRepository.saveAll(List.of(pvda, pvv));
		};
	}
}
