package com.sm.question.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.question.entities.Question;
import com.sm.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping("{id}")
	public Question get(@PathVariable Long id) {
		return questionService.get(id);
	}

	@GetMapping
	public List<Question> getAll() {
		return questionService.getAll();
	}

	@PostMapping
	public Question add(@RequestBody Question question) {
		return questionService.add(question);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getByQuizId(@PathVariable Long quizId){
		return questionService.getByQuizId(quizId);
	}

}
