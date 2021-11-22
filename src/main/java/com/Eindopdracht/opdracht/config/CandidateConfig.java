package com.Eindopdracht.opdracht.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Eindopdracht.opdracht.model.Candidate;
import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.CandidateRepository;
import com.Eindopdracht.opdracht.repository.VoterRepository;

@Configuration
public class CandidateConfig {
	@Bean
	CommandLineRunner commandLineRunnerCandidates (CandidateRepository repository) {
		return args -> {
			Candidate lilianne = new Candidate("Lilianne", "Ploumen", LocalDate.of(1960, 12, 17), "pvda", "cultuur");
			Candidate geert = new Candidate("Geert", "Wilders", LocalDate.of(1962, 3, 17), "pvv", "veiligheid");
			Candidate khadija = new Candidate("Khadija", "Arib", LocalDate.of(1978, 12, 17), "PVDA", "Financien");
		repository.saveAll(List.of(lilianne, geert, khadija));
	};
	}
}
