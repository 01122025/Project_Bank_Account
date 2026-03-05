package com.example.Conta_Bancaria.application.service;

public interface AccountServiceRepository {

    void depositAcount(Long id, Double amount);
    void withdrawAcount(Long id, Double amount);

}
