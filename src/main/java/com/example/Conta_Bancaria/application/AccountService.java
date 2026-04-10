package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;

import java.util.logging.Logger;


public class AccountService {

    Logger logger = Logger.getLogger(AccountService.class.getName());

    private final AccountServiceRepository accountServiceRepository;

    public AccountService(AccountServiceRepository accountServiceRepository) {
        this.accountServiceRepository = accountServiceRepository;
    }

    public void deposit (AccountDTO accountDTO, Double amount) {
        try {
            if(amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }

            double newBalance = accountDTO.getBalance() + amount;
            accountDTO.setBalance(newBalance);
            accountServiceRepository.depositAcount(accountDTO);

        }catch (IllegalArgumentException e) {
             logger.info(e.getMessage());

        }
    }


    public void withdraw (AccountDTO accountDTO, Double amount) {
        try{
            if(amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }

            if (amount > accountDTO.getBalance()) {
                throw new IllegalArgumentException("Insufficient balance");
            }

            double newBalance = accountDTO.getBalance() - amount;
            accountDTO.setBalance(newBalance);
            accountServiceRepository.withdrawAcount(accountDTO);

        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }


}
