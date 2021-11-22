//package com.Eindopdracht.opdracht.config;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.Eindopdracht.opdracht.model.Voter;
//import com.Eindopdracht.opdracht.repository.VoterRepository;
//
//@Configuration
//public class VoterConfig {
//	@Bean
//	CommandLineRunner commandLineRunner(VoterRepository repository) {
//		return args -> {
//			Voter piet = new Voter("Piet", "Puk", LocalDate.of(1980, 8, 14), "piet@email.com", "Amsterdam");
//		
//			Voter jan = new Voter("Jan", "Smit", LocalDate.of(1988, 8, 4), "jan@email.com", "Rotterdam");
//		
//		repository.saveAll(List.of(piet, jan));
//	};
//	}
//}
