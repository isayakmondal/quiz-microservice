package com.sm.question.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.question.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}