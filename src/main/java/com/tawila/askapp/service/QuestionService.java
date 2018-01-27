package com.tawila.askapp.service;

import com.tawila.askapp.dto.QuestionDTO;
import com.tawila.askapp.model.Question;

public interface QuestionService {

	public Question ask(QuestionDTO questionDTO);
}
