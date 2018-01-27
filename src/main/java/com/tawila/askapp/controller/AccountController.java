package com.tawila.askapp.controller;

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
		AccountDTO accountDTO = convertAccountFormToDTO(accountForm);

		accountService.create(accountDTO);
		return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
	}

	public AccountDTO convertAccountFormToDTO(AccountForm accountForm) {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setBirthday(accountForm.getBirthday());
		accountDTO.setEmail(accountForm.getEmail());
		accountDTO.setFullname(accountForm.getFullname());
		accountDTO.setGender(accountForm.getGender());
		accountDTO.setLanguage(accountForm.getLanguage());
		accountDTO.setPassword(accountForm.getPassword());
		accountDTO.setUsername(accountForm.getUsername());
		return accountDTO;
	}
}
