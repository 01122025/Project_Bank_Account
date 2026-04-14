package com.example.Conta_Bancaria.adapter.out;

import com.example.Conta_Bancaria.adapter.out.database.entity.CreatedAccountEntity;
import com.example.Conta_Bancaria.adapter.out.database.repository.CreatedAccountJpaRepository;
import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import com.example.Conta_Bancaria.shared.dto.AccountHolderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CreatedAccountOut implements CreatedAccountRepository {

    private final CreatedAccountJpaRepository createdAccountJpaRepository;


    @Override
    public void createdAccount(AccountHolderDTO accountHolderDTO) {
        if (!createdAccountJpaRepository.existsById(accountHolderDTO.getId())) {
            CreatedAccountEntity createdAccountEntity = new CreatedAccountEntity();
            createdAccountEntity.setIdHolder(accountHolderDTO.getId());
            createdAccountEntity.setName(accountHolderDTO.getName());
            createdAccountEntity.setDocumentID(accountHolderDTO.getDocumentID());
            createdAccountEntity.setEmail(accountHolderDTO.getEmail());
            createdAccountJpaRepository.save(createdAccountEntity);
        }

    }

    @Override
    public boolean existsAccount(AccountHolderDTO accountHolderDTO) {
        return false;
    }
}
