package com.tawila.askapp.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawila.askapp.dto.AccountDTO;
import com.tawila.askapp.model.Account;
import com.tawila.askapp.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public void create(AccountDTO accountDTO) {
		Account account = convertDTOToEntity(accountDTO);
		accountRepository.save(account);
	}

	private Account convertDTOToEntity(AccountDTO accountDTO) {
		Account account = new Account();
		account.setBirthday(accountDTO.getBirthday());
		account.setEmail(accountDTO.getEmail());
		account.setFullname(accountDTO.getFullname());
		account.setGender(accountDTO.getGender());
		account.setLanguage(accountDTO.getLanguage());
		account.setPassword(accountDTO.getPassword());
		account.setUsername(accountDTO.getUsername());
		account.setCreationDate(new Date());
		return account;
	}
}
