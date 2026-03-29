package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.AccountCreatedEntity;
import com.example.Conta_Bancaria.adapter.out.database.entity.CreatedAccountEntity;
import com.example.Conta_Bancaria.adapter.out.database.repository.AccountJpaRepository;
import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class CreatedAccountOut implements CreatedAccountRepository {

    private AccountJpaRepository accountJpaRepository;


    @Override
    public void createdAccount(AccountDTO accountDTO) {
        AccountCreatedEntity accountEntity = new AccountCreatedEntity();
        accountEntity.setIdAccount(accountDTO.getId());
        accountEntity.setAgency(accountDTO.getAgency());
        accountEntity.setBalance(accountDTO.getBalance());
        accountEntity.setTypeAccount(accountDTO.getAccountType());
        accountEntity.setCreatedAt(LocalDateTime.now());
        accountEntity.setAccountHolder(new CreatedAccountEntity(accountDTO.getAccountHolderDTO().getName(), accountDTO.getAccountHolderDTO().getDocumentID(), accountDTO.getAccountHolderDTO().getId()));

        accountJpaRepository.save(accountEntity);

    }

    @Override
    public boolean existsAccount(AccountDTO accountDTO) {
        return false;
    }
}
