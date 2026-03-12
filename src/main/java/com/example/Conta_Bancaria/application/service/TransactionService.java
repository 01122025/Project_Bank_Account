package com.example.Conta_Bancaria.application.service;

import com.example.Conta_Bancaria.shared.dto.AccountDTO;

public interface TransactionService {

    void checkBalance(AccountDTO accountDTO);
    void checkdeposit(AccountDTO accountDTO);
    void checkwithdraw(AccountDTO accountDTO);
}
