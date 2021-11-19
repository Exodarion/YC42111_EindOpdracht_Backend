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
import com.Eindopdracht.opdracht.repository.PoliticalGroupRepository;

@Configuration
public class PoliticalGroupConfig {
	@Bean
	CommandLineRunner commandLineRunner2(PoliticalGroupRepository politicalGroupRepository) 
	{
		return args -> 
		{
			ArrayList<Candidate> pvdaMembers = new ArrayList<Candidate>();
			pvdaMembers.add(new Candidate("Lilianne", "Ploumen", LocalDate.of(1962, 7, 12)));
			pvdaMembers.add(new Candidate("Khadija", "Arib", LocalDate.of(1960, 10, 10)));
			PoliticalGroup pvda = new PoliticalGroup("pvda", new ArrayList<Candidate>(), PoliticalGroupAlignment.LINKS);
			//pvda.getMembers().toString();
			
			ArrayList<Candidate> pvvMembers = new ArrayList<Candidate>();
			pvvMembers.add(new Candidate("Geert", "Wilders", LocalDate.of(1963, 9, 6)));
			pvvMembers.add(new Candidate("Khadija", "Arib", LocalDate.of(1976, 9, 16)));
			PoliticalGroup pvv = new PoliticalGroup("pvv", new ArrayList<Candidate>(), PoliticalGroupAlignment.RECHTS);
			
			politicalGroupRepository.saveAll(List.of(pvda, pvv));
		};
	}
}
