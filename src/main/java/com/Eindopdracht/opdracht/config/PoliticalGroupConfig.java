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
			PoliticalGroup pvda = new PoliticalGroup("pvda", PoliticalGroupAlignment.LINKS);
			//pvda.addMember(new Candidate("Lilianne", "Ploumen", LocalDate.of(1962, 7, 12)));
			//pvda.addMember(new Candidate("Khadija", "Arib", LocalDate.of(1960, 10, 10)));
			//pvda.setMembers(new Candidate());
			
			ArrayList<String> tempList = new ArrayList<String>();
			tempList.add("test1");
			tempList.add("test2");
			pvda.setTestList(tempList);
			
			ArrayList<Candidate> pvvMembers = new ArrayList<Candidate>();
			pvvMembers.add(new Candidate("Geert", "Wilders", LocalDate.of(1963, 9, 6)));
			pvvMembers.add(new Candidate("Khadija", "Arib", LocalDate.of(1976, 9, 16)));
			PoliticalGroup pvv = new PoliticalGroup("pvv", PoliticalGroupAlignment.RECHTS);
			
			politicalGroupRepository.saveAll(List.of(pvda, pvv));
		};
	}
}
