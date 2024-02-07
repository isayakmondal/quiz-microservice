package com.sm.quiz.servcies.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.quiz.entities.Quiz;
import com.sm.quiz.external.services.QuestionService;
import com.sm.quiz.repositories.QuizRepository;
import com.sm.quiz.servcies.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionService questionService;

	@Override
	public Quiz add(Quiz quiz) {
		
		 
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		List<Quiz> quizzes = quizRepository.findAll(); 
//		List<Quiz> updatedQuizzes = quizzes.stream().map(quiz -> {
//			quiz.setQuestions(questionService.getQuestionsOfQuiz(quiz.getId()));
//			return quiz;
//		}).toList();
		
		quizzes.forEach(quiz -> {
			quiz.setQuestions(questionService.getQuestionsOfQuiz(quiz.getId()));
		});
		
		return quizzes;
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz = quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found!"));
		quiz.setQuestions(questionService.getQuestionsOfQuiz(quiz.getId()));
		return quiz; 
	}

}
