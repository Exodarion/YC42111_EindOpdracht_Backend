package com.Eindopdracht.opdracht.service;

import com.Eindopdracht.opdracht.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdviceService {

    @Autowired
    private VoterService voterService;

    @Autowired
    private PoliticalGroupService politicalGroupService;

    public Map<String, Long> getVotingAdvice(Long id) {
        Voter voter = voterService.getOne(id);
        List<Answer> voterAnswers = voter.getAnswers();

        List<PoliticalGroup> politicalGroups = politicalGroupService.getPoliticalGroups();

        Map<String, List<Integer>> differences = new HashMap<>();

        for (PoliticalGroup group : politicalGroups) {
            differences.put(group.getName(), new ArrayList<>());
        }

        for (List<Integer> integers : differences.values()) {
            integers.add(0, 0);
            integers.add(1, 0);
        }

        for (Answer voterAnswer : voterAnswers) {
            if (voterAnswer.getAnswerThesis() != AnswersThesis.GEENMENING) {
                for (PoliticalGroup group : politicalGroups) {
                    for (Answer politicalGroupAnswer : group.getAnswers()) {
                        if (politicalGroupAnswer.getAnswerThesis() != AnswersThesis.GEENMENING)
                            if (voterAnswer.getThesis() == politicalGroupAnswer.getThesis()) {
                                int a = differences.get(group.getName()).get(0);
                                a++;
                                differences.get(group.getName()).set(0, a);
                                int previousDifference = differences.get(group.getName()).get(1);
                                int difference = previousDifference +
                                        (Math.abs(voterAnswer.getAnswerThesis().ordinal() - politicalGroupAnswer.getAnswerThesis().ordinal()));
                                differences.get(group.getName()).set(1, difference);
                            }
                    }
                }
            }
        }
        Map<String, Long> results = new HashMap<>();
        for (String key : differences.keySet()) {
            double value1 = differences.get(key).get(0);
            double value2 = differences.get(key).get(1);
            double percentage = 1 - (value2 / 4) / value1;
            long perc = Math.round(percentage * 100);
            if (differences.get(key).get(0) > 0) {
                results.put(key, perc);
            }
        }

        return results;
    }
}
