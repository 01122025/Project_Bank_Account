package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.AccountServiceRepository;

import java.math.BigDecimal;


public class AccountService {
    private final AccountServiceRepository accountServiceRepository;

    private TransactionService transactionService;

    public AccountService(AccountServiceRepository accountServiceRepository) {
        this.accountServiceRepository = accountServiceRepository;

    }

    public void depositAcount(Long id, BigDecimal amount) {
        try{
        if (amount.compareTo(BigDecimal.ZERO)<0){
            throw new RuntimeException();
        }
        accountServiceRepository.depositAcount(id, amount);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void withdrawAcount(Long id, BigDecimal amount) {
            accountServiceRepository.withdrawAcount(id, amount);

    }

}
