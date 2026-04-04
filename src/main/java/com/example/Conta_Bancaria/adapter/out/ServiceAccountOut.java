package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.AccountCreatedEntity;
import com.example.Conta_Bancaria.adapter.out.database.entity.CreatedAccountEntity;
import com.example.Conta_Bancaria.adapter.out.database.repository.AccountJpaRepository;
import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import com.example.Conta_Bancaria.shared.dto.AccountHolderDTO;
import org.springframework.stereotype.Component;


@Component
public class ServiceAccountOut implements AccountServiceRepository {

    private AccountJpaRepository accountJpaRepository;
    @Override
    public void depositAcount(AccountDTO accountDTO) {

        AccountCreatedEntity accountCreatedEntity = new AccountCreatedEntity();
        accountCreatedEntity.setTypeAccount(accountDTO.getTypeAccount());
        accountCreatedEntity.setBalance(accountDTO.getBalance());
        accountCreatedEntity.setIdAccount(accountDTO.getId());
        accountCreatedEntity.setCreatedAt(accountDTO.getCreatedAt());
        accountCreatedEntity.setAgency(accountDTO.getAgency());
        accountCreatedEntity.setAccountHolder(new CreatedAccountEntity(
                accountDTO.getAccountHolderDTO().getId(),
                accountCreatedEntity.getAccountHolder().getName(),
                accountCreatedEntity.getAccountHolder().getDocumentCpf(),
                accountCreatedEntity.getAccountHolder().getEmail()
                ));


        accountJpaRepository.save(accountCreatedEntity);

    }

    @Override
    public void withdrawAcount(AccountDTO accountDTO) {

    }
}

