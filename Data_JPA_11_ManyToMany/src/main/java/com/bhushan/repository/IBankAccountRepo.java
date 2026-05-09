package com.bhushan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.entity.BankAccount;

public interface IBankAccountRepo extends JpaRepository<BankAccount, Long> {

}
