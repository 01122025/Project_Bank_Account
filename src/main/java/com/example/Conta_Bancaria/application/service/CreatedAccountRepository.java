package com.example.Conta_Bancaria.application.service;

import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import com.example.Conta_Bancaria.shared.dto.AccountHolderDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatedAccountRepository {
    void createdAccount(AccountHolderDTO accountHolderDTO);
     boolean existsAccount(AccountHolderDTO accountHolderDTO);
}
