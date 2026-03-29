package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.CreatedAccountEntity;
import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class ServiceAccountOut implements AccountServiceRepository {

    private CreatedAccountEntity createdAccountEntity;


    @Override
    public void depositAcount(Long id, BigDecimal amount) {

    }

    @Override
    public void withdrawAcount(Long id, BigDecimal amount) {

    }
}

