package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountHolderDTO;


public class CreatedAccount {

    private final CreatedAccountRepository createdAccountRepository;


    public CreatedAccount(CreatedAccountRepository createdAccountRepository) {
        this.createdAccountRepository = createdAccountRepository;
    }

    public void createAccount(AccountHolderDTO  accountHolderDTO) {
        createdAccountRepository.createdAccount(accountHolderDTO);
    }

}
