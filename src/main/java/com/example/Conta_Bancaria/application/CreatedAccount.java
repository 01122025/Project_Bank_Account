package com.example.Conta_Bancaria.application;

import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import org.springframework.stereotype.Component;

@Component
public class CreatedAccount {

    private final CreatedAccountRepository createdAccountRepository;

    public CreatedAccount(CreatedAccountRepository createdAccountRepository) {
        this.createdAccountRepository = createdAccountRepository;
    }

    public void createdAccount(AccountDTO accountDTO){
        try {
            if (createdAccountRepository.existsAccount(accountDTO)){
                throw new Exception("Account already exists");
            }
            createdAccountRepository.createdAccount(accountDTO);

        }catch(Exception e){

            e.printStackTrace();
        }

    }


}
