package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.AccountCreatedEntity;
import com.example.Conta_Bancaria.adapter.out.database.repository.AccountJpaRepository;
import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class ServiceAccountOut implements AccountServiceRepository {

    private final AccountJpaRepository accountJpaRepository;

    public ServiceAccountOut(AccountJpaRepository accountJpaRepository) {
        this.accountJpaRepository = accountJpaRepository;
    }

    @Override
    public void depositAcount(AccountDTO accountDTO) {
        AccountCreatedEntity accountCreatedEntity = accountJpaRepository.findById(accountDTO.getId()).orElseThrow(() -> new RuntimeException("Account not found"));
        accountCreatedEntity.setBalance(accountDTO.getBalance());
        accountJpaRepository.save(accountCreatedEntity);
    }
    @Override
    public void withdrawAcount(AccountDTO accountDTO) {
        AccountCreatedEntity accountCreatedEntity = accountJpaRepository.findById(accountDTO.getId()).orElseThrow(() -> new RuntimeException("Account not found"));
        accountCreatedEntity.setBalance(accountDTO.getBalance());
        accountJpaRepository.save(accountCreatedEntity);
    }
}
