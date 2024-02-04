package com.sm.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.quiz.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
