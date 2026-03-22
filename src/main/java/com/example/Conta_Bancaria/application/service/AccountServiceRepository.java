package com.example.Conta_Bancaria.application.service;

import java.math.BigDecimal;

public interface AccountServiceRepository {

    void depositAcount(Long id, BigDecimal amount);
    void withdrawAcount(Long id, BigDecimal amount);

}
