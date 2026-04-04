package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import org.springframework.stereotype.Component;


@Component
public class CreatedAccountOut implements CreatedAccountRepository {

    @Override
    public void createdAccount(AccountDTO accountDTO) {

    }

    @Override
    public boolean existsAccount(AccountDTO accountDTO) {
        return false;
    }
}
