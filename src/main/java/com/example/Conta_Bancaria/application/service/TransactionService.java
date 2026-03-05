package com.example.Conta_Bancaria.application.service;

import com.example.Conta_Bancaria.shared.dto.AccountDTO;

public interface TransactionService {

    void accountexist(AccountDTO  accountDTO);

    void checkBalance(AccountDTO accountDTO);
}
