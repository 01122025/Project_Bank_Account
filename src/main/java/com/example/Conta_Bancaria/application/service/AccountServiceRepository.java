package com.example.Conta_Bancaria.application.service;

import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface AccountServiceRepository {

    void depositAcount(AccountDTO accountDTO);
    void withdrawAcount(AccountDTO accountDTO);

}
