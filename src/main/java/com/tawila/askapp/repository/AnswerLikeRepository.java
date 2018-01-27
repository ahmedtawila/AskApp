package com.tawila.askapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawila.askapp.model.AnswerLike;

public interface AnswerLikeRepository extends JpaRepository<AnswerLike, Long> {

}
