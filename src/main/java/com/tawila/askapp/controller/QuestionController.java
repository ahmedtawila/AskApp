package com.tawila.askapp.controller;

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
		QuestionDTO questionDTO = convertQuestionFormToDTO(questionForm);

		questionService.ask(questionDTO);
		return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
	}

	public QuestionDTO convertQuestionFormToDTO(QuestionForm questionForm) {
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setAskedId(questionForm.getAskedId());
		questionDTO.setAskerId(questionForm.getAskerId());
		questionDTO.setDetails(questionForm.getDetails());
		return questionDTO;
	}
}
