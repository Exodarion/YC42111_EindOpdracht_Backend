//package com.eva.eindopdracht.config;
//
//import com.eva.eindopdracht.model.Candidate;
//import com.eva.eindopdracht.repository.CandidateRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class CandidateConfig {
//    @Bean
//    CommandLineRunner commandLineRunnerCandidate (CandidateRepository repository) {
//        return args -> {
//            Candidate lilianne = new Candidate("Lilianne", "Ploumen", LocalDate.of(1960, 12, 17), "PVDA", "Cultuur");
//            Candidate geert = new Candidate("Geert", "Wilders", LocalDate.of(1962, 3, 17), "PVV");
//            Candidate khadija = new Candidate("Khadija", "Arib", LocalDate.of(1978, 12, 17), "PVDA", "Financien");
//            repository.saveAll(List.of(lilianne, geert, khadija));
//        };
//    }
//}