package com.sm.quiz.servcies;

import java.util.List;

import com.sm.quiz.entities.Quiz;


public interface QuizService {

	Quiz add(Quiz quiz);
	
	List<Quiz> getAll();
	
	Quiz get(Long id); 
}
