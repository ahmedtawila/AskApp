package com.tawila.askapp.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tawila.askapp.dto.QuestionDTO;
import com.tawila.askapp.form.QuestionForm;
import com.tawila.askapp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@SuppressWarnings("rawtypes")
	@RequestMapping("/ask")
	public ResponseEntity ask(@RequestBody QuestionForm questionForm) {
		QuestionDTO questionDTO = new QuestionDTO();
		BeanUtils.copyProperties(questionForm, questionDTO);
		questionDTO.setCreationDate(new Date());

		questionService.ask(questionDTO);
		return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
	}
}
