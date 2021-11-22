//package com.eva.eindopdracht.service;
//
//import com.eva.eindopdracht.model.Voter;
//import com.eva.eindopdracht.repository.VoterRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class VoterService {
//    private final VoterRepository voterRepository;
//
//    @Autowired
//    public VoterService (VoterRepository voterRepository) {
//        this.voterRepository = voterRepository;
//    }
//
//    public List<Voter> getVoters(){
//        return voterRepository.findAll();
//    }
//
//    public void addNewVoter(Voter voter) {
//        voterRepository.save(voter);
//    }
//
//}
