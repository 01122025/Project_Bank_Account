package com.example.Conta_Bancaria.application.service;

import com.example.Conta_Bancaria.shared.dto.AccountDTO;

public interface CreatedAccountRepository {
    void createdAccount(AccountDTO accountDTO);
     boolean existsAccount(AccountDTO accountDTO);
}
