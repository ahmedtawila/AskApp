package com.tawila.askapp.dto;

import java.io.Serializable;
import java.util.Date;

public class AnswerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5824965209876149948L;

	private Long questionId;
	private String details;
	private Date creationDate;

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
