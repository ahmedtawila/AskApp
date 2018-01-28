package com.tawila.askapp.service.impl;

import org.springframework.beans.BeanUtils;
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
		Question question = new Question();
		BeanUtils.copyProperties(questionDTO, question);
		return questionRepository.save(question);
	}
}
