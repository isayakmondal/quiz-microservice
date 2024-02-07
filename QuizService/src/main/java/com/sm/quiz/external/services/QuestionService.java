package com.sm.quiz.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sm.quiz.entities.Question;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionService {

	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);

}
