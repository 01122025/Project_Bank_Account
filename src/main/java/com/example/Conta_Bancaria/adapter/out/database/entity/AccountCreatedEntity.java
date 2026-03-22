package com.example.Conta_Bancaria.adapter.out.database.entity;


import com.example.Conta_Bancaria.shared.dto.AccountHolderDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountCreatedEntity {

    private Long idAccount;
    private Integer agency;
    private Double balance;
    private String typeAccount;
    private LocalDateTime createdAt;

// relacionamento entre as entiades
    private CreatedAccountEntity AccountHolder;
}
