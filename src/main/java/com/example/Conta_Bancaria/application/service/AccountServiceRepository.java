package com.example.Conta_Bancaria.application.service;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface AccountServiceRepository {

    void depositAcount(Long id, BigDecimal amount);
    void withdrawAcount(Long id, BigDecimal amount);

}
