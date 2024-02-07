package com.sm.question.services;

import java.util.List;

import com.sm.question.entities.Question;

public interface QuestionService {
	
	Question add(Question question);
	
	Question get(Long id);
	
	List<Question> getAll();
	
	List<Question> getByQuizId(Long quizId);
}
