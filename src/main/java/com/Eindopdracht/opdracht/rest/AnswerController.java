package com.Eindopdracht.opdracht.rest;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eindopdracht.opdracht.model.Answer;
import com.Eindopdracht.opdracht.service.AnswerService;
import com.Eindopdracht.opdracht.service.ThesisService;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(path = "/answer")
public class AnswerController {
	private final AnswerService answerService;
		
	
	@Autowired
	public AnswerController(AnswerService answerService, ThesisService thesisService) {
		super();
		this.answerService = answerService;
	}

	@PostMapping("/add/{voterId}")
	public void registerAnswer (@RequestBody Answer answer, @PathVariable long voterId) {
		answerService.registerAnswer(answer, voterId); 
	}
	
	@PostMapping("/add")
	public void registerAnswer (@RequestBody Answer answer) {
		System.out.println("hoi");
		answerService.registerAnswer(answer); 
	}

	@GetMapping ("/list")
	public List<Answer> showAnswers(){
		return answerService.showAnswers();		
	}
	
}
