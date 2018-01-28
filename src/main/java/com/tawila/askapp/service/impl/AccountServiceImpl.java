package com.tawila.askapp.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawila.askapp.dto.AccountDTO;
import com.tawila.askapp.model.Account;
import com.tawila.askapp.repository.AccountRepository;
import com.tawila.askapp.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public void create(AccountDTO accountDTO) {
		Account account = new Account();
		BeanUtils.copyProperties(accountDTO, account);
		accountRepository.save(account);
	}
}
