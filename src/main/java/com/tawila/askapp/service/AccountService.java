package com.tawila.askapp.service;

import org.springframework.stereotype.Service;

import com.tawila.askapp.dto.AccountDTO;

@Service
public interface AccountService {
	public void create(AccountDTO accountDTO);
}
