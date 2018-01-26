package com.tawila.askapp.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "email")
	private String email;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "gender")
	private Long gender;
	@Column(name = "language")
	private Long language;
	@Column(name = "creation_date")
	private Date creationDate;
	@Column(name = "creation_time")
	private Timestamp creationTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public Long getLanguage() {
		return language;
	}

	public void setLanguage(Long language) {
		this.language = language;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreation_date(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
}
