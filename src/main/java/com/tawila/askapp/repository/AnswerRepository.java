package com.tawila.askapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawila.askapp.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
