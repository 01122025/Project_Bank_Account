package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;

public class CreatedAccount {

    private final CreatedAccountRepository createdAccountRepository;

    public CreatedAccount(CreatedAccountRepository createdAccountRepository) {
        this.createdAccountRepository = createdAccountRepository;
    }

    void createdAccount(AccountDTO accountDTO){
         createdAccountRepository.createdAccount(accountDTO);
    };

}
