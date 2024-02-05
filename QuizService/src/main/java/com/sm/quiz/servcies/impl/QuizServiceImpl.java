package com.sm.quiz.servcies.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.quiz.entities.Quiz;
import com.sm.quiz.repositories.QuizRepository;
import com.sm.quiz.servcies.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public Quiz add(Quiz quiz) {
		
		 
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		return quizRepository.findAll();
	}

	@Override
	public Quiz get(Long id) {
		return quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found!")); 
	}

}
