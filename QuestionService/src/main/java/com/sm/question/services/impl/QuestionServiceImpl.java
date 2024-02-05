package com.sm.question.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.question.entities.Question;
import com.sm.question.repositories.QuestionRepository;
import com.sm.question.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question add(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Question get(Long id) {
		return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question Not Found!"));
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	}

}
