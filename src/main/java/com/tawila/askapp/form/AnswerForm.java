package com.tawila.askapp.form;

import java.io.Serializable;
import java.util.Date;

public class AnswerForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3991890772604730080L;

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
