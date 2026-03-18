package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class AccountCreated implements AccountServiceRepository {
    @Override
    public void depositAcount(Long id, Double amount) {

    }

    @Override
    public void withdrawAcount(Long id, Double amount) {

    }
}
