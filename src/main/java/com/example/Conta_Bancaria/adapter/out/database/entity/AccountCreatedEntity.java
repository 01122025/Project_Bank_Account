package com.example.Conta_Bancaria.adapter.out.database.entity;


import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class
AccountCreatedEntity {

    private Long idAccount;
    private Integer agency;
    private Double balance;
    private TypeAccount typeAccount;
    private LocalDateTime createdAt;

// relacionamento entre as entiades
    private CreatedAccountEntity AccountHolder;
}
