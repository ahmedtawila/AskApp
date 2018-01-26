package com.tawila.askapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tawila.askapp.form.AccountForm;

@RestController
@RequestMapping("/account")
public class AccountController {

	@RequestMapping("/create")
	public ResponseEntity<AccountForm> create(AccountForm accountForm) {
		System.out.println("DONE!!");
		return null;
	}
}
