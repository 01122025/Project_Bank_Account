package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;


public class CreatedAccount {

    private final CreatedAccountRepository createdAccountRepository;


    public CreatedAccount(CreatedAccountRepository createdAccountRepository) {
        this.createdAccountRepository = createdAccountRepository;
    }


}
