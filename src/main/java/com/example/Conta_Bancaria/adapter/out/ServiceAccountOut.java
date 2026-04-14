package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.AccountCreatedEntity;
import com.example.Conta_Bancaria.adapter.out.database.repository.AccountJpaRepository;
import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ServiceAccountOut implements AccountServiceRepository {

    private final AccountJpaRepository accountJpaRepository;


    @Override
    public void depositAcount(AccountDTO accountDTO) {
        AccountCreatedEntity accountCreatedEntity = new AccountCreatedEntity();
        accountCreatedEntity.setBalance(accountDTO.getBalance());
        accountCreatedEntity.setCreatedAt(accountDTO.getCreatedAt());
        accountJpaRepository.save(accountCreatedEntity);
    }
    @Override
    public void withdrawAcount(AccountDTO accountDTO) {
        AccountCreatedEntity accountCreatedEntity = new AccountCreatedEntity();
        accountCreatedEntity.setBalance(accountDTO.getBalance());
        accountJpaRepository.save(accountCreatedEntity);
    }
}
