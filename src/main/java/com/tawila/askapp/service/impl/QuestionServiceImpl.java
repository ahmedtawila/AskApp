package com.tawila.askapp.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawila.askapp.dto.QuestionDTO;
import com.tawila.askapp.model.Question;
import com.tawila.askapp.repository.QuestionRepository;
import com.tawila.askapp.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question ask(QuestionDTO questionDTO) {
		return questionRepository.save(convertDTOToEntity(questionDTO));
	}

	public Question convertDTOToEntity(QuestionDTO questionDTO) {
		Question question = new Question();
		question.setAskedId(questionDTO.getAskedId());
		question.setAskerId(questionDTO.getAskerId());
		question.setDetails(questionDTO.getDetails());
		question.setCreationDate(new Date());
		return question;
	}
}
