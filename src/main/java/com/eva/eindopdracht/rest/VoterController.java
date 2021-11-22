//package com.eva.eindopdracht.rest;
//
//import com.eva.eindopdracht.model.Voter;
//import com.eva.eindopdracht.service.VoterService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(maxAge = 3600)
//@RestController
//@RequestMapping(path = "/voter")
//public class VoterController {
//    private final VoterService voterService;
//
//    @Autowired
//    public VoterController(VoterService voterService) {
//        this.voterService = voterService;
//    }
//
//    @GetMapping (path = "/list")
//    public List<Voter> getVoters(){
//        return voterService.getVoters();
//
//    }
//
//    @PostMapping("/add")
//    public void registerNewVoter(@RequestBody Voter voter) {
//        voterService.addNewVoter(voter);
//    }
//
//}