package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.CreatedAccountEntity;
import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class ServiceCreatedAccount implements CreatedAccountRepository {


    private CreatedAccountEntity createdAccountEntity;

    @Override
    public void createdAccount(AccountDTO accountDTO) {

    }

    @Override
    public boolean existsAccount(AccountDTO accountDTO) {
        return false;
    }
}
