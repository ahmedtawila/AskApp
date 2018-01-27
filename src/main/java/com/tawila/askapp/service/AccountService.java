package com.tawila.askapp.service;

import org.springframework.stereotype.Service;

import com.tawila.askapp.dto.AccountDTO;
import com.tawila.askapp.model.Account;

@Service
public interface AccountService {
	public void create(AccountDTO accountDTO);

	public Account convertDTOToEntity(AccountDTO accountDTO);
}
