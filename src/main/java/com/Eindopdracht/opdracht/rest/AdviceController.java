package com.Eindopdracht.opdracht.rest;

import com.Eindopdracht.opdracht.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/advice")
public class AdviceController {

    @Autowired
    private AdviceService adviceService;

    @GetMapping("/{id}")
    public Map<String, Long>getVotingAdvice(@PathVariable Long id) {
        return adviceService.getVotingAdvice(id);
    }
}
