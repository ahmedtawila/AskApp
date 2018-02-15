package com.tawila.askapp.form;

import java.io.Serializable;
import java.util.Date;

public class AnswerLikeForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5328217491557185498L;

	private Long likerId;
	private Long answerId;
	private Date creationDate;

	public Long getLikerId() {
		return likerId;
	}

	public void setLikerId(Long likerId) {
		this.likerId = likerId;
	}

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
