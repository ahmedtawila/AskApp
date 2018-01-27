package com.tawila.askapp.dto;

import java.io.Serializable;
import java.util.Date;

public class QuestionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3176297592563591543L;

	private Long askerId;
	private Long askedId;
	private Date creationDate;
	private String details;

	public Long getAskerId() {
		return askerId;
	}

	public void setAskerId(Long askerId) {
		this.askerId = askerId;
	}

	public Long getAskedId() {
		return askedId;
	}

	public void setAskedId(Long askedId) {
		this.askedId = askedId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
