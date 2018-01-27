package com.tawila.askapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawila.askapp.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
