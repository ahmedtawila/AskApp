package com.tawila.askapp.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tawila.askapp.dto.AccountDTO;
import com.tawila.askapp.form.AccountForm;
import com.tawila.askapp.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity create(@RequestBody AccountForm accountForm) {
		AccountDTO accountDTO = new AccountDTO();
		BeanUtils.copyProperties(accountForm, accountDTO);
		accountDTO.setCreationDate(new Date());

		accountService.create(accountDTO);
		return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
	}
}
