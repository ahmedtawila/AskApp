package com.tawila.askapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawila.askapp.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
