package com.example.Conta_Bancaria.application.service;

import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatedAccountRepository {
    void createdAccount(AccountDTO accountDTO);
     boolean existsAccount(AccountDTO accountDTO);
}
