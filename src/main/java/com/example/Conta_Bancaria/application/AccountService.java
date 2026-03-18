package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;


public class AccountService {
    private final AccountServiceRepository accountServiceRepository;

    private TransactionService transactionService;

    public AccountService(AccountDTO accountDTO, AccountServiceRepository accountServiceRepository) {
        this.accountServiceRepository = accountServiceRepository;

    }

    public void depositAcount(Long id, Double amount) {

        accountServiceRepository.depositAcount(id, amount);

    }

    public void withdrawAcount(Long id, Double amount) {
        accountServiceRepository.withdrawAcount(id, amount);
    }

}
